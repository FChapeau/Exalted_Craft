package ca.chapeau.exaltation.magicalmaterials;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

/**
 * Created by Chapeau on 2014-05-18.
 */
public class Ingot extends Item
{

	public static final int NumberOfMagicalMaterials = 9;

	public static final String[] subNames =
			{
					"orichalcumIngot",
					"starmetalIngot",
					"moonsilverIngot",
					"soulsteelIngot",
					"redjadeIngot",
					"greenjadeIngot",
					"bluejadeIngot",
					"whitejadeIngot",
					"blackjadeIngot"
			};

	public Ingot()
	{
		super();
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("magicalmaterial");
		this.setHasSubtypes(true);
		setMaxDamage(0);
	}

	@Override
	public int getMetadata(int metadata)
	{
		return metadata;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int arr = MathHelper.clamp_int(itemstack.getItemDamage(), 0, subNames.length);
		return getUnlocalizedName() + "." + subNames[itemstack.getItemDamage()];
	}

	@Override
	public void getSubItems (Item it, CreativeTabs tab, List list)
	{
		for (int i = 0; i < subNames.length; i++)
			//if (!(textureNames[i].equals("")))
				list.add(new ItemStack(it, 1, i));
	}

}
