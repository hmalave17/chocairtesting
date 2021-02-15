package Choucairtest.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AuthenticationPage extends PageObject {
	
	public static final Target EMAIL_CREATE = Target.the("Email create").located(By.id("email_create"));
	public static final Target BUTTON_CREATE = Target.the("Button Create").located(By.id("SubmitCreate"));
	public static final Target EMAIL = Target.the("Email").located(By.id("email"));
	public static final Target PASSWORD = Target.the("Password").located(By.id("passwd"));
	public static final Target BUTTON_LOGIN = Target.the("Button Login").located(By.id("SubmitLogin"));
	
	
	

}
