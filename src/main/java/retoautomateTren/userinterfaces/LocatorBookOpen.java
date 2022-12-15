package retoautomateTren.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocatorBookOpen {
    public static final Target BOOK_NOW = Target.the("Book now").located(By.partialLinkText("BOOK NOW"));
}
