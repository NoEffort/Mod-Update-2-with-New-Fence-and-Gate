package christopher.tutorial.handlers;

import christopher.tutorial.init.ArmorInit;
import christopher.tutorial.init.ItemInit;
import christopher.tutorial.init.BlockInit;
import christopher.tutorial.init.ToolInit;

public class RegistryHandler 
{
	public static void Client()
	{
		RecipeHandler.registerFurnaceRecipes();
	}
	
	public static void Common()
	{
		ItemInit.init();
		ItemInit.register();
		
		BlockInit.init();
		BlockInit.register();
		
		ToolInit.init();
		ToolInit.register();
		
		ArmorInit.init();
		ArmorInit.register();
	}
}
