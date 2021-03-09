package ru.ijo42.dka.models.head.class3;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import ru.ijo42.dka.Armor;
import ru.ijo42.dka.base.ArmorBaseModel;

public class DKOH1 extends ArmorBaseModel {

    public DKOH1() {
        super(256, 256, Armor.getResourceLocation("textures/models/head/dkoh1.png"));
    }

    @Override
    public void setupArmorParts() {
        armorHead.cubeList.add(new ModelBox(armorHead, 2, 102, -4.05F, -1.1F, -4.1F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 2, 102, -1.5F, -1.4F, -4.1F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 7, 240, -4.0F, -7.2F, -4.8F, 8, 2, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 1, 52, -4.6F, -6.4F, -3.9F, 1, 1, 9, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 2, 54, -4.4F, -6.4F, 4.1F, 9, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 2, 52, 3.6F, -6.4F, -4.0F, 1, 1, 9, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 11, 55, 3.6F, -7.6F, -5.0F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 12, 54, -4.6F, -7.6F, -5.0F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 11, 56, -1.5F, -8.0F, -5.0F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 7, 55, 1.0F, -5.4F, -5.0F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 8, 57, -4.0F, -5.4F, -5.0F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 38, 54, -2.0F, -5.9F, -5.0F, 4, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 6, 60, 1.0F, -8.1F, -5.0F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 12, 54, -4.0F, -8.1F, -5.0F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 3, 54, -3.5F, -6.5F, 4.0F, 7, 4, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 3, 52, -4.5F, -8.0F, 3.5F, 9, 5, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 2, 51, 3.5F, -8.0F, -4.0F, 1, 3, 8, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 4, 52, -4.5F, -8.0F, -4.0F, 1, 3, 8, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 13, 51, -4.0F, -8.5F, -4.0F, 8, 1, 8, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 2, 102, 1.05F, -1.1F, -4.1F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 18, 57, 3.507F, -7.01F, -1.907F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 40, 53, 3.509F, -6.31F, -1.207F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 38, 51, 3.51F, -5.6F, -0.5F, 1, 3, 4, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 14, 52, -4.4899F, -6.3F, -1.2F, 1, 3, 4, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 5, 52, -4.49F, -5.6F, -0.5F, 1, 3, 4, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 50, 54, -4.4897F, -7.01F, -1.907F, 1, 3, 1, 0.0F, true));

        ModelRenderer cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(4.0F, -3.3F, -1.2F);
        armorHead.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 57, -0.4931F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 53, -8.485F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        ModelRenderer cube_r4_r1 = new ModelRenderer(this);
        cube_r4_r1.setRotationPoint(4.075F, -1.2F, -1.425F);
        armorHead.addChild(cube_r4_r1);
        setRotationAngle(cube_r4_r1, 0.5672F, 0.0F, 0.0F);
        cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 0, 102, -1.015F, -1.0F, -2.0F, 1, 1, 5, 0.0F, false));
        cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 1, 102, -8.135F, -1.0F, -2.0F, 1, 1, 5, 0.0F, false));
    }

}
