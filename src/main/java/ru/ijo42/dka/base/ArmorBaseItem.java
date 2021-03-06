package ru.ijo42.dka.base;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.ijo42.dka.IArmorSpecs;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class ArmorBaseItem extends ItemArmor {

    private final ArmorBaseModel armorModel;
    private final ITextComponent desk;

    public ArmorBaseItem(
            IArmorSpecs specs, EntityEquipmentSlot equipmentSlot,
            ArmorBaseModel armorModel
    ) {
        super(specs.getMaterial(), 0, equipmentSlot);
        this.armorModel = armorModel;
        this.setRegistryName(getArmorMaterial().getName());
        this.setTranslationKey(specs.getName());
        this.desk = specs.getDescription();
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(@Nonnull ItemStack stack, World world, List<String> tooltip, @Nonnull ITooltipFlag flag) {
        tooltip.add(desk.getFormattedText());
    }

    @Nullable
    @Override
    public final ModelBiped getArmorModel(
            EntityLivingBase entity,
            ItemStack itemStack,
            EntityEquipmentSlot armorSlot,
            ModelBiped defaultArmor
    ) {
        return armorModel.applyEntityStats(defaultArmor).applySlot(armorSlot);
    }

    @Nullable
    @Override
    public final String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return armorModel.getTexture();
	}

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
