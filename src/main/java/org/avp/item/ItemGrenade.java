package org.avp.item;

import java.util.List;

import org.avp.entities.EntityGrenade;

import com.arisux.mdxlib.lib.world.entity.player.inventory.Inventories;
import com.arisux.mdxlib.lib.world.item.HookedItem;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGrenade extends HookedItem
{
    private boolean isFlaming;

    public ItemGrenade(boolean isFlaming)
    {
        super();
        this.maxStackSize = 16;
        this.isFlaming = isFlaming;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemstack, World worldObj, EntityPlayer player, EnumHand hand)
    {
        if (!worldObj.isRemote)
        {
            EntityGrenade grenade = new EntityGrenade(worldObj, player);
            grenade.setFlaming(this.isFlaming);
            worldObj.spawnEntityInWorld(grenade);
            Inventories.consumeItem(player, this);
        }
        
        return super.onItemRightClick(itemstack, worldObj, player, hand);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    @SuppressWarnings("all")
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Right click to throw (explodes)");
    }
}