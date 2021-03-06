package ru.ijo42.dka.head.class4;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.base.ArmorBaseModel;
import ru.ijo42.dka.models.head.class4.DKPH2;

import javax.annotation.Nonnull;

public class DKPH2Item extends ArmorBaseItem {

    public DKPH2Item() {
        super(
                new DKPH2Specs(),
                EntityEquipmentSlot.HEAD
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

        @Override
        @SideOnly(Side.CLIENT)
        public ArmorBaseModel getModel() {
            return new DKPH2();
        }

        @Nonnull
        @Override
        public String getName() {
            return "dkph2";
        }

    }

}
