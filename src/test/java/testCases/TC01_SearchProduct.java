package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseTest;

public class TC01_SearchProduct extends BaseTest{

	@Test
	public void searchProduct() {
		
		HomePage home = new HomePage(driver);
		home.searchForProductsSet(p.getProperty("productSearch"));
		Assert.assertEquals(home.getUrl().contains("rawQuery"),true);
	}
	
}
