package ru.ijo42.dka.chestplates.class3;

import net.minecraft.inventory.EntityEquipmentSlot;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.chestplate.class3.DKA8;

import javax.annotation.Nonnull;

public class DKA8Item extends ArmorBaseItem {

    public DKA8Item() {
        super(
                new DKA8Specs(),
                EntityEquipmentSlot.CHEST,
                new DKA8()
        );
    }

    static class DKA8Specs implements IArmorSpecs {

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
            return "dka8";
        }

    }

}
