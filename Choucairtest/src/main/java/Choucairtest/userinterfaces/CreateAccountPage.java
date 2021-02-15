package Choucairtest.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreateAccountPage extends PageObject {
	
	public static final Target RADIO_BUTTON_MRS = Target.the("radio button Mrs").located(By.id("uniform-id_gender2"));
	public static final Target RADIO_BUTTON_MR = Target.the("Radio button Mr").located(By.id("id_gender1"));
	public static final Target FIRST_NAME = Target.the("First name").located(By.id("customer_firstname"));
	public static final Target LAST_NAME = Target.the("last name").located(By.id("customer_lastname"));
	public static final Target EMAIL = Target.the("Email").located(By.id("email"));
	public static final Target PASSWORD = Target.the("Password").located(By.id("passwd"));
	public static final Target DAYS = Target.the("days").located(By.id("days"));
	public static final Target MONTHS = Target.the("months").located(By.id("months"));
	public static final Target YEARS = Target.the("Years").located(By.id("years"));
	public static final Target COMPANY = Target.the("Company").located(By.id("company"));
	public static final Target ADRRES1 = Target.the("Adrress1").located(By.id("address1"));
	public static final Target ADRRES2 = Target.the("Adrress2").located(By.id("address2"));
	public static final Target CITY = Target.the("City").located(By.id("city"));
	public static final Target STATE = Target.the("state").located(By.id("id_state"));
	public static final Target POST_CODE = Target.the("CODE POST").located(By.id("postcode"));
	public static final Target CONTRY = Target.the("CONTRY").located(By.id("id_country"));
	public static final Target OTHER_INFORMATION = Target.the("OTHER").located(By.id("other"));
	public static final Target HOME_PHONE = Target.the("HOME_PHONE").located(By.id("phone"));
	public static final Target MOVILE_PHONE = Target.the("MOVILE_PHONE").located(By.id("phone_mobile"));
	public static final Target ALIAS = Target.the("ALIAS").located(By.id("alias"));
	public static final Target CHEKBOX_1 = Target.the("CHEKBOX 1").located(By.id("uniform-newsletter"));
	public static final Target CHEKBOX_2 = Target.the("CHEKBOX 2").located(By.id("uniform-optin"));
	public static final Target BUTTON_REGISTER = Target.the("Button Register").located(By.id("submitAccount"));
		
}
