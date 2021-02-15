package Choucairtest.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage extends PageObject {
	
	public static final Target BANK_WIRE = Target.the("BANK_WIRE").located(By.className("bankwire"));
	public static final Target CHEQUE = Target.the("Cheque").located(By.className("cheque"));
	
	

}
