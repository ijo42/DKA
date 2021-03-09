package ru.ijo42.dka.models.chestplate.class3;
// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import ru.ijo42.dka.Armor;
import ru.ijo42.dka.base.ArmorBaseModel;


public class DKO1 extends ArmorBaseModel {

    public DKO1() {
        super(128, 128, Armor.getResourceLocation("textures/models/chestplate/dko1.png"));
    }

    @Override
    public void setupArmorParts() {
        armorHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.cubeList.add(new ModelBox(armorHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

        armorBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorBody.cubeList.add(new ModelBox(armorBody, 13, 30, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 0, -4.0F, 2.0F, -2.3F, 8, 6, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 8, -4.0F, 2.0F, 1.3F, 8, 6, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 19, 8, 3.1F, 4.0F, -2.025F, 1, 4, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 42, 17, 3.1F, 0.0F, -1.025F, 1, 1, 2, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 19, 18, 3.1F, 0.0F, 0.975F, 1, 4, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 12, 19, 3.1F, 0.0F, -2.0F, 1, 4, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 19, -4.1F, 0.0F, 0.975F, 1, 4, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 4, 19, -4.1F, 0.0F, -2.0F, 1, 4, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 30, 5, -4.0F, 1.0F, 1.3F, 8, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 25, 21, -4.0F, 0.0F, -2.3F, 2, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 42, 21, -4.05F, -0.11F, -2.55F, 2, 2, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 48, 0, 2.05F, -0.11F, -2.55F, 2, 2, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 31, 8, -4.0F, 1.0F, -2.3F, 3, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 49, 4, 2.0F, 0.0F, -2.3F, 2, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 31, 1.0F, 1.0F, -2.3F, 3, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 29, 0, -4.0F, 0.0F, 1.3F, 8, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 17, 25, -4.0F, -0.1F, -2.0F, 2, 1, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 25, 2.0F, -0.1F, -2.0F, 2, 1, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 30, 13, -2.0F, -0.1F, 1.0F, 4, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 19, 0, -4.1F, 4.0F, -2.025F, 1, 4, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 31, 16, -4.1F, 0.0F, -1.025F, 1, 1, 2, 0.0F, false));

        ModelRenderer body_r1 = new ModelRenderer(this);
        body_r1.setRotationPoint(0.0F, 23.0F, 9.7F);
        armorBody.addChild(body_r1);
        setRotationAngle(body_r1, 0.6109F, 0.0F, 0.0F);
        body_r1.cubeList.add(new ModelBox(body_r1, 0, 16, -3.0F, -20.0F, -1.0F, 6, 1, 1, 0.0F, false));

        ModelRenderer body_r2 = new ModelRenderer(this);
        body_r2.setRotationPoint(0.0F, 21.0F, 9.7F);
        armorBody.addChild(body_r2);
        setRotationAngle(body_r2, 0.6109F, 0.0F, 0.0F);
        body_r2.cubeList.add(new ModelBox(body_r2, 0, 16, -3.0F, -20.0F, -1.0F, 6, 1, 1, 0.0F, false));

        ModelRenderer body_r3 = new ModelRenderer(this);
        body_r3.setRotationPoint(0.0F, 19.0F, 9.7F);
        armorBody.addChild(body_r3);
        setRotationAngle(body_r3, 0.6109F, 0.0F, 0.0F);
        body_r3.cubeList.add(new ModelBox(body_r3, 0, 16, -3.0F, -20.0F, -1.0F, 6, 1, 1, 0.0F, false));

        armorRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        armorRightArm.cubeList.add(new ModelBox(armorRightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

        armorLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        armorLeftArm.cubeList.add(new ModelBox(armorLeftArm, 32, 48, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
    }

}
