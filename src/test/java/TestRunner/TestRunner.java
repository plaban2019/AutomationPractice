package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

import java.io.File;

@CucumberOptions(
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html: cucumber-html-report.html",
                "json: cucumber.json",
                "pretty"},
        features = {"src/test/resources/features"},
        glue = {"StepDefs"},
        tags = ""
)
public class TestRunner extends AbstractTestNGCucumberTests {



}
