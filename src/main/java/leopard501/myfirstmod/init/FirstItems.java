package leopard501.myfirstmod.init;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

import static leopard501.myfirstmod.proxy.CommonProxy.FREA;

public class FirstItems {

    public static ArrayList<ItemBase> ITEMS = new ArrayList<>();

    public static ToolSword itemFreaSword = new ToolSword("frea_sword", FREA);

    public static ToolSpade itemFreaShovel = new ToolSpade("frea_spade", FREA);

    public static ItemBase itemFreaNugget = new ItemBase("frea_nugget");
    public static ItemBase itemFreaIngot = new ItemBase("frea_ingot");

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        for (int i = 0; i < ITEMS.size(); i++){
            ITEMS.get(i).initModel();
        }

        itemFreaSword.initModel();
        itemFreaShovel.initModel();
    }
}
