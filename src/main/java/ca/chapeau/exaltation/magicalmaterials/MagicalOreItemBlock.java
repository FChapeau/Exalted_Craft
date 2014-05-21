package ca.chapeau.exaltation.magicalmaterials;

import ca.chapeau.exaltation.Exaltation;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/**
 * Created by Cédric on 19-05-14.
 */
public class MagicalOreItemBlock extends ItemBlock {

    public static final int NumberOfMagicalOres = 5;

    public static final String[] OreNames =
            {
                    "redjadeOre",
                    "greenjadeOre",
                    "bluejadeOre",
                    "whitejadeOre",
                    "blackjadeOre"
            };

    public MagicalOreItemBlock(Block b) {
        super(b);
        setHasSubtypes(true);
        setUnlocalizedName("magicalore");
    }

    @Override
    public int getMetadata(int damagevalue) {
        return damagevalue;
    }

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		int arr = MathHelper.clamp_int(stack.getItemDamage(), 0, NumberOfMagicalOres);
		return getUnlocalizedName() + "." + OreNames[arr];
	}
}
