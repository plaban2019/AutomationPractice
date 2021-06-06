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
    @FindBy(how = How.ID, using = "old_passwd")
    private WebElement oldPassWord;
    @FindBy(how = How.ID, using = "passwd")
    private WebElement currentPassWord;
    @FindBy(how = How.ID, using = "confirmation")
    private WebElement confirmationPassWord;
    @FindBy(how = How.XPATH, using = "//button[@name='submitIdentity']")
    private WebElement submitButton;
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
        String fName = firstName.getText();
        if (fName.equals("Plaban")){
            firstName.click();
            Thread.sleep(1000);
            firstName.clear();
            Thread.sleep(1000);
            firstName.sendKeys("Plabank");
            Thread.sleep(3000);
        }else {
            firstName.click();
            Thread.sleep(1000);
            firstName.clear();
            Thread.sleep(1000);
            firstName.sendKeys("Plaban");
            System.out.println("First Name is not editable");
        }
        return this;
    }
    public void updateOldPassWord() throws InterruptedException {
        oldPassWord.clear();
        oldPassWord.sendKeys("Plaban123");
        Thread.sleep(2000);
    }
    public void updateCurrentPassWord() throws InterruptedException {
        currentPassWord.clear();
        currentPassWord.sendKeys("Plaban123");
        Thread.sleep(2000);
    }
    public void updateConfirmationPassWord() throws InterruptedException {
        confirmationPassWord.clear();
        confirmationPassWord.sendKeys("Plaban123");
        Thread.sleep(2000);
    }
    public void clickSubmitButton() throws InterruptedException {
        submitButton.click();
        Thread.sleep(2000);

    }


}
