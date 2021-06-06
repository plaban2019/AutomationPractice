package TestRunner;
//import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.File;

@CucumberOptions(
        plugin = {
                "html: cucumber-html-report.html",
                "json: cucumber.json",
                "pretty"},
        features = {"src/test/resources/features"},
        glue = {"StepDefs"},
        tags = ""
)
public class TestRunner extends AbstractTestNGCucumberTests {




}
