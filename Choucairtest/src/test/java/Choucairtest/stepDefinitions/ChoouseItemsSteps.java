package Choucairtest.stepDefinitions;

import org.openqa.selenium.WebDriver;
import Choucairtest.tasks.ChooseItems;
import Choucairtest.utils.Words;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class ChoouseItemsSteps {

	@Managed(driver = "Chrome")
	WebDriver herBrowser;
	Actor user = Actor.named("user");

	@Given("^user enter the portal web$")
	public void user_enter_the_portal_web() throws Throwable {

		user.can(BrowseTheWeb.with(herBrowser));
		user.attemptsTo(Open.url(SystemEnvironmentVariables.createEnvironmentVariables().getProperty(Words.URL_HOMEPAGE)));
	}

	
	@When("^user select a items$")
	public void user_select_a_items() {
		user.attemptsTo(ChooseItems.Quantity());  
	}
	

}
