package retoautomateTren.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import retoautomateTren.model.DataRegister;

import java.util.List;

import static retoautomateTren.userinterfaces.LocatorUtestFourtStep.*;
/*
public class FourttStep implements Task {
    private List<DataRegister>data;
    public FourttStep(List<DataRegister>data){
        this.data=data;
    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(data.get(0).getPassword()).into(PASSWORD),
                Enter.theValue(data.get(0).getPassword()).into(CONFIRM_PASSWORD),
                        Click.on(TERM_USE),
                        Click.on(PRIVATE_SETTING),
                        Click.on(BUTTON_REGISTER));



    }


    public static FourttStep fillForm(List<DataRegister> data) {
        return Tasks.instrumented(FourttStep.class,data);
    }
}
*/