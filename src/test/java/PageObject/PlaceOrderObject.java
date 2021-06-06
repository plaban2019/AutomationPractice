package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderObject{
    WebDriver driver;
    @FindBy(how = How.XPATH, using = "//*[@id= 'block_top_menu']/ul/li[3]/a")
    private WebElement tShirtLink;
    @FindBy(how = How.ID, using = "ul_layered_id_feature_6")
    private WebElement scrollToElement;
    @FindBy(how = How.XPATH, using = "//a[@class = 'button ajax_add_to_cart_button btn btn-default']")
    private WebElement addToCart;
    @FindBy(how = How.XPATH, using = "//div[@class = 'product-container']")
    private WebElement hoverCartView;
    @FindBy(how = How.XPATH, using = "//a[@class = 'btn btn-default button button-medium']")
    private WebElement proceedToCheckOut;
    @FindBy(how = How.XPATH, using = "//a[@class = 'button btn btn-default standard-checkout button-medium']")
    private WebElement proceedToCheckOutFirst;
    @FindBy(how = How.XPATH, using = "//button[@class = 'button btn btn-default button-medium']")
    private WebElement proceedToCheckOutSecond;
    @FindBy(how = How.XPATH, using = "//button[@class = 'button btn btn-default standard-checkout button-medium']")
    private WebElement proceedToCheckOutThird;
    @FindBy(how = How.ID, using = "total_price")
    private WebElement totalPrice;
    @FindBy(how = How.ID, using = "total_product")
    private WebElement totalProduct;
    @FindBy(how = How.XPATH, using = "//a[@class = 'button btn btn-default standard-checkout button-medium']")
    private WebElement scrollToCheckout;
    @FindBy(how = How.XPATH, using = "//input[@type = 'checkbox']")
    private  WebElement checkBox;
    @FindBy(how = How.XPATH, using = "//div[@class = 'delivery_option item']")
    private  WebElement divElement;
    @FindBy (how = How.ID, using = "total_price_container")
    private WebElement getPrice;
    @FindBy(how = How.ID, using = "layer_cart_product_title")
    private WebElement productName;
    @FindBy(how = How.XPATH, using = "//a[@class = 'bankwire']")
    private WebElement payByBankWare;
    @FindBy(how = How.XPATH, using = "//button[@class = 'button btn btn-default button-medium']")
    private WebElement confirmOrder;
    @FindBy(how = How.ID, using = "order_step")
    private WebElement orderList;
    @FindBy(how = How.XPATH, using = "//*[@id='order-list']/tbody/tr[1]/td[7]/a[1]")
    private WebElement orderDetailsFromTable;
    @FindBy(how = How.XPATH, using = "//a[@class = 'account']")
    private WebElement accountElement;
    @FindBy(how = How.XPATH, using = "//a[@href = 'http://automationpractice.com/index.php?controller=history']")
    private WebElement orderElement;
    @FindBy(how = How.XPATH, using = "//*[@id='order-detail-content']/table/tfoot/tr[4]/td[2]")
    private WebElement orderPrice;
    public PlaceOrderObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public PlaceOrderObject selectTshirtLink() throws InterruptedException {
        if (tShirtLink.isEnabled() && tShirtLink.isDisplayed()){
            tShirtLink.click();
            Thread.sleep(3000);
        }else{
            System.out.println("T-shirt link is not found");
        }
        return this;
    }
    public PlaceOrderObject scrollPageTBottomForm() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollToElement);
        Thread.sleep(500);
        return this;
    }
    public PlaceOrderObject clickAddToCart() throws InterruptedException {
        if (addToCart.isDisplayed() && addToCart.isDisplayed()){
            addToCart.click();
            Thread.sleep(3000);
        }else {
            System.out.println("Add To Cart button is not visible");
        }
        return this;
    }
    public PlaceOrderObject hoverOnCartView(){
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverCartView).perform();
        return this;
    }
    public String getProductName() throws InterruptedException {
        String itemName = null;
        if(productName.isDisplayed()){
            Thread.sleep(1000);
            itemName = productName.getText();
        }else {
            System.out.println("product name is not fetched");
        }
        return itemName;
    }
    public String getPrice() throws InterruptedException {
        String cartTotal = null;
        if (getPrice.isDisplayed()){
            Thread.sleep(2000);
            cartTotal = getPrice.getText();
        }else {
            System.out.println("price is not fetched");
        }
        return cartTotal;
    }
    public PlaceOrderObject scrollToProceedToCheckOut() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", proceedToCheckOut);
        Thread.sleep(500);
        return this;
    }
    public PlaceOrderObject scrollToProceedToCheckOutFirst() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", proceedToCheckOutFirst);
        Thread.sleep(500);
        return this;
    }
    public PlaceOrderObject clickProceedToCheckOut() throws InterruptedException {
        if (proceedToCheckOut.isDisplayed() && proceedToCheckOut.isEnabled()){
            Thread.sleep(1000);
            proceedToCheckOut.click();
        }else {
            System.out.println("proceed to checkout button is not clickable");
        }
        return this;
    }
    public PlaceOrderObject clickProceedToCheckOutFirst() throws InterruptedException {
        if (proceedToCheckOutFirst.isDisplayed() && proceedToCheckOutFirst.isEnabled()){
            Thread.sleep(1000);
            proceedToCheckOutFirst.click();
        }else {
            System.out.println("proceed to checkout button is not clickable");
        }
        return this;
    }
    public PlaceOrderObject scrollToProceedToCheckOutSecond() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", proceedToCheckOutSecond);
        Thread.sleep(500);
        return this;
    }
    public PlaceOrderObject clickProceedToCheckOutSecond() throws InterruptedException {
        if (proceedToCheckOutSecond.isDisplayed() && proceedToCheckOutSecond.isEnabled()){
            Thread.sleep(1000);
            proceedToCheckOutSecond.click();
        }else {
            System.out.println("proceed to checkout button is not clickable");
        }
        return this;
    }
    public PlaceOrderObject scrollToProceedToCheckOutThird() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", proceedToCheckOutThird);
        Thread.sleep(500);
        return this;
    }
    public PlaceOrderObject clickProceedToCheckOutThird() throws InterruptedException {
        if (proceedToCheckOutThird.isDisplayed() && proceedToCheckOutThird.isEnabled()){
            Thread.sleep(1000);
            proceedToCheckOutThird.click();
        }else {
            System.out.println("proceed to checkout button is not clickable");
        }
        return this;
    }
    public PlaceOrderObject scrollToPayByBankWare() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", payByBankWare);
        Thread.sleep(500);
        return this;
    }
    public PlaceOrderObject scrollToTotalPrice() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", totalProduct);
        Thread.sleep(500);
        return this;
    }
    public PlaceOrderObject clickPayByBankWare() throws InterruptedException {
        if (payByBankWare.isDisplayed() && payByBankWare.isEnabled()){
            Thread.sleep(1000);
            payByBankWare.click();
        }else {
            System.out.println("PayByBankWare button is not clickable");
        }
        return this;
    }
    public PlaceOrderObject scrollToConfirmOrder() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirmOrder);
        Thread.sleep(500);
        return this;
    }
    public PlaceOrderObject clickConfirmOrder() throws InterruptedException {
        if (confirmOrder.isDisplayed() && confirmOrder.isEnabled()){
            Thread.sleep(1000);
            confirmOrder.click();
        }else {
            System.out.println("Confirm Order button is not clickable");
        }
        return this;
    }
    public PlaceOrderObject scrollToOrderList() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", orderList);
        Thread.sleep(500);
        return this;
    }
    public PlaceOrderObject scrollToCheckBox() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", divElement);
        Thread.sleep(3000);
        return this;
    }
    public PlaceOrderObject clickCheckBox() throws InterruptedException {
            Thread.sleep(1000);
            Actions actions = new Actions(driver);
            actions.moveToElement(checkBox).click().perform();
//            JavascriptExecutor executor = (JavascriptExecutor)driver;
//            executor.executeScript("arguments[0].click();", checkBox);
            System.out.println("Check Box is clicked");
            return this;
    }
    public PlaceOrderObject clickOnAccount() throws InterruptedException {
        Thread.sleep(1000);
        if (accountElement.isDisplayed()){
            accountElement.click();
            Thread.sleep(3000);
        }else {
            System.out.println("account link is disabled");
        }
        return this;
    }
    public PlaceOrderObject scrollToMyOrderPage() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", orderElement);
        Thread.sleep(500);
        return this;
    }
    public PlaceOrderObject clickOnMyOrderPage() throws InterruptedException {
        Thread.sleep(1000);
        if (orderElement.isDisplayed()){
            orderElement.click();
            Thread.sleep(3000);
        }else {
            System.out.println("Order link is disabled");
        }
        return this;
    }
    public String orderPrice() throws InterruptedException {
        String orderTotal = null;
        if (orderPrice.isDisplayed()){
            Thread.sleep(2000);
            orderTotal = orderPrice.getText();
            System.out.println(orderTotal);
        }else {
            System.out.println("price is not fetched");
        }
        return orderTotal;
    }
    public PlaceOrderObject scrollToOrderTotal() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", orderPrice);
        Thread.sleep(3000);
        return this;
    }
    public PlaceOrderObject clickOnMyOrderDetails() throws InterruptedException {
        Thread.sleep(1000);
        if (orderDetailsFromTable.isDisplayed()){
            orderDetailsFromTable.click();
            Thread.sleep(3000);
        }else {
            System.out.println("Order details link is disabled");
        }
        return this;
    }


}
