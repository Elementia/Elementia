package com.elementia.elementiajmt.items.armor;

import java.util.List;

import com.elementia.elementiajmt.items.IElementiaItem;
import com.elementia.elementiajmt.util.RecipesHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import static com.elementia.elementiajmt.util.NBTUtils.*;

public class DoubleJumpBoots extends ItemArmor implements IElementiaItem {
	/** The amount of jumps you have. Probably won't change. Maybe. */
	private static byte jumpAmount = 1;

	public DoubleJumpBoots(int armorSlot) {
		super(ItemArmor.ArmorMaterial.DIAMOND, 0, 3);// locks it to the feet
		setMaxDamage(1000);// ... I don't really know
		//this.setCreativeTab(CreativeTabElementia.tabInstance);
		// TODO textures
	}

	/**
	 * 
	 * @param world
	 * @param player
	 *            Who this is equipped to.
	 * @param itemStack
	 *            The stack of this type of item.
	 */
	@Override
	public void onArmorTick(World world, EntityPlayer player,
			ItemStack itemStack) {

		// resets the jumps if the player is on the ground.
		if (player.onGround) {
			setJumps(itemStack, jumpAmount);
		}

		// checks if the player is off the ground, can jump, and if the velocity
		// is around half of a normal jump, it allows you to double jump.
		if (!player.onGround
				&& Minecraft.getMinecraft().gameSettings.keyBindJump
						.getIsKeyPressed() && player.motionY < .22
				&& getJumps(itemStack) > 0) {
			player.jump();
			player.isAirBorne = false;
			setJumps(itemStack, (byte) (getJumps(itemStack) - 1));

			player.fallDistance = 0.0f;// TODO make this work
		}
		super.onArmorTick(world, player, itemStack);

	}

	/**
	 * @param itemStack
	 * @return the "jumps" byte value.
	 */
	private byte getJumps(ItemStack itemStack) {
		NBTTagCompound tagCompound = getNBT(itemStack);
		if (!tagCompound.hasKey("jumps")) {
			tagCompound.setByte("jumps", jumpAmount);
		}
		return tagCompound.getByte("jumps");
	}

	/**
	 * 
	 * @param itemStack
	 * @param jumps
	 *            the byte in which the itemstack's "jumps" byte is stored.
	 */
	private void setJumps(ItemStack itemStack, byte jumps) {
		getNBT(itemStack).setByte("jumps", jumps);
	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player,
			List descList, boolean par4) {
		descList.add("Allows the second use of a spacebar. Neat!");

		super.addInformation(itemStack, player, descList, par4);
	}

	@Override
	public boolean getIsRepairable(ItemStack p_82789_1_, ItemStack p_82789_2_) {
		return false;
	}

	@Override
	public String getRawName() {
		return "doubleJumpBoots";
	}

	@Override
	public RecipesHelper getRecipes() {
		RecipesHelper helper = new RecipesHelper();
		helper.addRecipe(new Object[] {
				"F F",
				"I I",
				"I I",
				'F', Items.feather,
				'I', Items.iron_ingot
		}, this);

		return helper;
	}
}
