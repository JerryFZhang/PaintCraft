package mod.mcreator;
import net.minecraftforge.fml.client.*;
import net.minecraftforge.fml.client.registry.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.asm.*;
import net.minecraftforge.fml.common.asm.transformers.*;
import net.minecraftforge.fml.common.discovery.*;
import net.minecraftforge.fml.common.discovery.asm.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.functions.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.common.toposort.*;
import net.minecraftforge.fml.common.versioning.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.fml.server.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import net.minecraft.init.*;
import java.util.Random;

import net.minecraft.client.resources.model.*;
public class paintCraft {

	public paintCraft(){
		
	}

	public static Item block;public static Object instance;public void load(FMLInitializationEvent event){
			
		if(event.getSide() == Side.CLIENT)
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(block, 0, new ModelResourceLocation("wdddd:pic", "inventory"));
		GameRegistry.addRecipe(new ItemStack(block, 1), new Object[]{
			"X1X", "X4X", "X7X", Character.valueOf('1'), new ItemStack(Blocks.redstone_torch, 1), Character.valueOf('4'), new ItemStack(Blocks.red_mushroom, 1), Character.valueOf('7'), new ItemStack(Items.bowl, 1), 
		});
		GameRegistry.addSmelting(Blocks.redstone_torch, new ItemStack(block), 1.0f);
	}
	public void generateNether(World world, Random random, int chunkX, int chunkZ){
		
	}
			
	public void generateSurface(World world, Random random, int chunkX, int chunkZ){
			
	}
	public int addFuel(ItemStack fuel){
		return 0;
	}
	public void serverLoad(FMLServerStartingEvent event){
				
	}
	public void preInit(FMLPreInitializationEvent event){
					
	}
	public void registerRenderers(){
						
	}


	static{
		block = (Item)(new BlockCustomFood(13, 0.3F, true));block = ((BlockCustomFood)block);
		block.setMaxStackSize(64);

	}

	public static class BlockCustomFood extends ItemFood{
		
		public BlockCustomFood(int par2, float par3, boolean par4){
		super(par2, par3, par4);
		setUnlocalizedName("pic");
		GameRegistry.registerItem(this, "pic");
	}

	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity){
		
		super.onFoodEaten(itemStack, world, entity);
		float var4 = 1.0F;
		int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
		int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
		int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

		if(true){
			world.setWorldTime(0);
		}

	}
}
}