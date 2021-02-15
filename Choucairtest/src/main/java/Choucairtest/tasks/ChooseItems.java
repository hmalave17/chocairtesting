package Choucairtest.tasks;


import Choucairtest.interactions.Choose;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;



public class ChooseItems implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Choose.List());
	 
	} 

	public static ChooseItems Quantity() {
		return Tasks.instrumented(ChooseItems.class); 
	}
} 
 