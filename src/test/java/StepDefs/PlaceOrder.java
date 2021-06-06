package StepDefs;

import DataProvider.ConfigFileReader;
import PageObject.LoginObject;
import PageObject.PlaceOrderObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class PlaceOrder {
    ConfigFileReader configFileReader;
    PlaceOrderObject placeOrderObject;
    WebDriver driver;
    LoginObject loginObject;
    BufferedReader reader;
    @Before
    public void setUp(){
        configFileReader= new ConfigFileReader();
        System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("Launch the browser")
    public void launchBrowser() throws Throwable {
        //configFileReader= new ConfigFileReader();
        Thread.sleep(3000);
        driver.get(configFileReader.getApplicationUrl());
        driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);

    }
    @When ("Click Sign in the site")
    public void clickSignIn() throws InterruptedException {
        loginObject = new LoginObject(driver);
        Thread.sleep(3000);
        loginObject.SignIn();
        Thread.sleep(3000);
        loginObject.scrollPageToLoginForm();
    }
    @And ("Enter EmailId in the Email address text box.")
    public void enterEmailId() throws InterruptedException {
        Thread.sleep(3000);
        loginObject.enterEmailId(configFileReader.getEmail());
    }
    @And("Enter Password in the Password text box.")
    public void enterPassword() throws InterruptedException {
        Thread.sleep(3000);
        loginObject.enterPassword(configFileReader.getPassWord());
    }
    @And("Click Sign in Button")
    public void clickSubmit() throws InterruptedException {
        Thread.sleep(3000);
        loginObject.clickSignIn();
    }

    @And("Click the T-shirt link")
    public void selectTShirt() throws Throwable {
        //configFileReader= new ConfigFileReader();
        Thread.sleep(3000);
        placeOrderObject = new PlaceOrderObject(driver);
        placeOrderObject.selectTshirtLink();
        driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
    }
    @And("I scroll Down to Bottom")
    public  void  scrollDown() throws InterruptedException {
        placeOrderObject.scrollPageTBottomForm();
        Thread.sleep(3000);
    }
    @And("I hover on the T-shirt Card View")
    public  void  hoverOnCart() throws InterruptedException {
        placeOrderObject.hoverOnCartView();
        Thread.sleep(3000);
    }
    @And("I click Add To Cart")
    public  void  addToCart() throws InterruptedException {
        placeOrderObject.clickAddToCart();
        Thread.sleep(3000);
    }
    @And("I click   Proceed To  checkout")
    public void proceedCheckoutBtn() throws InterruptedException, IOException {
        String cartItem = placeOrderObject.getProductName();
        System.out.println(cartItem);
        OutputStream output = new FileOutputStream("src/main/resources/Id.properties");
        Properties prop = new Properties();
        prop.setProperty("productName", cartItem);
        prop.store(output, null);
        Thread.sleep(1000);
        placeOrderObject.clickProceedToCheckOut();
        Thread.sleep(2000);
    }
    @And("I scroll down to total price")
    public void scrollToPrice() throws InterruptedException, IOException {
        placeOrderObject.scrollToTotalPrice();
        Thread.sleep(1000);
        String cartTotal = placeOrderObject.getPrice();
        Thread.sleep(1000);
        System.out.println(cartTotal);
        OutputStream output = new FileOutputStream("src/main/resources/Id.properties");
        Properties prop = new Properties();
        prop.setProperty("cartValue", cartTotal);
        prop.store(output, null);
    }
    @And("I scroll Down to Proceed To first Checkout")
    public void scrollDownToCheckOut() throws InterruptedException {
        placeOrderObject.scrollToProceedToCheckOutFirst();
        Thread.sleep(1000);
    }
    @And("I click Proceed To first Checkout")
    public void proceedCheckoutBtn1() throws InterruptedException {
        placeOrderObject.clickProceedToCheckOutFirst();
        Thread.sleep(1000);
    }
    @And("I scroll Down to Proceed To second Checkout")
    public void scrollDownToCheckOut1() throws InterruptedException {
        placeOrderObject.scrollToProceedToCheckOutSecond();
        Thread.sleep(1000);
    }
    @And("I click Proceed To second Checkout")
    public void proceedCheckoutBtn2() throws InterruptedException {
        placeOrderObject.clickProceedToCheckOutSecond();
        Thread.sleep(1000);
    }
    @And("I scroll Down to CheckBox")
    public void scrollToCheckBox() throws InterruptedException {
        placeOrderObject.scrollToCheckBox();
        Thread.sleep(2000);
    }
    @And("I select Checkbox")
    public void selectCheckBox() throws InterruptedException {
        placeOrderObject.clickCheckBox();
        Thread.sleep(1000);
    }
    @And("I click Proceed To third Checkout")
    public void proceedCheckoutBtn3() throws InterruptedException {
        placeOrderObject.clickProceedToCheckOutThird();
        Thread.sleep(1000);
    }
    @And("I scroll Down to Pay By Bank Ware")
    public void scrollDownToPayByBank() throws InterruptedException {
        placeOrderObject.scrollToPayByBankWare();
        Thread.sleep(3000);
    }
    @And("I click on Pay By Bank Ware")
    public void clickPayByBank() throws InterruptedException {
        placeOrderObject.clickPayByBankWare();
        Thread.sleep(3000);
    }
    @And("I scroll Down to Confirm Order button")
    public void scrollDownToConfirmOrder() throws InterruptedException {
        placeOrderObject.scrollToConfirmOrder();
        Thread.sleep(3000);
    }
    @And("I click on confirm button")
    public void clickConfirmButton() throws InterruptedException {
        placeOrderObject.clickConfirmOrder();
        Thread.sleep(3000);
    }
    @And("I click on Account Link")
    public void clickAccountLink() throws InterruptedException {
        placeOrderObject.clickOnAccount();
        Thread.sleep(1000);
    }
    @And("I scroll Down To My Order Page")
    public void scrollToOrderPage() throws InterruptedException {
        placeOrderObject.scrollToMyOrderPage();
        Thread.sleep(2000);
    }
    @And("I click on My order Page")
    public void clickOnMyOrder() throws InterruptedException {
        placeOrderObject.clickOnMyOrderPage();
        Thread.sleep(3000);
    }
//    @And("I scroll Down to my Order Details")
//    public void scrollToOrderDetails() throws InterruptedException {
//        placeOrderObject.scrollToOrderList();
//        Thread.sleep(3000);
//    }
    @And("I click on My order Details")
    public void clickOnMyOrderDetails() throws InterruptedException {
        placeOrderObject.clickOnMyOrderDetails();
        Thread.sleep(3000);
    }
    @And("I scroll Down to Order Total row")
    public void scrollToOrderTotal() throws InterruptedException {
        placeOrderObject.scrollToOrderTotal();
        Thread.sleep(3000);
    }
    @Then("I get the Order total and Match.")
    public void OrderTotalMatch() throws InterruptedException, FileNotFoundException {
        String totalPrice = placeOrderObject.orderPrice();
        reader = new BufferedReader(new FileReader("src/main/resources/Id.properties"));
        Properties prod = new Properties();
        String cartValue = prod.getProperty("cartValue");
        if (totalPrice.equals(cartValue)){
            System.out.println("Product price matches");
        }

        Thread.sleep(1000);
    }
    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
