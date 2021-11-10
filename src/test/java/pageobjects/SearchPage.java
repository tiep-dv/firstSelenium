package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constant.Constant;

public class SearchPage extends ProductListPage {
	protected List<WebElement> getProductsNameElement(String productName) {
		String productNameElement = "//ul[contains(@class,'product_list')]/li/descendant::a[contains(text(),'"
				+ productName + "')]";
		return Constant.WEBDRIVER.findElements(By.xpath(productNameElement));
	}

	public int checkProductIsDisplayAfterSearch(String productName) {
		return this.getProductsNameElement(productName).size();
	}
}
