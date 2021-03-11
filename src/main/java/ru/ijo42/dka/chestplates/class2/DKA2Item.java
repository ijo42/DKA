package ru.ijo42.dka.chestplates.class2;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.ijo42.dka.IArmorSpecs;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.base.ArmorBaseModel;
import ru.ijo42.dka.models.chestplate.class2.DKA2;

import javax.annotation.Nonnull;
import java.util.function.Predicate;

public class DKA2Item extends ArmorBaseItem {

    public DKA2Item() {
        super(
                new DKA2Specs(),
                EntityEquipmentSlot.CHEST
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
            return new Effect[]{
                    new Effect() {
                        @Nonnull
                        @Override
                        public PotionEffect getPotion() {
                            return new PotionEffect(MobEffects.STRENGTH);
                        }

                        @Nonnull
                        @Override
                        public Predicate<EntityPlayer> getCondition() {
                            return Entity::isRiding;
                        }
                    }
            };
        }

        @Override
        @SideOnly(Side.CLIENT)
        public ArmorBaseModel getModel() {
            return new DKA2();
        }

        @Nonnull
        @Override
        public String getName() {
            return "dka2";
        }

    }

}
