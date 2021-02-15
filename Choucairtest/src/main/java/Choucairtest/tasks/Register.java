package Choucairtest.tasks;

import Choucairtest.interactions.Click;
import Choucairtest.interactions.WaitByElement;
import Choucairtest.interactions.Write;
import Choucairtest.models.DataRegister;
import Choucairtest.userinterfaces.AuthenticationPage;
import Choucairtest.userinterfaces.CreateAccountPage;
import Choucairtest.userinterfaces.YourLogoHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Shared;

public class Register implements Task{

	@Shared
	DataRegister dataRegister; 
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.On(YourLogoHomePage.LOGIN));
		actor.attemptsTo(Write.On(AuthenticationPage.EMAIL_CREATE, dataRegister.getEmail()));
		actor.attemptsTo(WaitByElement.visible(AuthenticationPage.BUTTON_CREATE)); 
		actor.attemptsTo(Click.On(AuthenticationPage.BUTTON_CREATE));
		actor.attemptsTo(Click.On(CreateAccountPage.RADIO_BUTTON_MR));
		actor.attemptsTo(Write.On(CreateAccountPage.FIRST_NAME, dataRegister.getFirst_name()));
		actor.attemptsTo(Write.On(CreateAccountPage.LAST_NAME, dataRegister.getLast_name()));
		actor.attemptsTo(Write.On(CreateAccountPage.PASSWORD, dataRegister.getPassword()));
		actor.attemptsTo(SelectFromOptions.byValue(dataRegister.getDays()).from(CreateAccountPage.DAYS));
		actor.attemptsTo(SelectFromOptions.byValue(dataRegister.getMonths()).from(CreateAccountPage.MONTHS));
		actor.attemptsTo(SelectFromOptions.byValue(dataRegister.getYears()).from(CreateAccountPage.YEARS)); 
		actor.attemptsTo(Click.On(CreateAccountPage.CHEKBOX_1));
		actor.attemptsTo(Click.On(CreateAccountPage.CHEKBOX_2));
		actor.attemptsTo(Write.On(CreateAccountPage.COMPANY, dataRegister.getCompany()));
		actor.attemptsTo(Write.On(CreateAccountPage.ADRRES1, dataRegister.getAddres1()));
		actor.attemptsTo(Write.On(CreateAccountPage.ADRRES2, dataRegister.getAddres2()));
		actor.attemptsTo(Write.On(CreateAccountPage.CITY, dataRegister.getCity()));
		actor.attemptsTo(SelectFromOptions.byValue(dataRegister.getState()).from(CreateAccountPage.STATE));
		actor.attemptsTo(Write.On(CreateAccountPage.POST_CODE, dataRegister.getPost_code()));
		actor.attemptsTo(Write.On(CreateAccountPage.OTHER_INFORMATION, dataRegister.getOther_information()));
		actor.attemptsTo(Write.On(CreateAccountPage.HOME_PHONE, dataRegister.getHome_phone()));
		actor.attemptsTo(Write.On(CreateAccountPage.MOVILE_PHONE, dataRegister.getMovil_phone()));
		actor.attemptsTo(Click.On(CreateAccountPage.BUTTON_REGISTER)); 
		  
		
	} 
 
	public static Register User() {
		return Tasks.instrumented(Register.class); 
	}
	
}
