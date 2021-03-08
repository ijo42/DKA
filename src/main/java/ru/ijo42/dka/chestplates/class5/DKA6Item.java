package ru.ijo42.dka.chestplates.class5;

import net.minecraft.inventory.EntityEquipmentSlot;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.chestplate.class5.DKA6;

import javax.annotation.Nonnull;

public class DKA6Item extends ArmorBaseItem {

    public DKA6Item() {
        super(
                new DKA6Specs(),
                EntityEquipmentSlot.CHEST,
                new DKA6()
        );
    }

    static class DKA6Specs implements IArmorSpecs {

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
            return "dka6";
        }

    }

}
