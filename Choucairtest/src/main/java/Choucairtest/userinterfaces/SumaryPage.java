package Choucairtest.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SumaryPage extends PageObject {
	
	
	public static final Target CART_TITLE_SUMARY = Target.the("Cart title").located(By.id("cart_title"));
	public static final Target BUTTON_UP_ITEMS = Target.the("Button Up Items").located(By.id("cart_quantity_up_1_1_0_447493"));
	public static final Target BUTTON_DOWN_ITEMS = Target.the("Button down Items").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/div/a[1]"));
	public static final Target BUTTON_DELETE_ITEMS = Target.the("Button down Items").located(By.id("1_1_0_0"));
	public static final Target REFERENCE = Target.the("Cart title").located(By.id("newsletter_block_left"));
	public static final Target PROCCED_CHEKOUT_BUTTON = Target.the("Button Continue shopping").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
	public static final Target CONTINUE_SHOPPING_BUTTON = Target.the("Proceed to checkout").located(By.className("btn-default"));
	 
	

}
