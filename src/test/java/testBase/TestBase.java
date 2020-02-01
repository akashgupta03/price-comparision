package testBase;

import driver.DriverInitializer;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    protected AmazonHomePage amazonHomePage;
    protected AmazonProductsPage amazonProductsPage;
    protected FlipkartHomePage flipkartHomePage;
    protected FlipkartProductsPage flipkartProductsPage;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() throws Exception {
        driver = new DriverInitializer(System.getProperty("driver")).init();
        amazonHomePage = new AmazonHomePage();
        amazonProductsPage = new AmazonProductsPage();
        flipkartHomePage = new FlipkartHomePage();
        flipkartProductsPage = new FlipkartProductsPage();
    }
    protected void navigateTo(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }





   // @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (null != driver) {
            driver.quit();
            driver = null;
        }
    }
}

