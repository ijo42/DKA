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

        @SubscribeEvent
        public static void onRegistryItem(RegistryEvent.Register<Item> e) {
            e.getRegistry().register(DA1);
            e.getRegistry().register(DKA2);
            e.getRegistry().register(DKA3);
        }

        @SubscribeEvent
        @SideOnly(Side.CLIENT)
        public static void onRegistryModel(ModelRegistryEvent e) {
            DA1.initModel();
            DKA2.initModel();
            DKA3.initModel();
        }

    }
}
