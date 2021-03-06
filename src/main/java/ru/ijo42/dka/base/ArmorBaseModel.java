package ru.ijo42.dka.base;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public abstract class ArmorBaseModel extends ModelBiped {
    protected final ModelRenderer armorHead;
    protected final ModelRenderer armorBody;
    protected final ModelRenderer armorRightArm;
    protected final ModelRenderer armorLeftArm;
    protected final ModelRenderer armorRightLeg;
    protected final ModelRenderer armorLeftLeg;
    protected final ModelRenderer armorRightBoot;
    protected final ModelRenderer armorLeftBoot;

    private final String texture;

    public ArmorBaseModel(int textureWidth, int textureHeight, ResourceLocation texture){
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;
        this.texture = texture.toString();

        armorHead = new ModelRenderer(this);
        armorHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(armorHead);

        armorBody = new ModelRenderer(this);
        armorBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addChild(armorBody);
        armorRightArm = new ModelRenderer(this);
        armorRightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightArm.addChild(armorRightArm);

        armorLeftArm = new ModelRenderer(this);
        armorLeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftArm.addChild(armorLeftArm);

        armorRightLeg = new ModelRenderer(this);
        armorRightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightLeg.addChild(armorRightLeg);

        armorLeftLeg = new ModelRenderer(this);
        armorLeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftLeg);


        armorRightBoot = new ModelRenderer(this);
        armorRightBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightLeg.addChild(armorRightBoot);

        armorLeftBoot = new ModelRenderer(this);
        armorLeftBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftBoot);

        setupArmorParts();
    }

    public abstract void setupArmorParts();

    public final String getTexture(){
        return this.texture;
    }

    /**
     * Feel free to override this method as needed.
     * It's just required to hide chestplate parts depending on the equipment slot
     */
    public ModelBiped applySlot(EntityEquipmentSlot slot){
        armorHead.isHidden = true;
        armorBody.isHidden = true;
        armorRightArm.isHidden = true;
        armorLeftArm.isHidden = true;
        armorRightLeg.isHidden = true;
        armorLeftLeg.isHidden = true;
        armorRightBoot.isHidden = true;
        armorLeftBoot.isHidden = true;

        switch(slot){
            case HEAD:
                armorHead.isHidden = false;
                break;
            case CHEST:
                armorBody.isHidden = false;
                armorRightArm.isHidden = false;
                armorLeftArm.isHidden = false;
                break;
            case LEGS:
                armorRightLeg.isHidden = false;
                armorLeftLeg.isHidden = false;
                break;
            case FEET:
                armorRightBoot.isHidden = false;
                armorLeftBoot.isHidden = false;
                break;
            default:
                break;
        }

        return this;
    }

    public final ArmorBaseModel applyEntityStats(ModelBiped defaultArmor){
        this.isChild = defaultArmor.isChild;
        this.isSneak = defaultArmor.isSneak;
        this.isRiding = defaultArmor.isRiding;
        this.rightArmPose = defaultArmor.rightArmPose;
        this.leftArmPose = defaultArmor.leftArmPose;

        return this;
    }

    @Override
    public final void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);

        copyModelAngles(this.bipedHead, this.armorHead);
        copyModelAngles(this.bipedBody, this.armorBody);
        copyModelAngles(this.bipedRightArm, this.armorRightArm);
        copyModelAngles(this.bipedLeftArm, this.armorLeftArm);
        copyModelAngles(this.bipedRightLeg, this.armorRightLeg);
        copyModelAngles(this.bipedLeftLeg, this.armorLeftLeg);
        copyModelAngles(this.bipedRightLeg, this.armorRightBoot);
        copyModelAngles(this.bipedLeftLeg, this.armorLeftBoot);

        GlStateManager.pushMatrix();
        if (isSneak) GlStateManager.translate(0.0F, 0.2F, 0.0F);
        this.armorHead.render(scale);
        this.armorBody.render(scale);
        this.armorRightArm.render(scale);
        this.armorLeftArm.render(scale);
        this.armorRightLeg.render(scale);
        this.armorLeftLeg.render(scale);
        this.armorRightBoot.render(scale);
        this.armorLeftBoot.render(scale);
        GlStateManager.popMatrix();
    }

    public final void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
