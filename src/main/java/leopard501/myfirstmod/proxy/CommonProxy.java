package leopard501.myfirstmod.proxy;

import leopard501.myfirstmod.*;
import leopard501.myfirstmod.init.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    public static final Item.ToolMaterial FREA = EnumHelper.addToolMaterial("material_frea", 0, 1262, 5, 2.0f, 17);

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockMyFirstBlock());
        event.getRegistry().register(new BlockFreaOre());
        event.getRegistry().register(new BlockFreaBlock());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(FirstBlocks.blockMyFirstBlock).setRegistryName(BlockMyFirstBlock.my_first_block));
        event.getRegistry().register(new ItemBlock(FirstBlocks.blockFreaOre).setRegistryName(BlockFreaOre.frea_ore));
        event.getRegistry().register(new ItemBlock(FirstBlocks.blockFreaBlock).setRegistryName(BlockFreaBlock.frea_block));
        event.getRegistry().register(new ToolSword("frea_sword", FREA));
        event.getRegistry().register(new ToolSpade("frea_shovel", FREA));
        event.getRegistry().register(new ToolPickaxe("frea_pickaxe", FREA));
        event.getRegistry().register(new ToolAxe("frea_axe", FREA));
        event.getRegistry().register(new ToolHoe("frea_hoe", FREA));
        event.getRegistry().register(new ItemBase("frea_nugget"));
        event.getRegistry().register(new ItemBase("frea_ingot"));
    }

    public void registerItemRenderer(Item item, int meta, String id) {}
}