package leopard501.myfirstmod.init;

import leopard501.myfirstmod.init.armor.ArmorBase;
import leopard501.myfirstmod.init.tools.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

import static leopard501.myfirstmod.proxy.CommonProxy.ARMOR_FREA;
import static leopard501.myfirstmod.proxy.CommonProxy.FREA;

public class FirstItems {

    public static ArrayList<ItemBase> ITEMS = new ArrayList<>();

    public static ItemBase itemFreaNugget = new ItemBase("frea_nugget");
    public static ItemBase itemFreaIngot = new ItemBase("frea_ingot");

    @GameRegistry.ObjectHolder("myfirstmod:frea_sword")
    public static ToolSword itemFreaSword = new ToolSword("frea_sword", FREA);

    @GameRegistry.ObjectHolder("myfirstmod:frea_shovel")
    public static ToolSpade itemFreaShovel = new ToolSpade("frea_shovel", FREA);

    @GameRegistry.ObjectHolder("myfirstmod:frea_pickaxe")
    public static ToolPickaxe itemFreaPickaxe = new ToolPickaxe("frea_pickaxe", FREA);

    @GameRegistry.ObjectHolder("myfirstmod:frea_axe")
    public static ToolAxe itemFreaAxe = new ToolAxe("frea_axe", FREA);

    @GameRegistry.ObjectHolder("myfirstmod:frea_hoe")
    public static ToolHoe itemFreaHoe = new ToolHoe("frea_hoe", FREA);

    @GameRegistry.ObjectHolder("myfirstmod:frea_helmet")
    public static ArmorBase itemFreaHelmet = new ArmorBase("frea_helmet", ARMOR_FREA, 1, EntityEquipmentSlot.HEAD);

    @GameRegistry.ObjectHolder("myfirstmod:frea_chestplate")
    public static ArmorBase itemFreaChestplate = new ArmorBase("frea_chestplate", ARMOR_FREA, 1, EntityEquipmentSlot.CHEST);

    @GameRegistry.ObjectHolder("myfirstmod:frea_leggings")
    public static ArmorBase itemFreaLeggings = new ArmorBase("frea_leggings", ARMOR_FREA, 2, EntityEquipmentSlot.LEGS);

    @GameRegistry.ObjectHolder("myfirstmod:frea_boots")
    public static ArmorBase itemFreaBoots = new ArmorBase("frea_boots", ARMOR_FREA, 1, EntityEquipmentSlot.FEET);

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        for (int i = 0; i < ITEMS.size(); i++){
            ITEMS.get(i).initModel();
        }

        itemFreaSword.initModel();
        itemFreaShovel.initModel();
        itemFreaPickaxe.initModel();
        itemFreaAxe.initModel();
        itemFreaHoe.initModel();

        itemFreaHelmet.initModel();
        itemFreaChestplate.initModel();
        itemFreaLeggings.initModel();
        itemFreaBoots.initModel();
    }
}
