package ru.ijo42.dka.chestplates.class3;

import net.minecraft.inventory.EntityEquipmentSlot;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.chestplate.class3.DKA9;

import javax.annotation.Nonnull;

public class DKA9Item extends ArmorBaseItem {

    public DKA9Item() {
        super(
                new DKA9Specs(),
                EntityEquipmentSlot.CHEST,
                new DKA9()
        );
    }

    static class DKA9Specs implements IArmorSpecs {

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
            return "dka9";
        }

    }

}
