package ru.ijo42.dka.chestplates.class4;

import net.minecraft.inventory.EntityEquipmentSlot;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.chestplate.class4.DKA7;

import javax.annotation.Nonnull;

public class DKA7Item extends ArmorBaseItem {

    public DKA7Item() {
        super(
                new DKA7Specs(),
                EntityEquipmentSlot.CHEST,
                new DKA7()
        );
    }

    static class DKA7Specs implements IArmorSpecs {

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
            return "dka7";
        }

    }

}
