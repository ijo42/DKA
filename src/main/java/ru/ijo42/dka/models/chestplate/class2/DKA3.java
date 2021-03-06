package ru.ijo42.dka.models.chestplate.class2;
// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import ru.ijo42.dka.Armor;
import ru.ijo42.dka.base.ArmorBaseModel;


public class DKA3 extends ArmorBaseModel {

    public DKA3() {
        super(128, 128, Armor.getResourceLocation("textures/models/chestplate/dka3.png"));
    }

    @Override
    public void setupArmorParts() {
        armorBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 37, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 20, 0, -2.0F, 2.35F, -2.7F, 4, 3, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 6, -3.0F, 6.0F, -2.7F, 6, 3, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 17, 6, -3.0F, 2.0F, -2.4F, 6, 3, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 32, 0, -3.0F, 2.0F, 1.4F, 6, 3, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 34, 22, 2.0F, 0.0F, -2.4F, 1, 2, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 25, 13, 2.0F, 0.0F, 1.4F, 1, 2, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 47, 0, -3.0F, 0.0F, -2.4F, 1, 2, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 20, 13, -3.0F, 0.0F, 1.4F, 1, 2, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 0, -4.0F, 5.0F, -2.4F, 8, 4, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 12, -4.0F, 5.0F, 1.4F, 8, 4, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 18, -3.0F, 9.0F, 1.4F, 6, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 16, 25, -3.0F, -0.225F, -2.0F, 1, 1, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 25, 2.0F, -0.225F, -2.0F, 1, 1, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 15, 19, -4.2F, 5.0F, 1.0F, 1, 4, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 38, 5, -4.2F, 5.0F, -2.0F, 1, 4, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 32, 5, 3.2F, 5.0F, 1.0F, 1, 4, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 20, 18, 3.2F, 5.0F, -2.0F, 1, 4, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 8, 31, 3.2F, 7.0F, -1.0F, 1, 1, 2, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 8, 25, -4.2F, 7.0F, -1.0F, 1, 1, 2, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 22, -3.0F, 9.0F, -2.4F, 6, 1, 1, 0.0F, false));

        ModelRenderer cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(3.0F, 9.85F, 1.7F);
        armorBody.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 31, -1.0F, -1.0F, -0.4F, 1, 1, 1, 0.0F, false));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 32, -1.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));

        ModelRenderer cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-3.0F, 9.85F, 1.7F);
        armorBody.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.4363F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 33, 0.0F, -1.0F, -0.4F, 1, 1, 1, 0.0F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 22, 0.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, true));

    }

}
