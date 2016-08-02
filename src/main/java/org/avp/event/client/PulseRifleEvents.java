package org.avp.event.client;

import org.avp.AliensVsPredator;
import org.avp.packets.server.PacketLaunchGrenade;

import com.arisux.amdxlib.lib.game.Game;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraft.client.Minecraft;

public class PulseRifleEvents
{
    private Minecraft mc = Game.minecraft();

    @SubscribeEvent
    public void onItemUse(ClientTickEvent event)
    {
        if (mc.thePlayer != null)
        {
            if (mc.thePlayer.getCurrentEquippedItem() != null && mc.thePlayer.getCurrentEquippedItem().getItem() == AliensVsPredator.items().itemM41A)
            {
                if (AliensVsPredator.keybinds().KEYBIND_ITEM_ACTION.isPressed())
                {
                    // ((ItemFirearm) mc.thePlayer.getCurrentEquippedItem().getItem()).cancelRightClick = true;
                    Game.setRightClickDelayTimer(20);
                    AliensVsPredator.network().sendToServer(new PacketLaunchGrenade());
                }
            }
        }
    }
}
