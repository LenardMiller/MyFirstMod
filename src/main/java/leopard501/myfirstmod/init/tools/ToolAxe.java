package leopard501.myfirstmod.init.tools;

import leopard501.myfirstmod.MyFirstMod;
import leopard501.myfirstmod.init.IBaseModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ToolAxe extends ItemAxe implements IBaseModel {

    public ToolAxe(String name, ToolMaterial material) {
        super(material,8.0f,-3.2f);

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
