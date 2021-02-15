package Choucairtest.tasks;

import Choucairtest.interactions.Click;
import Choucairtest.interactions.WaitByElement;
import Choucairtest.userinterfaces.OrderSumaryPage;
import Choucairtest.userinterfaces.PaymentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class CheckPayment implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(WaitByElement.visible(PaymentPage.BANK_WIRE));
		actor.attemptsTo(WaitByElement.visible(PaymentPage.BANK_WIRE)); 
		actor.attemptsTo(Click.On(PaymentPage.BANK_WIRE));
		actor.attemptsTo(WaitByElement.visible(OrderSumaryPage.I_CONFIRM_MY_ORDER));
		actor.attemptsTo(Click.On(OrderSumaryPage.I_CONFIRM_MY_ORDER));
		
		
	}
	
	public static CheckPayment Items() {
		return Tasks.instrumented(CheckPayment.class); 
	}

}
