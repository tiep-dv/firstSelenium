package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constant.Constant;

public class LoginPage extends GeneralPage {
	private By emailInput = By.id("email_create");
	private By submitButton = By.id("SubmitCreate");

	protected WebElement getEmailInput() {
		return Constant.WEBDRIVER.findElement(emailInput);
	}

	protected WebElement getSubmitButton() {
		return Constant.WEBDRIVER.findElement(submitButton);
	}

	public void createAnAccount(String email) {
		this.getEmailInput().sendKeys(email);
		this.getSubmitButton().click();
	}
}
