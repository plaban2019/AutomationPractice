package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginObject {
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//a[@class ='login']")
    private WebElement signIn;
    @FindBy (how = How.ID, using = "login_form")
    private WebElement scrollElement;
    @FindBy(how = How.ID, using = "email")
    private WebElement emailId;
    @FindBy(how = How.ID, using = "passwd")
    private WebElement passWord;
    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement submitButton;
        public LoginObject(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public LoginObject SignIn(){
            if (signIn.isDisplayed() && signIn.isEnabled()) {
                signIn.click();
            }else {
                System.out.println("not Visible");
            }
             return this;
        }
        public LoginObject scrollPageToLoginForm() throws InterruptedException {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement);
            Thread.sleep(500);
            return this;
        }
        public LoginObject enterEmailId(String email) {
            emailId.sendKeys(email);
            return this;
        }
        public LoginObject enterPassword(String pwd){
            passWord.sendKeys(pwd);
            return this;
        }
        public LoginObject clickSignIn(){
            submitButton.click();
            return this;
        }

}
