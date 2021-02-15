package Choucairtest.tasks;

import Choucairtest.interactions.Click;
import Choucairtest.interactions.WaitByElement;
import Choucairtest.interactions.Write;
import Choucairtest.models.DataAddress;
import Choucairtest.userinterfaces.AddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;

public class CheckAddress implements Task {

	@Shared
	DataAddress dataAddress; 
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(WaitByElement.visible(AddressPage.MESSAGE));
		actor.attemptsTo(Click.On(AddressPage.CHECKBOX_DELIVERY_ADDRES)); 
		actor.attemptsTo(Write.On(AddressPage.MESSAGE, dataAddress.getMensaje()));
		actor.attemptsTo(WaitByElement.visible(AddressPage.PROCCED_CHEKOUT_BUTTON));
		actor.attemptsTo(Click.On(AddressPage.PROCCED_CHEKOUT_BUTTON));
		
		  
	} 

	public static CheckAddress User() {
		return Tasks.instrumented(CheckAddress.class); 
	}
}
