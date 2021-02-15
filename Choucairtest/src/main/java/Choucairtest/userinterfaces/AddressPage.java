package Choucairtest.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AddressPage extends PageObject {
	
	public static final Target DELIVERY_ADDRES = Target.the("DELIVERY_ADDRES").located(By.id("id_address_delivery"));
	public static final Target CHECKBOX_DELIVERY_ADDRES = Target.the("CHECKBOXDELIVERY_ADDRES").located(By.id("uniform-addressesAreEquals"));
	public static final Target UPDATE_ADDRES_LEFT = Target.the("APDATE ADDRES").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div/div[2]/div[1]/ul/li[9]/a"));
	public static final Target UPDATE_ADDRES_RIGTH = Target.the("APDATE ADDRES").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div/div[2]/div[2]/ul/li[9]/a"));
	public static final Target NEW_ADDRES = Target.the("NEW ADDRES").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div/p/a"));
	public static final Target MESSAGE = Target.the("message").located(By.name("message"));
	public static final Target PROCCED_CHEKOUT_BUTTON = Target.the("Button Continue shopping").located(By.name("processAddress"));
	public static final Target CONTINUE_SHOPPING_BUTTON = Target.the("Proceed to checkout").located(By.className("btn-default"));
	public static final Target SELECT_ADDRESS2 = Target.the("SELECT_ADDRESS2").located(By.id("id_address_invoice"));
	
	
}
