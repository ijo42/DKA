package ru.ijo42.dka;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.util.EnumHelper;

import javax.annotation.Nonnull;
import java.util.function.Predicate;

public interface IArmorSpecs {

    float getResistance();

    int getDurability();

    @Nonnull
    Effect[] getRelatedEffects();

    @Nonnull
    ITextComponent getDescription();

    @Nonnull
    String getName();

    default boolean isRestrictView() {
        return false;
    }

    default SoundEvent getSoundEvents() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    default ItemArmor.ArmorMaterial getMaterial() {
        String name = Armor.getResourceLocation(this.getName()).toString();
        return EnumHelper
                .addArmorMaterial(name, name,
                        this.getDurability(), new int[]{2, 4, 6, 3}, 0,
                        this.getSoundEvents(), this.getResistance()
                );
    }

    interface Effect {

        PotionEffect getPotion();

        Predicate<EntityPlayer> getCondition();

    }

}
