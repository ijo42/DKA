package ru.ijo42.dka.head.class3;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.base.ArmorBaseModel;
import ru.ijo42.dka.models.head.class3.DKOH1;

import javax.annotation.Nonnull;

public class DKOH1Item extends ArmorBaseItem {

    public DKOH1Item() {
        super(
                new DKOH1Specs(),
                EntityEquipmentSlot.HEAD
        );
    }

    static class DKOH1Specs implements IArmorSpecs {

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
            return new DKOH1();
        }

        @Nonnull
        @Override
        public String getName() {
            return "dkoh1";
        }

    }

}
