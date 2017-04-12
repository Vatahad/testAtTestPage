package TestQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dio on 12.04.2017.
 */
public class MainPage {
    private WebDriver driver;
    private By formAuntentication = By.cssSelector("a[href=\"/login\"]");
    private By userName = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.className("radius");
    private By message = By.id("flash");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickFormAuntentication(){
        driver.findElement(formAuntentication).click();
    }

    public void enterUserName(String text){
        driver.findElement(userName).sendKeys(text);
    }

    public void enterPassword(String text){
        driver.findElement(password).sendKeys(text);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public String getMessage(){
        return driver.findElement(message).getText();

    }

    public void open(){
        driver.get("http://the-internet.herokuapp.com/");
    }
}
