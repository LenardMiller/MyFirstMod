package leopard501.myfirstmod.init.armor;

import leopard501.myfirstmod.MyFirstMod;
import leopard501.myfirstmod.init.IBaseModel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorBase extends ItemArmor implements IBaseModel {

    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn){
        super(materialIn, renderIndexIn, equipmentSlotIn);

        setRegistryName(name);
        setUnlocalizedName(MyFirstMod.MODID + "." + name);
        setCreativeTab(MyFirstMod.tabMyFirstTab);
    }

    @Override
    public void registerModels() {}

    @SideOnly(Side.CLIENT)
    public void initModel() {

        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
