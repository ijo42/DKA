package ru.ijo42.dka.chestplates.class3;

import net.minecraft.inventory.EntityEquipmentSlot;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.chestplate.class3.DKO2;

import javax.annotation.Nonnull;

public class DKO2Item extends ArmorBaseItem {

    public DKO2Item() {
        super(
                new DKO2Specs(),
                EntityEquipmentSlot.CHEST,
                new DKO2()
        );
    }

    static class DKO2Specs implements IArmorSpecs {

        @Override
        public float getResistance() {
            return 0;
        }

        @Override
        public int getDurability() {
            return 0;
        }

        @Nonnull
        @Override
        public Effect[] getRelatedEffects() {
            return new Effect[0];
        }

        @Nonnull
        @Override
        public String getName() {
            return "dko2";
        }

    }

}
