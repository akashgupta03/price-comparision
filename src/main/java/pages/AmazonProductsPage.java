package pages;

import driver.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AmazonProductsPage extends BasePage {

    @FindBy(css = ".a-size-medium.a-color-base.a-text-normal")
    private List<WebElement> products;

    @FindBy(css = ".a-price-whole")
    private List<WebElement> price;

    public AmazonProductsPage(){
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void verifyIPhoneWrtSearch(){
        waitForListOfElementToBeDisplay(products);
        Assert.assertTrue(products.get(0).getText().contains("iPhone XR (64GB) - Yellow"));
        jsClick(products.get(0));
    }

    public String getIPhonePrice(){
        waitForListOfElementToBeDisplay(price);
        String priceOnAmazon = price.get(0).getText();
        System.out.println(priceOnAmazon);
        return priceOnAmazon;
    }
}
