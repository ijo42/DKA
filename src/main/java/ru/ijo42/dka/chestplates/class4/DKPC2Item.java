package ru.ijo42.dka.chestplates.class4;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.base.ArmorBaseModel;
import ru.ijo42.dka.models.chestplate.class4.DKPC2;

import javax.annotation.Nonnull;

public class DKPC2Item extends ArmorBaseItem {

    public DKPC2Item() {
        super(
                new DKPC2Specs(),
                EntityEquipmentSlot.CHEST
        );
    }

    static class DKPC2Specs implements IArmorSpecs {

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
            return new DKPC2();
        }

        @Nonnull
        @Override
        public String getName() {
            return "dkpc2";
        }

    }

}
