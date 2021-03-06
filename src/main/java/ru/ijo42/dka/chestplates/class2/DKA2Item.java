package ru.ijo42.dka.chestplates.class2;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.chestplate.class2.DKA2;

import javax.annotation.Nonnull;

public class DKA2Item extends ArmorBaseItem {

    public DKA2Item() {
        super(
                new DKA2Specs(),
                EntityEquipmentSlot.CHEST,
                new DKA2()
        );
    }

    static class DKA2Specs implements IArmorSpecs {

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
        public ITextComponent getDescription() {
            return new TextComponentTranslation("item.chestplate.dka2.desc");
        }

        @Nonnull
        @Override
        public String getName() {
            return "dka2";
        }

    }

}
