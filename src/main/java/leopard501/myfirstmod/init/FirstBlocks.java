package leopard501.myfirstmod.init;

import leopard501.myfirstmod.BlockFreaBlock;
import leopard501.myfirstmod.BlockFreaOre;
import leopard501.myfirstmod.BlockMyFirstBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FirstBlocks {

    @GameRegistry.ObjectHolder("myfirstmod:my_first_block")
    public static BlockMyFirstBlock blockMyFirstBlock;

    @GameRegistry.ObjectHolder("myfirstmod:frea_ore")
    public static BlockFreaOre blockFreaOre;

    @GameRegistry.ObjectHolder("myfirstmod:frea_block")
    public static BlockFreaBlock blockFreaBlock;

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        blockMyFirstBlock.initModel();
        blockFreaOre.initModel();
        blockFreaBlock.initModel();
    }
}
