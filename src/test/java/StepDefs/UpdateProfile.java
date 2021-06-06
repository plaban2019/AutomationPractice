package StepDefs;

import DataProvider.ConfigFileReader;
import PageObject.LoginObject;
import PageObject.PlaceOrderObject;
import PageObject.UpdateProfileObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.util.concurrent.TimeUnit;

public class UpdateProfile {
    ConfigFileReader configFileReader;
    UpdateProfileObject updateProfileObject;
    WebDriver driver;
    LoginObject loginObject;
    BufferedReader reader;
    @Given("I Launch the browser")
    public void launchBrowser() throws Throwable {
        configFileReader= new ConfigFileReader();
        Thread.sleep(3000);
        driver.get(configFileReader.getApplicationUrl());
        driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);

    }
    @When("I Click Sign in the site")
    public void clickSignIn() throws InterruptedException {
        loginObject = new LoginObject(driver);
        Thread.sleep(3000);
        loginObject.SignIn();
        Thread.sleep(3000);
        loginObject.scrollPageToLoginForm();
    }
    @And("I Enter EmailId in the Email address text box.")
    public void enterEmailId() throws InterruptedException {
        Thread.sleep(3000);
        loginObject.enterEmailId(configFileReader.getEmail());
    }
    @And("I Enter Password in the Password text box.")
    public void enterPassword() throws InterruptedException {
        Thread.sleep(3000);
        loginObject.enterPassword(configFileReader.getPassWord());
    }
    @And("I Click Sign in Button")
    public void clickSubmit() throws InterruptedException {
        Thread.sleep(3000);
        loginObject.clickSignIn();
    }
    @And("I click on My Account Link")
    public void clickOnMyAccount() throws InterruptedException {
        updateProfileObject = new UpdateProfileObject(driver);
        updateProfileObject.clickOnAccountElement();
        Thread.sleep(3000);
    }
    @And("I scroll Down to My Personal info")
    public void scrollToMyPersonalInfo() throws InterruptedException {
        updateProfileObject.scrollToMyPersonalInfo();
        Thread.sleep(3000);
    }
    @And("I click on My Personal Info")
    public void clickOnMyPersonalInfo() throws InterruptedException {
        updateProfileObject.clickOnMyPersonalInfo();
        Thread.sleep(3000);
    }
    @And("I scroll Down to Email field")
    public void scrollToEmailField() throws InterruptedException {
        updateProfileObject.scrollToEmail();
        Thread.sleep(3000);
    }
    @Then("I Update the first Name")
    public void updateFirstName() throws InterruptedException {
        updateProfileObject.updateFirstName();
        updateProfileObject.updateOldPassWord();
        updateProfileObject.updateCurrentPassWord();
        updateProfileObject.updateConfirmationPassWord();
        updateProfileObject.clickSubmitButton();
        Thread.sleep(3000);
    }

}
