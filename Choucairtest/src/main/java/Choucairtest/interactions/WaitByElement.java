package Choucairtest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class WaitByElement implements Interaction {

	
	private Target element;
	
	public WaitByElement(Target element) {
		this.element = element; 
	}
	
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(this.element, WebElementStateMatchers.isVisible()));
		
	} 

	public static WaitByElement visible (Target element) {
		return Tasks.instrumented(WaitByElement.class, element); 
	}
} 
