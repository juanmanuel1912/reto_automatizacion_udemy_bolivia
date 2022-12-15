package retoautomateTren.userinterfaces;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.*;

public class LocatorBookFirstStep {

    public static final Target TIPE_TRAVEL = the("Tipe Travel").located(By.id("busquedaRegreso-1"));


    public static final Target DESTINATION = the("destination").located(By.id("idDestino"));
   // public static final Target LIST_DESTINATION =Target.the("list_destination").located(By.name("countryId"));
  //  public static final Target TEXT_DESTINATION =Target.the("text_destination").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target MONTH_INI = the("month ini").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));

        /*   while(true){
               public static final Target MONTH_INI= Target.the("Month ini").located(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));

        if(MONTH_INI.equals(MONTH_INI))
    }
        break;
}
    else
            {
            Click.on(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));


            }*/


public static final Target BOOK_NOW = Target.the("Book now").located(By.partialLinkText("BOOK NOW"));




    //*[@id="ui-datepicker-div"]/div/div/select[1]



  //  public static final Target BOOK_NOW = Target.the("Book now").located(By.partialLinkText("BOOK NOW"));
   // public static final Target LIST_DESTINATION = Target.the("list your computer").located(By.name("osId"));
  //  public static final Target TEXT_DESTINATION = Target.the("text your computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));



    public static final Target ROUTE = the("route").located(By.id("idRuta"));

    //select date start travel
    public static final Target DEPARTURE = the("departure ").located(By.xpath("//*[@id=\"fecViajeIda\"]"));

    //select date return travel
    public static final Target RETURN = the("return ").located(By.xpath("//*[@id=\"fecViajeRegreso\"]"));





    public static final Target ADULTS = the("adults").located(By.id("numCupoAdulto"));
    public static final Target CHILDREN = the("children").located(By.id("text_children"));

    public static final Target BUTTON_SECOND_STEP = the("Button next").located(By.xpath("//*[@id=\"text_btn_search\"]"));


}

