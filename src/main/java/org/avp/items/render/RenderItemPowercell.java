package org.avp.items.render;

import org.avp.AliensVsPredator;
import org.lwjgl.opengl.GL11;

import com.arisux.amdxlib.lib.client.render.OpenGL;
import com.arisux.amdxlib.lib.client.render.ItemRenderer;
import com.arisux.amdxlib.lib.game.Game;

import net.minecraft.item.ItemStack;

public class RenderItemPowercell extends ItemRenderer
{
    public RenderItemPowercell()
    {
        super(AliensVsPredator.resources().models().POWERCELL);
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        super.renderItem(type, item, data);
    }

    @Override
    public void renderThirdPerson(ItemStack item, Object... data)
    {
        float glScale = 1.6F;
        OpenGL.pushMatrix();
        {
            OpenGL.scale(glScale, glScale, glScale);
            OpenGL.rotate(90F, 0F, 0F, 1F);
            OpenGL.translate(0F, -1.3F, 0.4F);
            OpenGL.disable(GL11.GL_CULL_FACE);
            this.getModelTexMap().draw();
            OpenGL.disableLight();
            AliensVsPredator.resources().models().POWERCELL_LIQUID.draw();
            
        }
        OpenGL.popMatrix();
    }

    @Override
    public void renderFirstPerson(ItemStack item, Object... data)
    {
        float glScale = 0.8F;
        OpenGL.pushMatrix();
        {
            if (firstPersonRenderCheck(data[1]))
            {
                OpenGL.scale(glScale, glScale, glScale);
                OpenGL.translate(1.5F, -0.3F, 0.2F);
                OpenGL.rotate(45.0F, 0.0F, 0.0F, 1.0F);
                OpenGL.disable(GL11.GL_CULL_FACE);
                this.getModelTexMap().draw();
                OpenGL.disableLight();
                AliensVsPredator.resources().models().POWERCELL_LIQUID.draw();
            }
        }
        OpenGL.popMatrix();
    }

    @Override
    public void renderInInventory(ItemStack item, Object... data)
    {
        float glScale = 12F;
        OpenGL.pushMatrix();
        {
            OpenGL.scale(glScale, -glScale, glScale);
            OpenGL.translate(0.65F, -1.55F, 0F);
            OpenGL.rotate(30, 1.0F, 0.0F, 0.0F);
            OpenGL.translate(0F, 0F, 0F);
            OpenGL.disable(GL11.GL_CULL_FACE);
            this.getModelTexMap().draw();
            OpenGL.disableLight();
            AliensVsPredator.resources().models().POWERCELL_LIQUID.draw();
            OpenGL.enableLight();
        }
        OpenGL.popMatrix();
    }

    @Override
    public void renderInWorld(ItemStack item, Object... data)
    {
        super.renderInWorld(item, data);
        OpenGL.pushMatrix();
        {
            OpenGL.rotate(Game.minecraft().thePlayer.worldObj.getWorldTime() % 360 * 6, 0.0F, 1.0F, 0.0F);
            OpenGL.disable(GL11.GL_CULL_FACE);
            this.getModelTexMap().draw();
            OpenGL.disableLight();
            AliensVsPredator.resources().models().POWERCELL_LIQUID.draw();
            OpenGL.enableLight();
        }
        OpenGL.popMatrix();
    }
}
