package org.avp.item.rackmodules;

import org.avp.AliensVsPredator;
import org.avp.item.ItemNetworkRackModule;

import com.arisux.mdx.lib.client.render.model.Model;
import com.arisux.mdx.lib.client.render.model.MapModelTexture;

public class ItemNetworkRackModule7 extends ItemNetworkRackModule
{
    public ItemNetworkRackModule7()
    {
        super();
    }
    
    @Override
    public MapModelTexture<Model> getModel()
    {
        return AliensVsPredator.resources().models().RACKMODULE7;
    }

    @Override
    public MapModelTexture<Model> getModelOn()
    {
        return AliensVsPredator.resources().models().RACKMODULE7_ON;
    }

    @Override
    public MapModelTexture<Model> getModelOff()
    {
        return AliensVsPredator.resources().models().RACKMODULE7_OFF;
    }
}
