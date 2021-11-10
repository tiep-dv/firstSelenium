package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.ProductListPage;
import pageobjects.SearchPage;

public class SearchProduct extends Base {
	@Test
	public void registerTest() {
		HomePage homePage = new HomePage();
		homePage.open();

		homePage.goToMenu("Women>T-shirts");

		ProductListPage productListPage = new ProductListPage();
		String productName = productListPage.getFirstProductName();

		productListPage.searchProduct(productName);

		SearchPage searchPage = new SearchPage();
		int productIsExist = searchPage.checkProductIsDisplayAfterSearch(productName);
		Assert.assertNotEquals(productIsExist, 0);
	}
}
