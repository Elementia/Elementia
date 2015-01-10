package mod.elementia.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityRune extends EntityThrowable {

	public EntityRune(World world, EntityLivingBase entity) {
		super(world, entity);
		
	}

	@Override
	protected void onImpact(MovingObjectPosition position) {
		this.setDead();
		System.out.println("Impact");
	}

}
