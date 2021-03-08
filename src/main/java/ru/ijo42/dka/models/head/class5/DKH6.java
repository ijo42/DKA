package ru.ijo42.dka.models.head.class5;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import ru.ijo42.dka.Armor;
import ru.ijo42.dka.base.ArmorBaseModel;

public class DKH6 extends ArmorBaseModel {

    public DKH6() {
        super(256, 256, Armor.getResourceLocation("textures/models/head/dkh6.png"));
    }

    @Override
    public void setupArmorParts() {
        armorHead.cubeList.add(new ModelBox(armorHead, 40, 243, 1.0F, -5.4F, -5.0F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 29, 206, -4.05F, -1.1F, -4.1F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 29, 206, -1.5F, -1.4F, -4.1F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 29, 206, 1.05F, -1.1F, -4.1F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 24, 206, -4.0F, -7.2F, -4.8F, 8, 2, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 37, 240, -4.6F, -6.4F, -3.9F, 1, 1, 9, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 37, 240, -4.4F, -6.4F, 4.1F, 9, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 37, 240, 3.6F, -6.4F, -4.0F, 1, 1, 9, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 40, 243, 3.6F, -7.6F, -5.0F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 40, 243, -4.6F, -7.6F, -5.0F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 40, 243, -1.5F, -8.0F, -5.0F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 45, 243, -4.0F, -5.4F, -5.0F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 42, 244, -2.0F, -5.9F, -5.0F, 4, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 40, 245, 1.0F, -8.1F, -5.0F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 40, 243, -4.0F, -8.1F, -5.0F, 3, 1, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 11, 225, -3.5F, -6.5F, 4.0F, 7, 4, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 11, 225, -4.5F, -8.0F, 3.5F, 9, 5, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 24, 222, -4.49F, -5.6F, -0.5F, 1, 3, 4, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 11, 225, 3.51F, -5.6F, -0.5F, 1, 3, 4, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 7, 221, 3.507F, -6.3F, -1.2F, 1, 3, 4, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 25, 223, -4.4899F, -6.3F, -1.2F, 1, 3, 4, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 21, 226, -4.489F, -6.31F, -1.207F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 11, 225, 3.509F, -6.31F, -1.207F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 34, 228, 3.507F, -7.01F, -1.907F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 31, 223, -4.4897F, -7.01F, -1.907F, 1, 3, 1, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 11, 221, 3.5F, -8.0F, -4.0F, 1, 3, 8, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 11, 220, -4.5F, -8.0F, -4.0F, 1, 3, 8, 0.0F, true));
        armorHead.cubeList.add(new ModelBox(armorHead, 2, 222, -4.0F, -8.5F, -4.0F, 8, 1, 8, 0.0F, true));

        ModelRenderer cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(4.075F, -1.2F, -1.425F);
        armorHead.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.5672F, 0.0F, 0.0F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 203, -1.015F, -1.0F, -2.0F, 1, 1, 5, 0.0F, false));
        cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 203, -8.135F, -1.0F, -2.0F, 1, 1, 5, 0.0F, false));

        ModelRenderer cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-4.0F, -2.6F, 3.5F);
        armorHead.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 222, -0.48F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 222, 7.5069F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
    }

}
