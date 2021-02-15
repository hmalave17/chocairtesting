package Choucairtest.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SignInPage extends PageObject  {
	
	
	public static final Target EMAIL = Target.the("email").located(By.id("email"));
	public static final Target PASSWORD = Target.the("password").located(By.id("passwd"));
	public static final Target EMAIL_REGISTER = Target.the("email register").located(By.id("email_create"));
	public static final Target BUTTON_CREATE = Target.the("Button create").located(By.id("SubmitCreate"));
	
	
}
