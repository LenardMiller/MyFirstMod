package leopard501.myfirstmod;

import leopard501.myfirstmod.init.FirstBlocks;
import leopard501.myfirstmod.init.FirstRecipes;
import leopard501.myfirstmod.proxy.CommonProxy;
import leopard501.myfirstmod.world.OreGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = MyFirstMod.MODID, name = MyFirstMod.MODNAME, version = MyFirstMod.MODVERSION, dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true)
public class MyFirstMod {

    public static final String MODID = "myfirstmod";
    public static final String MODNAME = "My First Mod";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "leopard501.myfirstmod.proxy.ClientProxy", serverSide = "leopard501.myfirstmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tabMyFirstTab = new CreativeTabs("My First Creative Tab!") {
        @Override
        public ItemStack getTabIconItem() { return new ItemStack(FirstBlocks.blockMyFirstBlock); }
        public String getTabLabel() { return super.getTabLabel(); }
        public String getTranslatedTabLabel() { return super.getTabLabel(); }
    };

    @Mod.Instance
    public static MyFirstMod instance;
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
        GameRegistry.registerWorldGenerator(new OreGen(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        FirstRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}