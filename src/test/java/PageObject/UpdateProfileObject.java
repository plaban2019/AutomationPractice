package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfileObject {
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//a[@href='http://automationpractice.com/index.php?controller=identity']")
    private WebElement myPersonalInfo;
    @FindBy(how = How.XPATH, using = "//a[@class = 'account']")
    private WebElement accountElement;
    @FindBy(how = How.ID, using = "email")
    private WebElement scrollToEmail;
    @FindBy(how = How.ID, using = "firstname")
    private WebElement firstName;
    public UpdateProfileObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public UpdateProfileObject clickOnAccountElement() throws InterruptedException {
        if (accountElement.isDisplayed() && accountElement.isEnabled()){
            accountElement.click();
            Thread.sleep(3000);
        }else {
            System.out.println("Account Link is not clickable");
        }
        return this;
    }
    public UpdateProfileObject scrollToMyPersonalInfo() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myPersonalInfo);
        Thread.sleep(500);
        return this;
    }
    public UpdateProfileObject clickOnMyPersonalInfo() throws InterruptedException {
        if (myPersonalInfo.isDisplayed() && myPersonalInfo.isEnabled()){
            myPersonalInfo.click();
            Thread.sleep(3000);
        }else {
            System.out.println("myPersonalInfo Link is not clickable");
        }
        return this;
    }
    public UpdateProfileObject scrollToEmail() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToEmail);
        Thread.sleep(500);
        return this;
    }
    public UpdateProfileObject updateFirstName() throws InterruptedException {
        if (firstName.getText().equals("Plaban")){
            firstName.clear();
            firstName.sendKeys("Plaban1");
            Thread.sleep(3000);
        }else {
            firstName.clear();
            firstName.sendKeys("Plaban");
            System.out.println("First Name is not editable");
        }
        return this;
    }



}
