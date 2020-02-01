package pages;

import driver.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FlipkartProductsPage extends BasePage {

    @FindBy(css = "._3wU53n")
    private WebElement products;

    @FindBy(className = "_1vC4OE")
    private WebElement price;

    public FlipkartProductsPage() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void verifyIPhoneWrtSearchOnFlipkart() {
        waitForElementToBeDisplay(products);
        Assert.assertTrue(products.getText().contains("iPhone XR (Yellow, 64 GB)"));
    }

    public String getIPhonePriceOnFlipkart() {
        waitForElementToBeDisplay(price);
        String priceOnFlipkart = price.getText();
        System.out.println(priceOnFlipkart);
        return priceOnFlipkart;
    }

    public void comparePrice(String priceAmazon, String priceFlipkart){
      String  price1 = priceAmazon.replaceAll("[^\\d]", " ").trim().replaceAll(" +", "");
      String  price2 = priceFlipkart.replaceAll("[^\\d]", " ").trim().replaceAll(" +", "");
        int amazonPrice = Integer.parseInt(price1);
        int flipkartPrice = Integer.parseInt(price2);

        if(amazonPrice<flipkartPrice){
            System.out.println(amazonPrice);
        }
        else {
            System.out.println(flipkartPrice);
        }
    }
}