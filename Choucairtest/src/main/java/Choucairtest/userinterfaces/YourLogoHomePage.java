package Choucairtest.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class YourLogoHomePage extends PageObject {
	
	
	public static final Target LOGIN = Target.the("Login").located(By.className("login")); 
	public static final Target IMAGEN_ONE = Target.the("Imagen_one").located(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img")); 
	public static final Target ADD_BUTTON = Target.the("Add Button").located(By.id("add_to_cart"));   
	public static final Target CONTINUE_SHOPPING_BUTTON = Target.the("Button Continue shopping").located(By.className("exclusive-medium"));
	public static final Target TEXT_QUANTITY_UP = Target.the("Text Quantity up").located(By.id("quantity_wanted"));
	public static final Target FRAME_ADD_TO_CART = Target.the("Iframe add tocart").located(By.className("fancybox-iframe"));
	public static final Target REFERENCE = Target.the("Reference").located(By.id("home-page-tabs"));
	public static final Target QUICK_VIEW = Target.the("Quick-view").located(By.className("quick-view")); 
	public static final Target SHOPPING_CAR = Target.the("shopping cart").located(By.className("shopping_cart")); 
	public static final Target BUTTON_CHECKOUT = Target.the("button checkout").located(By.className("unvisible"));
	
	
	
}  
