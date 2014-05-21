package ca.chapeau.exaltation.magicalmaterials;

import ca.chapeau.exaltation.Exaltation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

/**
 * Created by Cédric on 19-05-14.
 */
public class MagicalOreBlock extends Block {

    public MagicalOreBlock() {
        super(Material.rock);
        setBlockName("magicalore");
        setHardness(3.5F);
        setStepSound(Block.soundTypeStone);
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe",2);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(Exaltation.oreBlock);
    }

	@Override
	public int damageDropped (int metadata) {
		return metadata;
	}

	@Override
	public void getSubBlocks(Item id, CreativeTabs tab, List subItems) {
		for (int i = 0; i < MagicalOreItemBlock.NumberOfMagicalOres; i++) {
			subItems.add(new ItemStack(id, 1, i));
		}
	}
}
