package retoautomateTren.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import retoautomateTren.model.DataRegister;

import java.util.List;

import static retoautomateTren.userinterfaces.LocatorUtestSecondStep.*;
/*
public class SecondtStep implements Task {
   private List<DataRegister>data;
    public SecondtStep(List<DataRegister>data){
        this.data = data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TEXT_CITY),
                Clear.field(TEXT_CITY),
                Enter.theValue(data.get(0).getCity()).into(TEXT_CITY),
                Enter.keyValues(Keys.ARROW_DOWN).into(TEXT_CITY),
                Enter.keyValues(Keys.ENTER).into(TEXT_CITY),

                Enter.theValue(data.get(0).getZipCode()).into(TEXT_ZIP_CODE),

                Click.on(LIST_COUNTRY),
                Enter.theValue(data.get(0).getCountry()).into(TEXT_COUNTRY),
                Enter.keyValues(Keys.ENTER).into(TEXT_COUNTRY),

                Click.on(BUTTON_THIRD_STEP));

    }
    public static SecondtStep fillForm(List<DataRegister> data){
        return Tasks.instrumented(SecondtStep.class,data);
    }


}
*/