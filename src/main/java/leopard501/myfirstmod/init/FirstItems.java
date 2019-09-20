package leopard501.myfirstmod.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

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
    }
}
