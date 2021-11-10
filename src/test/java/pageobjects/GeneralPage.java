package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import constant.Constant;

public class GeneralPage {
	private By searchQueryTop = By.id("search_query_top");
	private By searchButton = By.name("submit_search");

	protected WebElement getPage(String page) {
		String pageElement = "//a[@class='" + page + "']";
		return Constant.WEBDRIVER.findElement(By.xpath(pageElement));
	}

	protected WebElement getSearchQueryTopBox() {
		return Constant.WEBDRIVER.findElement(searchQueryTop);
	}

	protected WebElement getSearchButton() {
		return Constant.WEBDRIVER.findElement(searchButton);
	}

	public String getAccountName() {
		return Constant.WEBDRIVER.findElement(By.xpath("//a[@class='account']")).getText();
	}

	public void goToPage(String page) {
		this.getPage(page).click();
	}

	public void goToMenu(String menu) {
		String[] menuList = menu.split(">");
		int order = 0;
		String parentMenu = "";
		Actions action = new Actions(Constant.WEBDRIVER);
		for (int i = 0; i < menuList.length; i++) {
			order++;
			String menuElement;
			if (parentMenu == "") {
				menuElement = "//a[@title='" + menuList[i] + "']";
			} else {
				menuElement = parentMenu + "/../descendant::a[@title='" + menuList[i] + "']";
			}

			parentMenu = menuElement;

			WebElement menuLink = Constant.WEBDRIVER.findElement(By.xpath(menuElement));
			if (order != menuList.length) {
				action.moveToElement(menuLink).perform();
			} else {
				action.moveToElement(menuLink).click().perform();
			}
		}
	}

	public void searchProduct(String productName) {
		this.getSearchQueryTopBox().sendKeys(productName);
		this.getSearchButton().click();
	}
}
