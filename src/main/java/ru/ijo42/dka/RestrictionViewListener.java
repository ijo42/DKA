package ru.ijo42.dka;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import ru.ijo42.dka.base.ArmorBaseItem;

public class RestrictionViewListener {

    protected static final ResourceLocation RESTRICTION_BLUR_TEX_PATH =
            Armor.getResourceLocation("textures/misc/restrictionblur.png");

    private final Minecraft mc;

    public RestrictionViewListener() {
        this.mc = Minecraft.getMinecraft();
    }

    @SubscribeEvent
    public void onEvent(RenderGameOverlayEvent.Post ev) {
        final Item helmet = mc.player.inventory.armorItemInSlot(3).getItem();
        if (helmet instanceof ArmorBaseItem) {
            if (((ArmorBaseItem) helmet).isRestrictView()) {
                if (mc.gameSettings.thirdPersonView == 0 && ev.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
                    renderRestrictingOverlay(ev.getResolution());
                }
            }
        }
    }

    protected void renderRestrictingOverlay(ScaledResolution scaledresolution) {
        int i = scaledresolution.getScaledWidth();
        int j = scaledresolution.getScaledHeight();

        GlStateManager.enableBlend();
        GlStateManager.disableDepth();
        GlStateManager.depthMask(false);

        GlStateManager.disableAlpha();
        this.mc.getTextureManager().bindTexture(RESTRICTION_BLUR_TEX_PATH);
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferbuilder.pos(0.0D, j, -90.0D).tex(0.0D, 1.0D).endVertex();
        bufferbuilder.pos(i, j, -90.0D).tex(1.0D, 1.0D).endVertex();
        bufferbuilder.pos(i, 0.0D, -90.0D).tex(1.0D, 0.0D).endVertex();
        bufferbuilder.pos(0.0D, 0.0D, -90.0D).tex(0.0D, 0.0D).endVertex();
        tessellator.draw();
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();

        GlStateManager.disableBlend();
    }

}
