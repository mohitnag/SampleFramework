import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:results/cucumber-html-report"},
        features = "src/test/features",
        glue = {"stepDefinition"},
        tags = {"@sanity"}
)

public class TestRunner {

}
