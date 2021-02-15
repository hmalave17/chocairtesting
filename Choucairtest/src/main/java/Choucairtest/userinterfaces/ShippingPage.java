package Choucairtest.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ShippingPage extends PageObject {
	
	public static final Target CHEKBOK = Target.the("Chekbox").located(By.id("uniform-cgv"));
	public static final Target IFRAME_READ = Target.the("Chekbox").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/a"));
	public static final Target IFRAME = Target.the("Iframe").located(By.className("iframe"));
	public static final Target CONTINUE_SHOPPING_BUTTON = Target.the("Proceed to checkout").located(By.className("btn-default"));
	public static final Target CLOSE_BUTTON = Target.the("Clouse Button").located(By.xpath("//*[@id=\"order\"]/div[2]/div/div/a"));
	public static final Target PROCED_CHECKOUT_BUTTON = Target.the("PROCED_CHECKOUT_BUTTON").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button"));
	
	
	

	
	
}
