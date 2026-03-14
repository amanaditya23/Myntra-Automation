package pageObjects;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	WebElement searchForProducts;

	public void searchForProductsSet(String productSearch) {
		searchForProducts.sendKeys(productSearch);
		searchForProducts.sendKeys(Keys.ENTER);
	}
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
}
