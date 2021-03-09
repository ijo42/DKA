package ru.ijo42.dka.head.class2;

import net.minecraft.inventory.EntityEquipmentSlot;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.head.class2.DKH1;

import javax.annotation.Nonnull;

public class DKH1Item extends ArmorBaseItem {

    public DKH1Item() {
        super(
                new DKH1Specs(),
                EntityEquipmentSlot.HEAD,
                new DKH1()
        );
    }

    static class DKH1Specs implements IArmorSpecs {

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
            return "dkh1";
        }

    }

}
