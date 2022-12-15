package retoautomateTren.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocatorUtestFourtStep {
    public static final Target PASSWORD = Target.the("password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("confirm password").located(By.id("confirmPassword"));

    public static final Target TERM_USE = Target.the("Term of use").located(By.id("termOfUse"));
    public static final Target PRIVATE_SETTING = Target.the("privacy setting").located(By.id("privacySetting"));

    public static final Target BUTTON_REGISTER = Target.the("button register").located(By.xpath("//*[@id=\"laddaBtn\"]"));




}
