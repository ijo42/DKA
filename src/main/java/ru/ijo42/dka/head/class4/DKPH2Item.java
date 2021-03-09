package ru.ijo42.dka.head.class4;

import net.minecraft.inventory.EntityEquipmentSlot;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.head.class4.DKPH2;

import javax.annotation.Nonnull;

public class DKPH2Item extends ArmorBaseItem {

    public DKPH2Item() {
        super(
                new DKPH2Specs(),
                EntityEquipmentSlot.HEAD,
                new DKPH2()
        );
    }

    static class DKPH2Specs implements IArmorSpecs {

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
            return "dkph2";
        }

    }

}
