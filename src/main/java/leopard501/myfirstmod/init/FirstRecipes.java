package leopard501.myfirstmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstRecipes {

    public static void init() {
        GameRegistry.addSmelting(FirstBlocks.blockFreaOre, new ItemStack(FirstItems.itemFreaIngot, 1), 1.0f);
    }
}
