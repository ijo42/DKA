package ru.ijo42.dka.chestplates.class4;

import net.minecraft.inventory.EntityEquipmentSlot;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.chestplate.class4.DKPC3;

import javax.annotation.Nonnull;

public class DKPC3Item extends ArmorBaseItem {

    public DKPC3Item() {
        super(
                new DKPC3Specs(),
                EntityEquipmentSlot.CHEST,
                new DKPC3()
        );
    }

    static class DKPC3Specs implements IArmorSpecs {

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
            return "dkpc3";
        }

    }

}
