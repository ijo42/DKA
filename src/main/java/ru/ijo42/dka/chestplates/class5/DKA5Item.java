package ru.ijo42.dka.chestplates.class5;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.base.ArmorBaseModel;
import ru.ijo42.dka.models.chestplate.class5.DKA5;

import javax.annotation.Nonnull;

public class DKA5Item extends ArmorBaseItem {

    public DKA5Item() {
        super(
                new DKA5Specs(),
                EntityEquipmentSlot.CHEST
        );
    }

    static class DKA5Specs implements IArmorSpecs {

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
            return new DKA5();
        }

        @Nonnull
        @Override
        public String getName() {
            return "dka5";
        }

    }

}
