package retoautomateTren.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class LocatorUtestThirdStep {

    public static final Target LIST_YOUR_COMPUTER = Target.the("list your computer").located(By.name("osId"));
    public static final Target TEXT_YOUR_COMPUTER = Target.the("text your computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target LIST_VERSION = Target.the("Version").located(By.name("osVersionId"));
    public static final Target TEXT_VERSION = Target.the("Version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target LIST_LANGUAGE = Target.the("Language").located(By.name("osLanguageId"));
    public static final Target TEXT_LANGUAGE = Target.the("Language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target LIST_YOUR_MOVIL_DEVICE = Target.the("your movil device").located(By.name("handsetMakerId"));
    public static final Target TEXT_YOUR_MOVIL_DEVICE = Target.the("your movil device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target LIST_MODEL = Target.the("your model").located(By.name("handsetModelId"));
    public static final Target TEXT_MODEL = Target.the("your model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target LIST_OPERATING_SYSTEM = Target.the("operation system").located(By.name("handsetOSId"));
    public static final Target TEXT_OPERATING_SYSTEM = Target.the("operation system").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

public static final Target BUTTON_FOURT_STEP = Target.the("Button last step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
