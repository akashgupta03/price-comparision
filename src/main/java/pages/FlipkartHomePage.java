package pages;

import driver.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage extends BasePage {

    @FindBy(css = ".LM6RPg")
    private WebElement searchField;

    @FindBy(css = ".vh79eN")
    private WebElement searchButton;

    @FindBy(className = "_2AkmmA _29YdH8")
    private WebElement popUp;

    public FlipkartHomePage(){
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void searchIPhone(){
       // popUp.click();
        searchField.sendKeys("iPhone XR (64GB) - Yellow");
        searchButton.click();
    }
}
