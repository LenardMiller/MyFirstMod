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

public class BlockFreaOre extends Block {

    public static final ResourceLocation frea_ore = new ResourceLocation(MyFirstMod.MODID,"frea_ore");

    public BlockFreaOre() {
        super(Material.ROCK);
        setUnlocalizedName(MyFirstMod.MODID + ".frea_ore");
        setRegistryName(frea_ore);
        setCreativeTab(MyFirstMod.tabMyFirstTab);
        setSoundType(SoundType.STONE);
        setHardness(2);
        setHarvestLevel("pickaxe", 2);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
