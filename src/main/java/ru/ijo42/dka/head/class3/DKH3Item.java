package ru.ijo42.dka.head.class3;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.base.ArmorBaseModel;
import ru.ijo42.dka.models.head.class3.DKH3;

import javax.annotation.Nonnull;

public class DKH3Item extends ArmorBaseItem {

    public DKH3Item() {
        super(
                new DKH3Specs(),
                EntityEquipmentSlot.HEAD
        );
    }

    static class DKH3Specs implements IArmorSpecs {

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

        @Override
        @SideOnly(Side.CLIENT)
        public ArmorBaseModel getModel() {
            return new DKH3();
        }

        @Nonnull
        @Override
        public String getName() {
            return "dkh3";
        }

    }

}
