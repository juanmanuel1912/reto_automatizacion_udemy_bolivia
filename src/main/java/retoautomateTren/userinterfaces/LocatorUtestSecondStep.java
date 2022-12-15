package retoautomateTren.userinterfaces;

import org.openqa.selenium.By;

//import java.lang.annotation.Target;
import net.serenitybdd.screenplay.targets.Target;
public class LocatorUtestSecondStep {
    public static final Target TEXT_CITY =Target.the("City").located(By.id("city"));
    public static final Target TEXT_ZIP_CODE =Target.the("zip code").located(By.id("zip"));
    public static final Target LIST_COUNTRY =Target.the("Country").located(By.name("countryId"));
    public static final Target TEXT_COUNTRY =Target.the("text country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target BUTTON_THIRD_STEP = Target.the("button third step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
