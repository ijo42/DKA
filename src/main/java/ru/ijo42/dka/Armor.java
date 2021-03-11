package ru.ijo42.dka;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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

    @Mod.EventHandler
    @SideOnly(Side.CLIENT)
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new RestrictionViewListener());
    }
}
