package ca.chapeau.exaltation;

import ca.chapeau.exaltation.magicalmaterials.Ingot;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Chapeau on 2014-05-16.
 */
@Mod(modid = Exaltation.MODID, name = Exaltation.MODNAME, version = Exaltation.VERSION)
public class Exaltation {
    public static final String MODID = "exaltation";
    public static final String MODNAME = "Exaltation Mod";
    public static final String VERSION = "0.0.1";

    @Mod.Instance(MODID)
    public static Exaltation instance;

    @SidedProxy(clientSide = "ca.chapeau.exaltation.client.ClientProxy", serverSide = "ca.chapeau.exaltation.CommonProxy")
    public static CommonProxy proxy;

    //Item declarations
    public static Ingot ingot;

    @EventHandler
    public void PreInit (FMLPreInitializationEvent event)
    {
        ingot = new Ingot();
        GameRegistry.registerItem(ingot, ingot.getUnlocalizedName());
    }

    @EventHandler
    public void Init (FMLInitializationEvent event)
    {
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 64), new ItemStack(ingot));
    }

    @EventHandler
    public void PostInit (FMLPostInitializationEvent event)
    {

    }
}
