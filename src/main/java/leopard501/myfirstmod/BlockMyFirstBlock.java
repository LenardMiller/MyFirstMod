package leopard501.myfirstmod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMyFirstBlock extends Block {

    public static final ResourceLocation my_first_block = new ResourceLocation(MyFirstMod.MODID,"my_first_block");

    public BlockMyFirstBlock() {
        super(Material.REDSTONE_LIGHT);
        setUnlocalizedName(MyFirstMod.MODID + ".my_first_block");
        setRegistryName(my_first_block);
        setCreativeTab(MyFirstMod.tabMyFirstTab);
        setLightLevel(1);
        setSoundType(SoundType.GLASS);
        setHardness(0.25f);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
