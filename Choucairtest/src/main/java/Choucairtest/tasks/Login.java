package Choucairtest.tasks;

import Choucairtest.interactions.Click;
import Choucairtest.interactions.WaitByElement;
import Choucairtest.interactions.Write;
import Choucairtest.models.DataLogin;
import Choucairtest.userinterfaces.AuthenticationPage;
import Choucairtest.userinterfaces.YourLogoHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;

public class Login implements Task {
	
	@Shared
	DataLogin datalogin; 

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(WaitByElement.visible(YourLogoHomePage.LOGIN));
		actor.attemptsTo(Click.On(YourLogoHomePage.LOGIN));
		actor.attemptsTo(WaitByElement.visible(AuthenticationPage.EMAIL));
		actor.attemptsTo(Write.On(AuthenticationPage.EMAIL, datalogin.getEmail()));
		actor.attemptsTo(Write.On(AuthenticationPage.PASSWORD, datalogin.getPassword()));
		actor.attemptsTo(Click.On(AuthenticationPage.BUTTON_LOGIN));  
		
	}

	public static Login user() { 
		return Tasks.instrumented(Login.class); 
	}
}
 