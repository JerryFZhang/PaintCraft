// THIS NOT AN AUTOMATICALLY CODE FILE
// THIS NOT AN AUTOMATICALLY CODE FILE
// THIS NOT AN AUTOMATICALLY CODE FILE

import net.minecraftforge.fml.*
import net.minecraft.block.*;
import net.minecraft.client.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import net.minecraft.init.*;
import java.util.*;
import net.minecraftforge.common.util.*;
import net.minecraft.client.resources.model.*;

// Description of the mod goes under.
@Mod(modid = "PaintCraft", name = "PaintCraft", version = "Alpha 0.1")
// Networking for server.
// Not necessary for 0.1
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class test{
  public test(){

    // Empty Constructor.

  }
  // Item type will be a project for the
  public static Item block;

  // DONT KNOW WHATS THIS FOR
  public static Object instance;

  public void load (FMLInitializationEvent event){

    // If the evenr is initislized by the client
    if (event.getSide() == side.CLIENT){

      //Displaying the texture of the block, basicially what it will look like.
      Minecraft.getMinecraft().getRenderItem().getItemModelMesher.register(block, 0, new ModelResourceLocation("nameOfThePicture:pic", inventory));

      //Set recipe f0r creating the item.
      GameRegistry.addRecipe(
        /*
          For storing the item in the inventory ItemStack Object will be used
          the object will be created like this:
          ItemStack stack = new ItemStack((Object)ItemType,[(int)Stack Size],[(Object) Metadata]

          - ItemType is the type and id of the item, for example : Blocks.stone
          - Stack Size is the size of the/each stack its an interger obviously.
          - Metadata is the colouring / Styling / Variation of the item,
            it goes under the id rule of the block for example,
            a dye with Metadata 2 is a cactus dye, but the ItemType is still dye.

          ---
          The blocks in the recipe should be the id of the block in Minecraft
          The ids of the items are listed in the following url:
          http://www.minecraftinfo.com/idlist.htm
          ---

        */

        new ItemStack(block,1), new Object []{
          /*
            Item Coordinates in a 3*3 crafting table
            The pattern of the crafting table canbe imagined as a numpad.
            However, it's a little different in minecraft.
            For example if you want to craft 1,4,7 in the crafting table,
            2,5,8 and 3,6,9 will do the same thing
            since the crafting table only reconize patterns.
            ---
            Therefore we have the recipe pattern
            "X1X", "X4X", "X7X"
          */

          "X1X", "X4X", "X7X"
          Character.valueOf('1'), new ItemStack(Blocks,stone,1),
          Character.valueOf('4'), new ItemStack(Blocks,stone,1),
          Character.valueOf('7'), new ItemStack(Blocks,stone,1),
        }
      );
      GameRegistry.addSmelting(Blocks.lapis_block, stack,)

    }


  }

}
