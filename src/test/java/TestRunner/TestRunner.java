package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"html: cucumber-html-report.html",
                "json: cucumber.json",
                "pretty"},
        features = {"src/test/resources/features"},
        glue = {"StepDefs"},
        tags = ""
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
