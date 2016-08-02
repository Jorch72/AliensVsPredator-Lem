package org.avp.event.client;

import org.avp.entities.EntityAPC;

import com.arisux.amdxlib.lib.game.Game;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class RenderPlayerHotbarAPCEvent
{

    Minecraft mc = Game.minecraft();

    @SubscribeEvent
    public void onRenderGameOverlayEvent(RenderGameOverlayEvent.Pre event)
    {
        if (mc.thePlayer.isRiding() && mc.thePlayer.ridingEntity instanceof EntityAPC)
        {
            if (event.type == ElementType.HOTBAR)
            {
                event.setCanceled(true);
            }
        }
    }
}
