package mod.mcreator;
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
import java.util.*;

import net.minecraftforge.common.util.*;import net.minecraft.client.resources.model.*;
public class mcreator_wand{

public mcreator_wand(){}

public static Item block;
public static Object instance;public void load(FMLInitializationEvent event){
ItemStack stack = new ItemStack(block, 1);if(event.getSide() == Side.CLIENT)
Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(block, 0, new ModelResourceLocation("PaintCraft:Wand", "inventory"));

GameRegistry.addRecipe(stack, new Object[]{
	"X1X", "X4X", "X7X", Character.valueOf('1'), new ItemStack(Blocks.lapis_block, 1), Character.valueOf('4'), new ItemStack(Blocks.lapis_block, 1), Character.valueOf('7'), new ItemStack(Items.blaze_rod, 1), 
});
GameRegistry.addSmelting(Blocks.lapis_block, stack, 1.0f);
}
public void generateNether(World world, Random random, int chunkX, int chunkZ){}
public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
public int addFuel(ItemStack fuel){return 0;}
public void serverLoad(FMLServerStartingEvent event){}
public void preInit(FMLPreInitializationEvent event){}
public void registerRenderers(){}


static{
Item.ToolMaterial enumt = EnumHelper.addToolMaterial("WAND", 1, 1000, 4F, 1, 2);block = (new ItemWand(){

public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){
float var4 = 1.0F;
int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D);
int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

if(true){
world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
}



return itemstack;
}
@Override
public boolean onItemUseFirst(ItemStack itemStack, EntityPlayer entity, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ){
super.onItemUse(itemstack, entity, world, i, j, k, l, a, b, c);float var4 = 1.0F;


if(true){
world.getBlockState(new BlockPos(i, j, k)).getBlock().dropBlockAsItem(world, new BlockPos(i, j, k), world.getBlockState(new BlockPos(i, j, k)), 1);
world.setBlockToAir(new BlockPos(i, j, k));

}


return true;
}
}).setUnlocalizedName("Wand");
GameRegistry.registerItem(block, "Wand");

}

static class ItemWand extends Item
{
    private Block[] blocksEffectiveAgainst = new Block[]
	                {
	                    
                };

                //harvest level
                int harvest = 1;

    protected float efficiencyOnProperMaterial;

    protected ItemWand()
    {
        efficiencyOnProperMaterial = 4;
        setMaxDamage(1000);
        setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabTools);
    }


    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        for (int i = 0; i < blocksEffectiveAgainst.length; i++)
        {
            if (blocksEffectiveAgainst[i] == par2Block)
            {
                return efficiencyOnProperMaterial;
            }
        }

        return 0.0F;
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving)
    {
        par1ItemStack.damageItem(2, par3EntityLiving);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, Block par3, int par4, int par5, int par6, EntityLivingBase par7EntityLiving){
		    par1ItemStack.damageItem(1, par7EntityLiving);
		    return true;
		}

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    public int getItemEnchantability()
    {
		//kok se lohk cara
        return 2;
    }

    
}
}
