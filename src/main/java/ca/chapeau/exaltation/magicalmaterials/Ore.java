package ca.chapeau.exaltation.magicalmaterials;

import ca.chapeau.exaltation.Exaltation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Cédric on 19-05-14.
 */
public class Ore extends Block {

    public Ore() {
        super(Material.rock);
        setHardness(2.5F);
        setStepSound(Block.soundTypeStone);
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe",2);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Exaltation.ingot;
    }
}
