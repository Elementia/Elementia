package com.elementia.elementiajmt.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Utils to help deal with NBT values. Probably will get more developed.
 *
 */
public class NBTUtils {

	/**
	 * Returns an {@link NBTTagCompound} value from a stack of items passed into
	 * the function, creating a new one if it does not exist. The TagCompound
	 * can then be modified by passing arguments on the TagCompound itself, such
	 * as {@link NBTTagCompound#getByte(String)} and
	 * {@link NBTTagCompound#setLong(String, long)}.
	 * 
	 * @param itemStack
	 * @return
	 */
	public static NBTTagCompound getNBT(ItemStack itemStack) {
		if (itemStack.stackTagCompound == null) {
			itemStack.stackTagCompound = new NBTTagCompound();
		}
		// TODO test itemStack.itemStack.setTagInfo(params);
		return itemStack.stackTagCompound;
	}
}
