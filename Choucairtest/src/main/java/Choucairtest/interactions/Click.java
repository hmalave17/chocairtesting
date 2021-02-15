package Choucairtest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class Click implements Interaction {
	
	private Target element;
	
	public Click (Target element) {
		this.element = element;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(WaitByElement.visible(this.element)); 
		actor.attemptsTo(net.serenitybdd.screenplay.actions.Click.on(this.element)); 
		
	}

	public static Click On (Target element) {
	 return Tasks.instrumented(Click.class, element); 	 
	}
}
