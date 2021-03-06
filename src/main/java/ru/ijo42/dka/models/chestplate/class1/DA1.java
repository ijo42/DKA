package ru.ijo42.dka.models.chestplate.class1;

import net.minecraft.client.model.ModelBox;
import ru.ijo42.dka.Armor;
import ru.ijo42.dka.base.ArmorBaseModel;

public class DA1 extends ArmorBaseModel {

    public DA1() {
        super(128, 128, Armor.getResourceLocation("textures/models/chestplate/da1.png"));
    }

    @Override
    public void setupArmorParts() {
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 25, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 0, -3.0F, 2.0F, 1.5F, 6, 7, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 15, 0, -3.0F, 2.0F, -2.5F, 6, 7, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 19, 19, -2.0F, 9.0F, 1.5F, 4, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 22, -2.0F, 9.0F, -2.5F, 4, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 24, 14, -3.0F, 0.0F, 1.3F, 1, 2, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 24, 9, -3.0F, 0.0F, -2.2F, 1, 2, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 15, 2.0F, 0.0F, 1.3F, 1, 2, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 8, 16, 2.0F, 0.0F, -2.2F, 1, 2, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 9, -3.0F, -0.2F, -2.0F, 1, 1, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 12, 9, 2.025F, -0.2F, -2.0F, 1, 1, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 0, -3.1F, -0.175F, -1.975F, 1, 1, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 0, 2.025F, -0.15F, -1.95F, 1, 1, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 0, -4.01F, 7.5F, -2.0F, 0, 1, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 4, 2, 4.01F, 7.5F, -2.0F, 0, 1, 4, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 0, 3.0F, 7.5F, 1.05F, 1, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 0, -4.0F, 7.5F, 1.05F, 1, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 0, -4.0F, 7.5F, -2.025F, 1, 1, 1, 0.0F, false));
        armorBody.cubeList.add(new ModelBox(armorBody, 0, 0, 3.0F, 7.5F, -2.025F, 1, 1, 1, 0.0F, false));
    }

}
