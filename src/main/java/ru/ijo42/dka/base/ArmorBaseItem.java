package ru.ijo42.dka.base;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.ijo42.dka.IArmorSpecs;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class ArmorBaseItem extends ItemArmor {

    private final ArmorBaseModel armorModel;
    private final ITextComponent desk;
    private final static int POTION_TICKS = 5;
    private final Map<Predicate<EntityPlayer>, PotionEffect> applicablePotions = new HashMap<>();
    private int counter = 0;

    public ArmorBaseItem(
            IArmorSpecs specs, EntityEquipmentSlot equipmentSlot,
            ArmorBaseModel armorModel
    ) {
        super(specs.getMaterial(), 0, equipmentSlot);
        this.armorModel = armorModel;
        this.setRegistryName(getArmorMaterial().getName());
        this.setTranslationKey(specs.getName());
        this.desk = specs.getDescription();
        for (IArmorSpecs.Effect x : specs.getRelatedEffects()) {
            applicablePotions.put(x.getCondition(), x.getPotion());
        }
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(@Nonnull ItemStack stack, World world, List<String> tooltip, @Nonnull ITooltipFlag flag) {
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
    public final ModelBiped getArmorModel(
            @Nonnull EntityLivingBase entity,
            @Nonnull ItemStack itemStack,
            @Nonnull EntityEquipmentSlot armorSlot,
            @Nonnull ModelBiped defaultArmor
    ) {
        return armorModel.applyEntityStats(defaultArmor).applySlot(armorSlot);
    }

    @Nullable
    @Override
    public final String getArmorTexture(
            @Nonnull ItemStack stack,
            @Nonnull Entity entity,
            @Nonnull EntityEquipmentSlot slot,
            @Nonnull String type
    ) {
        return armorModel.getTexture();
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        if (getRegistryName() == null) {
            throw new RuntimeException("Init registry name first");
        }
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
