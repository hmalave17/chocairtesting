package Choucairtest.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MyAccountPage extends PageObject {
	
	public static final Target SHOPPING_CAR = Target.the("SHOPPING_CAR").located(By.className("shopping_cart")); 
	public static final Target LOGO = Target.the("Logo").located(By.id("header_logo")); 
	public static final Target BUTTON_CHECKOUT = Target.the("BUTTON_CHECKOUT").located(By.className("button_order_cart"));
	public static final Target MY_ACCOUNT_BREADCRUMS = Target.the("My account breadcrumb").located(By.className("navigation_page"));
	
	
	

}
