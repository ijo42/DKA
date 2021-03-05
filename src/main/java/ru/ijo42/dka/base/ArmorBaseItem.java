package ru.ijo42.dka.base;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class ArmorBaseItem extends ItemArmor {

    private final ArmorBaseModel armorModel;

	public ArmorBaseItem(
            ResourceLocation name, ArmorMaterial material, EntityEquipmentSlot equipmentSlot,
            ArmorBaseModel armorModel) {
		//The Render Index is not required for custom modelled armor, you can just default it to 0
		super(material, 0, equipmentSlot);
		this.armorModel = armorModel;
        this.setRegistryName(name);
	}

	@Nullable
	@Override
	public final ModelBiped getArmorModel(EntityLivingBase entity, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped defaultArmor) {
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
