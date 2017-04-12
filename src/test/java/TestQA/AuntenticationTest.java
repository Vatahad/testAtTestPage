package TestQA;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Dio on 12.04.2017.
 */
public class AuntenticationTest {
    private ChromeDriver driver;
    private MainPage mainPage;

    @Before
    public void precondition(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
    }

    @Test
    public void testAuntentication() throws IOException {
        mainPage.open();
        mainPage.clickFormAuntentication();
        mainPage.enterUserName("tomsmith");
        mainPage.enterPassword("SuperSecretPassword!");
        mainPage.clickLoginButton();
        Assert.assertEquals(mainPage.getMessage(), "You logged into a secure area!\n" +
                "×");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));

    }
}
