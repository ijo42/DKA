package ru.ijo42.dka.head.class4;

import net.minecraft.inventory.EntityEquipmentSlot;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.head.class4.DKH7;

import javax.annotation.Nonnull;

public class DKH7Item extends ArmorBaseItem {

    public DKH7Item() {
        super(
                new DKH7Specs(),
                EntityEquipmentSlot.HEAD,
                new DKH7()
        );
    }

    static class DKH7Specs implements IArmorSpecs {

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
            return "dkh7";
        }

        @Override
        public boolean isRestrictView() {
            return true;
        }

    }

}
