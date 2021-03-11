package ru.ijo42.dka.chestplates.class3;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.base.ArmorBaseModel;
import ru.ijo42.dka.models.chestplate.class3.DKO1;

import javax.annotation.Nonnull;

public class DKO1Item extends ArmorBaseItem {

    public DKO1Item() {
        super(
                new DKO1Specs(),
                EntityEquipmentSlot.CHEST
        );
    }

    static class DKO1Specs implements IArmorSpecs {

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
            return new DKO1();
        }

        @Nonnull
        @Override
        public String getName() {
            return "dko1";
        }

    }

}
