package mod.elementia.entities;

import cpw.mods.fml.common.registry.EntityRegistry;
import mod.elementia.ElementiaMain;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public abstract class ElementiaEntity extends Entity {

	private boolean isRegistered;
	
	public ElementiaEntity(World world) {
		super(world);
		if (!this.isRegistered) {
			EntityRegistry.registerModEntity(this.getClass(), this.getEntityName(), this.getId(), ElementiaMain.MODID, 32, 1, true);
			this.isRegistered = true;
		}
		
		
	}
	
	public abstract int getId();
	public abstract String getEntityName();
	

}
