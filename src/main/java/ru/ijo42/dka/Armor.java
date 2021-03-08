package ru.ijo42.dka;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
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

@Mod(
        modid = Armor.MOD_ID,
        name = Armor.MOD_NAME,
        version = Armor.VERSION,
        certificateFingerprint = Armor.CERTIFICATE
)
public class Armor {

    public static final String MOD_ID = "dka",
            MOD_NAME = "DKA", VERSION = "%VERSION%",
            CERTIFICATE = "%CERTIFICATE%";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static Armor INSTANCE;

    public static ResourceLocation getResourceLocation(String key) {
        return new ResourceLocation(MOD_ID, key);
    }

    @GameRegistry.ObjectHolder(MOD_ID)
    @Mod.EventBusSubscriber
    public static class ItemsRegistry {

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

        @SubscribeEvent
        public static void onRegistryItem(RegistryEvent.Register<Item> e) {
            e.getRegistry().register(DA1);
            e.getRegistry().register(DKA2);
            e.getRegistry().register(DKA3);
            e.getRegistry().register(DKA7);
            e.getRegistry().register(DKPC1);
            e.getRegistry().register(DKPC2);
            e.getRegistry().register(DKA5);
            e.getRegistry().register(DKA6);
        }

        @SubscribeEvent
        @SideOnly(Side.CLIENT)
        public static void onRegistryModel(ModelRegistryEvent e) {
            DA1.initModel();
            DKA2.initModel();
            DKA3.initModel();
            DKA7.initModel();
            DKPC1.initModel();
            DKPC2.initModel();
            DKA5.initModel();
            DKA6.initModel();
        }

    }
}
