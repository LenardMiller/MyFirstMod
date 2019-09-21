package leopard501.myfirstmod.proxy;

import leopard501.myfirstmod.*;
import leopard501.myfirstmod.init.*;
import leopard501.myfirstmod.init.armor.ArmorBase;
import leopard501.myfirstmod.init.tools.*;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
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
    public static final ItemArmor.ArmorMaterial ARMOR_FREA = EnumHelper.addArmorMaterial("armor_material_frea", "myfirstmod:frea", 18, new int[]{3,5,6,2},17, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f);

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

        event.getRegistry().register(new ArmorBase("frea_helmet", ARMOR_FREA, 1, EntityEquipmentSlot.HEAD));
        event.getRegistry().register(new ArmorBase("frea_chestplate", ARMOR_FREA, 1, EntityEquipmentSlot.CHEST));
        event.getRegistry().register(new ArmorBase("frea_leggings", ARMOR_FREA, 2, EntityEquipmentSlot.LEGS));
        event.getRegistry().register(new ArmorBase("frea_boots", ARMOR_FREA, 1, EntityEquipmentSlot.FEET));
    }

    public void registerItemRenderer(Item item, int meta, String id) {}
}