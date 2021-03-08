package ru.ijo42.dka.models.head.class5;
// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import ru.ijo42.dka.Armor;
import ru.ijo42.dka.base.ArmorBaseModel;

public class DKH4 extends ArmorBaseModel {

    public DKH4() {
        super(256, 256, Armor.getResourceLocation("textures/models/head/dkh4.png"));
    }

    @Override
    public void setupArmorParts() {
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, -4.0F, -8.0F, -4.5F, 8, 2, 9, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, -4.0F, -8.5F, -4.0F, 8, 1, 8, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, -4.5F, -8.0F, -4.0F, 1, 2, 8, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, -4.5F, -6.5F, 4.0F, 9, 4, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, 3.5F, -8.0F, -4.0F, 1, 2, 8, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, -4.5F, -8.0F, 3.5F, 9, 5, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 0, 120, -4.1F, -1.1F, -4.1F, 2, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, -5.2F, -5.5F, -4.0F, 1, 1, 8, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, 4.2F, -5.5F, -4.0F, 1, 1, 8, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, -5.2F, -4.7F, 1.0F, 1, 2, 3, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, 4.2F, -4.7F, 1.0F, 1, 2, 3, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 0, 120, 2.1F, -1.1F, -4.1F, 2, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 0, 120, -4.1F, -4.3F, -3.0F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 0, 120, 3.1F, -4.3F, -3.0F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, 4.2F, -4.7F, -1.0F, 1, 1, 2, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 150, 0, -5.2F, -4.7F, -1.0F, 1, 1, 2, 0.0F, true));

        ModelRenderer head29_r1 = new ModelRenderer(this);
        head29_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(head29_r1);
        setRotationAngle(head29_r1, -0.0744F, 0.0F, 0.0F);
        head29_r1.cubeList.add(new ModelBox(head29_r1, 0, 180, 0.5F, -6.6F, -6.1F, 1, 2, 1, 0.0F, true));
        head29_r1.cubeList.add(new ModelBox(head29_r1, 0, 230, -1.0F, -7.2F, -5.9F, 2, 1, 1, 0.0F, true));
        head29_r1.cubeList.add(new ModelBox(head29_r1, 0, 180, -1.5F, -6.6F, -6.1F, 1, 2, 1, 0.0F, true));
        head29_r1.cubeList.add(new ModelBox(head29_r1, 4, 188, -1.5F, -6.6F, -5.9F, 3, 2, 1, 0.0F, true));

        ModelRenderer head23_r1 = new ModelRenderer(this);
        head23_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(head23_r1);
        setRotationAngle(head23_r1, 0.5949F, 0.0F, 0.0F);
        head23_r1.cubeList.add(new ModelBox(head23_r1, 0, 160, -1.5F, -3.0F, -3.6F, 3, 1, 1, 0.0F, true));
        head23_r1.cubeList.add(new ModelBox(head23_r1, 0, 140, -3.5F, -2.7F, -3.4F, 7, 1, 1, 0.0F, true));

        ModelRenderer head20_r1 = new ModelRenderer(this);
        head20_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(head20_r1);
        setRotationAngle(head20_r1, -1.2043F, 0.0F, 0.0F);
        head20_r1.cubeList.add(new ModelBox(head20_r1, 50, 120, 3.1F, -1.7F, -2.5F, 1, 5, 1, 0.0F, true));
        head20_r1.cubeList.add(new ModelBox(head20_r1, 50, 120, -4.1F, -1.7F, -2.5F, 1, 5, 1, 0.0F, true));

        ModelRenderer head18_r1 = new ModelRenderer(this);
        head18_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(head18_r1);
        setRotationAngle(head18_r1, 1.1897F, 0.0F, 0.0F);
        head18_r1.cubeList.add(new ModelBox(head18_r1, 210, 0, -5.2F, -5.2F, 2.9F, 1, 5, 1, 0.0F, true));
        head18_r1.cubeList.add(new ModelBox(head18_r1, 210, 0, 4.2F, -5.2F, 2.9F, 1, 5, 1, 0.0F, true));

        ModelRenderer head11_r1 = new ModelRenderer(this);
        head11_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(head11_r1);
        setRotationAngle(head11_r1, 0.0F, 0.0F, 0.2182F);
        head11_r1.cubeList.add(new ModelBox(head11_r1, 150, 0, -6.15F, -6.8F, -4.0F, 1, 3, 8, 0.0F, true));

        ModelRenderer head10_r1 = new ModelRenderer(this);
        head10_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(head10_r1);
        setRotationAngle(head10_r1, 0.0F, 0.0F, -0.2231F);
        head10_r1.cubeList.add(new ModelBox(head10_r1, 150, 0, 5.15F, -6.7F, -4.0F, 1, 3, 8, 0.0F, true));

        ModelRenderer head9_r1 = new ModelRenderer(this);
        head9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(head9_r1);
        setRotationAngle(head9_r1, -0.2974F, 0.0F, 0.0F);
        head9_r1.cubeList.add(new ModelBox(head9_r1, 150, 0, -4.0F, -6.4F, -6.7F, 8, 3, 2, 0.0F, true));
    }

}
