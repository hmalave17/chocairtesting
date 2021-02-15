package Choucairtest.tasks;

import Choucairtest.interactions.Click;
import Choucairtest.interactions.WaitByElement;
import Choucairtest.userinterfaces.ShippingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class CheckShipping implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(WaitByElement.visible(ShippingPage.CHEKBOK));  
		actor.attemptsTo(Click.On(ShippingPage.CHEKBOK)); 
		actor.attemptsTo(Click.On(ShippingPage.IFRAME_READ));
		actor.attemptsTo(WaitByElement.visible(ShippingPage.CLOSE_BUTTON)); ;
		actor.attemptsTo(Click.On(ShippingPage.CLOSE_BUTTON)); 
		actor.attemptsTo(Click.On(ShippingPage.PROCED_CHECKOUT_BUTTON));
		 
	}
	
	public static CheckShipping Items() {
		return Tasks.instrumented(CheckShipping.class);  
	}
}
