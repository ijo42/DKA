package ru.ijo42.dka;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.util.EnumHelper;

import javax.annotation.Nonnull;
import java.util.function.Predicate;

public interface IArmorSpecs {

    float getResistance();

    int getDurability();

    @Nonnull
    Effect[] getRelatedEffects();

    default ITextComponent getDescription() {
        return new TextComponentTranslation("item." + getName() + ".desc");
    }

    @Nonnull
    String getName();

    /*
    implements note: restriction applies to helmet only.
    ref: RestrictionViewListener.java#29L
     */
    default boolean isRestrictView() {
        return false;
    }

    default ArmorReduction getReduction() {
        return new ArmorReduction() {
        };
    }

    default SoundEvent getSoundEvents() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    default ItemArmor.ArmorMaterial getMaterial() {
        String name = Armor.getResourceLocation(this.getName()).toString();
        return EnumHelper
                .addArmorMaterial(name, name,
                        this.getDurability(), getReduction().getOutArray(), 0,
                        this.getSoundEvents(), this.getResistance()
                );
    }

    interface Effect {

        @Nonnull
        PotionEffect getPotion();

        @Nonnull
        Predicate<EntityPlayer> getCondition();

    }

    abstract class ArmorReduction {

        int getByHead() {
            return 2;
        }

        int getByChest() {
            return 4;
        }

        int getByLegs() {
            return 6;
        }

        int getByFeet() {
            return 3;
        }

        final int[] getOutArray() {
            return new int[]{getByHead(), getByChest(), getByLegs(), getByFeet()};
        }

    }

}
