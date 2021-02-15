package Choucairtest.stepDefinitions;

import org.openqa.selenium.WebDriver;

import Choucairtest.tasks.CheckAddress;
import Choucairtest.tasks.CheckPayment;
import Choucairtest.tasks.CheckShipping;
import Choucairtest.tasks.CheckSummary;
import Choucairtest.tasks.Login;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class MakePurchase {
	
	@Managed(driver = "Chrome")
	WebDriver herBrowser;
	Actor user = Actor.named("user");
	
	@When("^user do login$")
	public void user_do_login() {
		user.can(BrowseTheWeb.with(herBrowser));
		user.attemptsTo(Login.user()); 
	  
	}

	@Then("^user confirm the steps$")
	public void user_confirm_the_steps() {
		user.attemptsTo(CheckSummary.Items());
		user.attemptsTo(CheckAddress.User());
		user.attemptsTo(CheckShipping.Items());
		 
	
	}

	@Then("^user buy items$")
	public void user_buy_items() {
		user.attemptsTo(CheckPayment.Items());
	  
	}

}
