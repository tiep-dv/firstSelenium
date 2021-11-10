package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constant.Constant;

public class ProductListPage extends GeneralPage {
	private String productName = "//ul[contains(@class,'product_list')]/li/descendant::a[contains(@class,'product-name')]";

	protected WebElement getProductNameElement() {
		return Constant.WEBDRIVER.findElement(By.xpath(productName));
	}

	public String getFirstProductName() {
		return this.getProductNameElement().getText().trim();
	}
}
