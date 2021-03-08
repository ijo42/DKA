package ru.ijo42.dka.head.class5;

import net.minecraft.inventory.EntityEquipmentSlot;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.head.class5.DKH4;

import javax.annotation.Nonnull;

public class DKH4Item extends ArmorBaseItem {

    public DKH4Item() {
        super(
                new DKH4Specs(),
                EntityEquipmentSlot.HEAD,
                new DKH4()
        );
    }

    static class DKH4Specs implements IArmorSpecs {

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
            return "dkh4";
        }

    }

}
