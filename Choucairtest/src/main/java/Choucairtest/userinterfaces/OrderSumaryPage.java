package Choucairtest.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrderSumaryPage extends PageObject {

	public static final Target OTHER_PAYMENT_METHODS = Target.the("Proceed to checkout").located(By.className("btn-default"));
	public static final Target I_CONFIRM_MY_ORDER = Target.the("I CONFIRM MY ORDER").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
	
}
