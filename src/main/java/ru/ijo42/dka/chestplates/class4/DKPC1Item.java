package ru.ijo42.dka.chestplates.class4;

import net.minecraft.inventory.EntityEquipmentSlot;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.chestplate.class4.DKPC1;

import javax.annotation.Nonnull;

public class DKPC1Item extends ArmorBaseItem {

    public DKPC1Item() {
        super(
                new DKPC1Specs(),
                EntityEquipmentSlot.CHEST,
                new DKPC1()
        );
    }

    static class DKPC1Specs implements IArmorSpecs {

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
            return "dkpc1";
        }

    }

}
