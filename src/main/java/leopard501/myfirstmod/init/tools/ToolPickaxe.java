package leopard501.myfirstmod.init.tools;

import leopard501.myfirstmod.MyFirstMod;
import leopard501.myfirstmod.init.IBaseModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ToolPickaxe extends ItemPickaxe implements IBaseModel {

    public ToolPickaxe(String name, ToolMaterial material) {
        super(material);

        setRegistryName(name);
        setUnlocalizedName(MyFirstMod.MODID + "." + name);
        setCreativeTab(MyFirstMod.tabMyFirstTab);
    }

    @Override
    public void registerModels(){

        MyFirstMod.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {

        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
