package ca.chapeau.exaltation.magicalmaterials;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Chapeau on 2014-05-18.
 */
public class Ingot extends Item{

    public Ingot()
    {
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("ingot");

    }
}
