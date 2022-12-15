package retoautomateTren.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/BookingTren.feature",
        tags = "@stories",
        glue = "retoautomateTren.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {

}
