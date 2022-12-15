package retoautomateTren.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import retoautomateTren.userinterfaces.LocatorBookOpen;
import retoautomateTren.userinterfaces.bookingTrentPage;

public class OpenUp implements Task{
    private bookingTrentPage bookingTrenPage;
    public static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Open.browserOn(bookingTrenPage),
                Click.on(LocatorBookOpen.BOOK_NOW)
        );
    }


}
