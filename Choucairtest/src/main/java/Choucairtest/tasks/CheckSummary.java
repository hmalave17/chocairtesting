package Choucairtest.tasks;

import Choucairtest.interactions.Choose;
import Choucairtest.interactions.Click;
import Choucairtest.interactions.WaitByElement;
import Choucairtest.userinterfaces.MyAccountPage;
import Choucairtest.userinterfaces.SumaryPage;
import Choucairtest.userinterfaces.YourLogoHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

public class CheckSummary implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(WaitByElement.visible(MyAccountPage.LOGO)); 
		actor.attemptsTo(Click.On(MyAccountPage.LOGO));
		actor.attemptsTo(WaitByElement.visible(YourLogoHomePage.REFERENCE));		
		actor.attemptsTo(Choose.List());		
		actor.attemptsTo(MoveMouse.to(YourLogoHomePage.SHOPPING_CAR)); 
		actor.attemptsTo(Click.On(YourLogoHomePage.BUTTON_CHECKOUT));
		actor.attemptsTo(WaitByElement.visible(SumaryPage.BUTTON_UP_ITEMS));	
		actor.attemptsTo(Click.On(SumaryPage.BUTTON_UP_ITEMS));
		actor.attemptsTo(Scroll.to(SumaryPage.REFERENCE));
		actor.attemptsTo(Click.On(SumaryPage.PROCCED_CHEKOUT_BUTTON));  
			
	}

	public static CheckSummary Items() {
		return Tasks.instrumented(CheckSummary.class); 
	}
}
