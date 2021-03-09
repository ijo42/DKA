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
import ru.ijo42.dka.chestplates.class3.DKA8Item;
import ru.ijo42.dka.chestplates.class3.DKA9Item;
import ru.ijo42.dka.chestplates.class3.DKO1Item;
import ru.ijo42.dka.chestplates.class3.DKO2Item;
import ru.ijo42.dka.chestplates.class4.DKA7Item;
import ru.ijo42.dka.chestplates.class4.DKPC1Item;
import ru.ijo42.dka.chestplates.class4.DKPC2Item;
import ru.ijo42.dka.chestplates.class4.DKPC3Item;
import ru.ijo42.dka.chestplates.class5.DKA4Item;
import ru.ijo42.dka.chestplates.class5.DKA5Item;
import ru.ijo42.dka.chestplates.class5.DKA6Item;
import ru.ijo42.dka.head.class2.DKH1Item;
import ru.ijo42.dka.head.class3.DKH2Item;
import ru.ijo42.dka.head.class3.DKH3Item;
import ru.ijo42.dka.head.class3.DKOH1Item;
import ru.ijo42.dka.head.class4.DKH7Item;
import ru.ijo42.dka.head.class4.DKPH1Item;
import ru.ijo42.dka.head.class4.DKPH2Item;
import ru.ijo42.dka.head.class5.DKH4Item;
import ru.ijo42.dka.head.class5.DKH5Item;
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

    @GameRegistry.ObjectHolder("dka8")
    public static final ArmorBaseItem DKA8 = new DKA8Item();

    @GameRegistry.ObjectHolder("dka9")
    public static final ArmorBaseItem DKA9 = new DKA9Item();

    @GameRegistry.ObjectHolder("dko1")
    public static final ArmorBaseItem DKO1 = new DKO1Item();

    @GameRegistry.ObjectHolder("dko2")
    public static final ArmorBaseItem DKO2 = new DKO2Item();

    @GameRegistry.ObjectHolder("dkpc1")
    public static final ArmorBaseItem DKPC1 = new DKPC1Item();

    @GameRegistry.ObjectHolder("dkpc2")
    public static final ArmorBaseItem DKPC2 = new DKPC2Item();

    @GameRegistry.ObjectHolder("dkpc3")
    public static final ArmorBaseItem DKPC3 = new DKPC3Item();

    @GameRegistry.ObjectHolder("dka4")
    public static final ArmorBaseItem DKA4 = new DKA4Item();

    @GameRegistry.ObjectHolder("dka5")
    public static final ArmorBaseItem DKA5 = new DKA5Item();

    @GameRegistry.ObjectHolder("dka6")
    public static final ArmorBaseItem DKA6 = new DKA6Item();


    @GameRegistry.ObjectHolder("dkh1")
    public static final ArmorBaseItem DKH1 = new DKH1Item();

    @GameRegistry.ObjectHolder("dkh2")
    public static final ArmorBaseItem DKH2 = new DKH2Item();

    @GameRegistry.ObjectHolder("dkh3")
    public static final ArmorBaseItem DKH3 = new DKH3Item();

    @GameRegistry.ObjectHolder("dkoh1")
    public static final ArmorBaseItem DKOH1 = new DKOH1Item();

    @GameRegistry.ObjectHolder("dkh7")
    public static final ArmorBaseItem DKH7 = new DKH7Item();

    @GameRegistry.ObjectHolder("dkph1")
    public static final ArmorBaseItem DKPH1 = new DKPH1Item();

    @GameRegistry.ObjectHolder("dkph2")
    public static final ArmorBaseItem DKPH2 = new DKPH2Item();

    @GameRegistry.ObjectHolder("dkh4")
    public static final ArmorBaseItem DKH4 = new DKH4Item();

    @GameRegistry.ObjectHolder("dkh5")
    public static final ArmorBaseItem DKH5 = new DKH5Item();

    @GameRegistry.ObjectHolder("dkh6")
    public static final ArmorBaseItem DKH6 = new DKH6Item();

    @SubscribeEvent
    public static void onRegistryItem(RegistryEvent.Register<Item> e) {
        e.getRegistry().registerAll(DA1, DKA2, DKA3, DKA4, DKA7, DKA8, DKA9, DKO1, DKO2, DKPC1, DKPC2, DKPC3, DKA5,
                DKH1, DKH2, DKH3, DKOH1, DKH7, DKPH1, DKPH2, DKH4, DKH5, DKH6
        );
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegistryModel(ModelRegistryEvent e) {
        for (ArmorBaseItem armorBaseItem : Arrays.asList(
                DA1,
                DKA2,
                DKA3,
                DKA4,
                DKA7,
                DKA8,
                DKA9,
                DKO1,
                DKO2,
                DKPC1,
                DKPC2,
                DKPC3,
                DKA5,
                DKA6,
                DKH1, DKH2, DKH3, DKOH1, DKH7, DKPH1, DKPH2, DKH4, DKH5, DKH6
        )) {
            armorBaseItem.initModel();
        }
    }

}
