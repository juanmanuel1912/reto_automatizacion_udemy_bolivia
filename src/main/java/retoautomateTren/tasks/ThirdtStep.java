package retoautomateTren.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import retoautomateTren.model.DataRegister;

import java.util.List;

import static retoautomateTren.userinterfaces.LocatorUtestThirdStep.*;
/*
public class ThirdtStep implements Task {
  private List<DataRegister>data;
  public ThirdtStep(List<DataRegister>data){
      this.data=data;
  }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(LIST_YOUR_COMPUTER),
                Enter.theValue(data.get(0).getYourComputer()).into(TEXT_YOUR_COMPUTER),
                Enter.keyValues(Keys.ENTER).into(TEXT_YOUR_COMPUTER),

                Click.on(LIST_VERSION),
                Enter.theValue(data.get(0).getVersion()).into(TEXT_VERSION),
                Enter.keyValues(Keys.ENTER).into(TEXT_VERSION),

                Click.on(LIST_LANGUAGE),
                Enter.theValue(data.get(0).getLanguage()).into(TEXT_LANGUAGE),
                Enter.keyValues(Keys.ENTER).into(TEXT_LANGUAGE),

                Click.on(LIST_YOUR_MOVIL_DEVICE),
                Enter.theValue(data.get(0).getYourMovilDevice()).into(TEXT_YOUR_MOVIL_DEVICE),
                Enter.keyValues(Keys.ENTER).into(TEXT_YOUR_MOVIL_DEVICE),

                Click.on(LIST_MODEL),
                Enter.theValue(data.get(0).getYourModel()).into(TEXT_MODEL),
                Enter.keyValues(Keys.ENTER).into(TEXT_MODEL),

                Click.on(LIST_OPERATING_SYSTEM),
                Enter.theValue(data.get(0).getOperatingSystem()).into(TEXT_OPERATING_SYSTEM),
                Enter.keyValues(Keys.ENTER).into(TEXT_OPERATING_SYSTEM),


                Click.on(BUTTON_FOURT_STEP)
        );
    }

    public  static ThirdtStep fillForm(List<DataRegister> data){
        return Tasks.instrumented(ThirdtStep.class,data);
    }
}
*/