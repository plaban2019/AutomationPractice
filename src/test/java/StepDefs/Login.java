package StepDefs;

import DataProvider.ConfigFileReader;
import PageObject.LoginObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Login {
//        ConfigFileReader configFileReader;
//        LoginObject loginObject;
//        WebDriver driver;
//        @Before
//        public void setUp(){
//            configFileReader= new ConfigFileReader();
//            System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//        }
//
//        @Given("Launch the browser")
//        public void launchBrowser() throws Throwable {
//            //configFileReader= new ConfigFileReader();
//            Thread.sleep(3000);
//            driver.get(configFileReader.getApplicationUrl());
//            driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
//
//        }
//        @When ("Click Sign in the site")
//        public void clickSignIn() throws InterruptedException {
//            loginObject = new LoginObject(driver);
//            Thread.sleep(3000);
//            loginObject.SignIn();
//            Thread.sleep(3000);
//            loginObject.scrollPageToLoginForm();
//        }
//        @Then ("Enter EmailId in the Email address text box.")
//        public void enterEmailId() throws InterruptedException {
//            Thread.sleep(3000);
//            loginObject.enterEmailId(configFileReader.getEmail());
//        }
//        @Then ("Enter Password in the Password text box.")
//        public void enterPassword() throws InterruptedException {
//            Thread.sleep(3000);
//            loginObject.enterPassword(configFileReader.getPassWord());
//        }
//        @And ("Click Sign in Button")
//        public void clickSubmit() throws InterruptedException {
//            Thread.sleep(3000);
//            loginObject.clickSignIn();
//        }

//        @After
//        public void tearDown(){
//            driver.close();
//            driver.quit();
//        }
    }

