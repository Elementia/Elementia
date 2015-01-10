package mod.elementia.items;

import mod.elementia.entities.EntityRune;
import mod.elementia.util.Recipe;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStoneRune extends ElementiaItem {

	@Override
	public String getRawUnlocalizedName() {
		return "stoneRune";
	}

	@Override
	public Recipe getRecipe() {
		return null;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		
		--stack.stackSize;
		world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		world.spawnEntityInWorld(new EntityRune(world, player));
		
		return stack;
		
	}
}
