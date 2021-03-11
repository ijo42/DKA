package ru.ijo42.dka.base;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.ijo42.dka.Armor;
import ru.ijo42.dka.IArmorSpecs;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ArmorBaseItem extends ItemArmor {

    protected static final int POTION_TICKS = 5;

    private final ITextComponent desk;
    @SideOnly(Side.CLIENT)
    private Supplier<ArmorBaseModel> armorModel;
    private final Map<Predicate<EntityPlayer>, PotionEffect> applicablePotions = new HashMap<>();
    private final boolean isRestrictView;
    private int counter = 0;

    public ArmorBaseItem(
            IArmorSpecs specs, EntityEquipmentSlot equipmentSlot
    ) {
        super(specs.getMaterial(), 0, equipmentSlot);
        if (FMLCommonHandler.instance().getSide().isClient()) {
            this.armorModel = specs::getModel;
            this.setRegistryName(specs.getMaterial().getName());
        } else {
            this.setRegistryName(Armor.getResourceLocation(specs.getName()).toString());
        }
        this.setTranslationKey(specs.getName());
        this.desk = specs.getDescription();
        this.isRestrictView = specs.isRestrictView();
        for (IArmorSpecs.Effect x : specs.getRelatedEffects()) {
            this.applicablePotions.put(x.getCondition(), x.getPotion());
        }
    }

    @Nullable
    @Override
    @SideOnly(Side.CLIENT)
    public final net.minecraft.client.model.ModelBiped getArmorModel(
            @Nonnull EntityLivingBase entity,
            @Nonnull ItemStack itemStack,
            @Nonnull EntityEquipmentSlot armorSlot,
            @Nonnull net.minecraft.client.model.ModelBiped defaultArmor
    ) {
        return armorModel.get().applyEntityStats(defaultArmor).applySlot(armorSlot);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(
            @Nonnull ItemStack stack,
            World world,
            List<String> tooltip,
            @Nonnull net.minecraft.client.util.ITooltipFlag flag
    ) {
        tooltip.add(desk.getFormattedText());
    }


    @Override
    public void onArmorTick(@Nonnull final World world, @Nonnull final EntityPlayer player, @Nonnull final ItemStack itemStack) {
        if ((counter = ++counter % POTION_TICKS) == 0) {
            applicablePotions.forEach((cond, eff) -> {
                if (cond.test(player)) {
                    player.addPotionEffect(eff);
                }
            });
        }
    }

    @Nullable
    @Override
    @SideOnly(Side.CLIENT)
    public final String getArmorTexture(
            @Nonnull ItemStack stack,
            @Nonnull Entity entity,
            @Nonnull EntityEquipmentSlot slot,
            @Nonnull String type
    ) {
        return armorModel.get().getTexture();
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        if (getRegistryName() == null) {
            throw new RuntimeException("Init registry name first");
        }
        net.minecraftforge.client.model.ModelLoader
                .setCustomModelResourceLocation(this, 0,
                        new net.minecraft.client.renderer.block.model.ModelResourceLocation(
                                getRegistryName(), "inventory")
                );
    }

    @SideOnly(Side.CLIENT)
    public boolean isRestrictView() {
        return isRestrictView;
    }

}
