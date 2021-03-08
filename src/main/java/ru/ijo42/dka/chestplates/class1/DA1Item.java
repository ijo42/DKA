package ru.ijo42.dka.chestplates.class1;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.PotionEffect;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.models.chestplate.class1.DA1;

import javax.annotation.Nonnull;
import java.util.function.Predicate;

public class DA1Item extends ArmorBaseItem {

    public DA1Item() {
        super(
                new DA1Specs(),
                EntityEquipmentSlot.CHEST,
                new DA1()
        );
    }

    static class DA1Specs implements IArmorSpecs {

        @Override
        public float getResistance() {
            return 0;
        }

        @Override
        public int getDurability() {
            return 200;
        }

        @Nonnull
        @Override
        public Effect[] getRelatedEffects() {
            return new Effect[]{
                    new Effect() {
                        @Nonnull
                        @Override
                        public PotionEffect getPotion() {
                            return new PotionEffect(MobEffects.SPEED);
                        }

                        @Nonnull
                        @Override
                        public Predicate<EntityPlayer> getCondition() {
                            return Entity::isInvisible;
                        }
                    }
            };
        }

        @Nonnull
        @Override
        public String getName() {
            return "da1";
        }

    }

}
