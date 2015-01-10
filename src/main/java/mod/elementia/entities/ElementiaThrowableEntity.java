package mod.elementia.entities;

import cpw.mods.fml.common.registry.EntityRegistry;
import mod.elementia.ElementiaMain;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public abstract class ElementiaThrowableEntity extends EntityThrowable  {

private boolean isRegistered;
	
	public abstract int getId();
	public abstract String getEntityName();
	
	public ElementiaThrowableEntity(World world,
			EntityLivingBase base) {
		super(world, base);
		if (!this.isRegistered) {
			EntityRegistry.registerModEntity(this.getClass(), this.getEntityName(), this.getId(), ElementiaMain.MODID, 32, 1, true);
			this.isRegistered = true;
		}
		
	}

	

}
