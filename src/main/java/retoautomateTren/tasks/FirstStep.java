package retoautomateTren.tasks;

import com.gargoylesoftware.css.parser.selector.SelectorList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.apache.bcel.generic.RETURN;
import org.codehaus.groovy.ast.stmt.ReturnStatement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import retoautomateTren.model.DataRegister;
import retoautomateTren.userinterfaces.LocatorBookOpen;

import java.util.List;


import static retoautomateTren.userinterfaces.LocatorBookFirstStep.*;
import static retoautomateTren.userinterfaces.LocatorUtestSecondStep.TEXT_CITY;


public class FirstStep implements Task {
    private List<DataRegister>data;
    public FirstStep (List<DataRegister>data){
        this.data=data;
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                Click.on(TIPE_TRAVEL),

                Click.on(DESTINATION),
                Enter.keyValues(Keys.ARROW_DOWN).into(DESTINATION),
                Enter.keyValues(Keys.ENTER).into(DESTINATION),

                Click.on(ROUTE),
                Enter.keyValues(Keys.ARROW_DOWN).into(ROUTE),
                Enter.keyValues(Keys.ENTER).into(ROUTE),


                Click.on(DEPARTURE),
               // Enter.theValue(data.get(0).getDataToSetIni()).into(DEPARTURE),
               // Enter.keyValues(Keys.ENTER).into(DEPARTURE),




                Click.on(RETURN),
             //   Enter.theValue(data.get(0).getDataToSetEnd()).into(RETURN),
               // Enter.keyValues(Keys.ENTER).into(RETURN),




                //*[@id="ui-datepicker-div"]/div/div/select[1]


                Click.on(ADULTS),
               // Enter.keyValues(Keys.ARROW_DOWN).into(ADULTS),
              //  Enter.keyValues(Keys.ENTER).into(ADULTS),

                Click.on(CHILDREN),
               // Enter.keyValues(Keys.ARROW_DOWN).into(CHILDREN),
               // Enter.keyValues(Keys.ENTER).into(CHILDREN),


                Click.on(BUTTON_SECOND_STEP));
    }



    public static FirstStep fillform(List<DataRegister>data){
        return Tasks.instrumented(FirstStep.class,data);
    }
}
