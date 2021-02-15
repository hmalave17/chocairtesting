package Choucairtest.stepDefinitions;

import org.openqa.selenium.WebDriver;

import Choucairtest.tasks.Register;
import Choucairtest.userinterfaces.MyAccountPage;
import Choucairtest.utils.Words;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

public class RegisterSteps {

	@Managed(driver = "Chrome")
	WebDriver herBrowser;
	Actor user = Actor.named("user");

	@When("^user enter their data and follow steps$")
	public void user_enter_their_data_and_follow_steps() {
		user.can(BrowseTheWeb.with(herBrowser));
		user.attemptsTo(Register.User());
	}

	@Then("^user is registered$")
	public void user_is_registered() {
		user.attemptsTo(Ensure.that(MyAccountPage.MY_ACCOUNT_BREADCRUMS).text().isEqualTo(Words.MY_ACCOUNT));
	}

}
