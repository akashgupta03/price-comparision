package pages;

import driver.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonHomePage extends BasePage {

    @FindBy(css = ".nav-input")
    private List<WebElement> searchField;

    public AmazonHomePage() {
        driver = DriverProvider.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void searchPhone() {
        waitForListOfElementToBeDisplay(searchField);
        searchField.get(1).sendKeys("iPhone XR (64GB) - Yellow");
        searchField.get(0).click();
    }
}
