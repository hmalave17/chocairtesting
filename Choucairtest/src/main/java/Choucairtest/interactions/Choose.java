package Choucairtest.interactions;


import Choucairtest.userinterfaces.YourLogoHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;



public class Choose implements Interaction {

	

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Scroll.to(YourLogoHomePage.REFERENCE));
		actor.attemptsTo(MoveMouse.to(YourLogoHomePage.IMAGEN_ONE));
		actor.attemptsTo(Click.On(YourLogoHomePage.QUICK_VIEW));
		actor.attemptsTo(WaitByElement.visible(YourLogoHomePage.FRAME_ADD_TO_CART));
		actor.attemptsTo(Switch.toFrame(YourLogoHomePage.FRAME_ADD_TO_CART.resolveFor(actor)));
		actor.attemptsTo(Write.On(YourLogoHomePage.TEXT_QUANTITY_UP, "2"));
		actor.attemptsTo(Click.On(YourLogoHomePage.ADD_BUTTON));
		actor.attemptsTo(Switch.toParentFrame());
		actor.attemptsTo(WaitByElement.visible(YourLogoHomePage.CONTINUE_SHOPPING_BUTTON));
		actor.attemptsTo(Click.On(YourLogoHomePage.CONTINUE_SHOPPING_BUTTON));
				  
	}

	public static Choose List() {
		return Tasks.instrumented(Choose.class); 

	}
}
