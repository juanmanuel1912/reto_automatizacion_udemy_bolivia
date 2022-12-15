package retoautomateTren.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import retoautomateTren.evidenciasWord.PasoyEvidencia;
import retoautomateTren.evidenciasWord.PrintEvi;
import retoautomateTren.model.DataRegister;
import retoautomateTren.questions.TheTitle;
import retoautomateTren.tasks.*;

import java.util.List;
import java.util.regex.Pattern;



public class BookingTrenStepDefinitions {

    Pattern pattern;
    PrintEvi impresion = new PrintEvi();
    PasoyEvidencia imprimedescripcionPaso;



    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^start testing of evidence register$")
    public void startTestingOfEvidenceRegister() throws Throwable{
        impresion.defineVariables();
    }




    @Given("^the user could going to the option of menu book now$")
    public void the_user_could_going_to_the_option_of_menu_book_now()throws Throwable {
        OnStage.theActorCalled("juan").wasAbleTo(OpenUp.thePage());

        System.out.println("Ir a la opcion del menu book now");

        imprimedescripcionPaso = new PasoyEvidencia("se escribe user");
    }

    @When("^the user could complete all the dates to buy ticket reservation$")
    public void the_user_could_complete_all_the_dates_to_buy_ticket_reservation(List<DataRegister> data)throws Throwable {
        OnStage.theActorInTheSpotlight().attemptsTo(FirstStep.fillform(data));

        System.out.println("Ir a la opcion reservaciom");

        imprimedescripcionPaso = new PasoyEvidencia("Ir a la opcion reservaciom\"");
    }

    @Then("^The ticket is registered succelfull$")
    public void the_ticket_is_registered_succelfull() throws Throwable{
        imprimedescripcionPaso = new PasoyEvidencia("Cierra la pagina");
    }

    @Then("^Genered report of evidency login \"([^\"]*)\"$")
    public void generedReportOfEvidencyLogin(String arg1) throws Throwable{
        imprimedescripcionPaso = new PasoyEvidencia("Cierra la pagina");
        impresion.CloseFile(arg1);
    }

    @Then("^closed the browser login$")
    public void closedTheBrowserLogin() {
        //driver.quit();
    }




}
