package ru.ijo42.dka;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.ijo42.dka.base.ArmorBaseItem;
import ru.ijo42.dka.chestplates.class1.DA1Item;
import ru.ijo42.dka.chestplates.class2.DKA2Item;
import ru.ijo42.dka.chestplates.class2.DKA3Item;
import ru.ijo42.dka.chestplates.class4.DKA7Item;
import ru.ijo42.dka.chestplates.class4.DKPC1Item;
import ru.ijo42.dka.chestplates.class4.DKPC2Item;
import ru.ijo42.dka.chestplates.class5.DKA5Item;
import ru.ijo42.dka.chestplates.class5.DKA6Item;
import ru.ijo42.dka.head.class4.DKH7Item;
import ru.ijo42.dka.head.class5.DKH4Item;
import ru.ijo42.dka.head.class5.DKH6Item;

import java.util.Arrays;

@GameRegistry.ObjectHolder(Armor.MOD_ID)
@Mod.EventBusSubscriber
public class ItemsRegistry {

    @GameRegistry.ObjectHolder("da1")
    public static final ArmorBaseItem DA1 = new DA1Item();

    @GameRegistry.ObjectHolder("dka2")
    public static final ArmorBaseItem DKA2 = new DKA2Item();

    @GameRegistry.ObjectHolder("dka3")
    public static final ArmorBaseItem DKA3 = new DKA3Item();

    @GameRegistry.ObjectHolder("dka7")
    public static final ArmorBaseItem DKA7 = new DKA7Item();

    @GameRegistry.ObjectHolder("dkpc1")
    public static final ArmorBaseItem DKPC1 = new DKPC1Item();

    @GameRegistry.ObjectHolder("dkpc2")
    public static final ArmorBaseItem DKPC2 = new DKPC2Item();

    @GameRegistry.ObjectHolder("dka5")
    public static final ArmorBaseItem DKA5 = new DKA5Item();

    @GameRegistry.ObjectHolder("dka6")
    public static final ArmorBaseItem DKA6 = new DKA6Item();


    @GameRegistry.ObjectHolder("dkh7")
    public static final ArmorBaseItem DKH7 = new DKH7Item();

    @GameRegistry.ObjectHolder("dkh4")
    public static final ArmorBaseItem DKH4 = new DKH4Item();

    @GameRegistry.ObjectHolder("dkh6")
    public static final ArmorBaseItem DKH6 = new DKH6Item();

    @SubscribeEvent
    public static void onRegistryItem(RegistryEvent.Register<Item> e) {
        e.getRegistry().registerAll(DA1, DKA2, DKA3, DKA7, DKPC1, DKPC2, DKA5, DKA6, DKH7, DKH4, DKH6);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegistryModel(ModelRegistryEvent e) {
        for (ArmorBaseItem armorBaseItem : Arrays.asList(DA1, DKA2, DKA3, DKA7, DKPC1, DKPC2, DKA5, DKA6, DKH7, DKH4, DKH6)) {
            armorBaseItem.initModel();
        }
    }

}