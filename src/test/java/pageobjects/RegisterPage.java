package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import constant.Constant;
import dataobjects.Account;

public class RegisterPage extends GeneralPage {
	private By customer_firstname = By.id("customer_firstname");
	private By customer_lastname = By.id("customer_lastname");
	private By passwd = By.id("passwd");
	private By firstname = By.id("firstname");
	private By lastname = By.id("lastname");
	private By address1 = By.id("address1");
	private By city = By.id("city");
	private By id_state = By.id("id_state");
	private By postcode = By.id("postcode");
	private By id_country = By.id("id_country");
	private By phone_mobile = By.id("phone_mobile");
	private By alias = By.id("alias");
	private By submitAccount = By.id("submitAccount");

	protected WebElement getCustomerFirstName() {
		return Constant.WEBDRIVER.findElement(customer_firstname);
	}

	protected WebElement getCustomerLastName() {
		return Constant.WEBDRIVER.findElement(customer_lastname);
	}

	protected WebElement getPasswd() {
		return Constant.WEBDRIVER.findElement(passwd);
	}

	protected WebElement getFirstname() {
		return Constant.WEBDRIVER.findElement(firstname);
	}

	protected WebElement getLastname() {
		return Constant.WEBDRIVER.findElement(lastname);
	}

	protected WebElement getAddress1() {
		return Constant.WEBDRIVER.findElement(address1);
	}

	protected WebElement getCity() {
		return Constant.WEBDRIVER.findElement(city);
	}

	protected WebElement getIdState() {
		return Constant.WEBDRIVER.findElement(id_state);
	}

	protected WebElement getPostcode() {
		return Constant.WEBDRIVER.findElement(postcode);
	}

	protected WebElement getIdCountry() {
		return Constant.WEBDRIVER.findElement(id_country);
	}

	protected WebElement getPhoneMobile() {
		return Constant.WEBDRIVER.findElement(phone_mobile);
	}

	protected WebElement getAlias() {
		return Constant.WEBDRIVER.findElement(alias);
	}

	protected WebElement getSubmitAccount() {
		return Constant.WEBDRIVER.findElement(submitAccount);
	}

	public void register(Account account) {
		this.getCustomerFirstName().sendKeys(account.getCustomerFirstName());
		this.getCustomerLastName().sendKeys(account.getCustomerLastName());
		this.getPasswd().sendKeys(account.getPasswd());
		this.getFirstname().sendKeys(account.getFirstname());
		this.getLastname().sendKeys(account.getLastname());
		this.getAddress1().sendKeys(account.getAddress1());
		this.getCity().sendKeys(account.getCity());

		Select dropdownState = new Select(this.getIdState());
		dropdownState.selectByVisibleText(account.getIdState());

		this.getPostcode().sendKeys(account.getPostcode());

		Select dropdownCountry = new Select(this.getIdCountry());
		dropdownCountry.selectByVisibleText(account.getIdCountry());

		this.getPhoneMobile().sendKeys(account.getPhoneMobile());
		this.getAlias().sendKeys(account.getAlias());

		this.getSubmitAccount().click();
	}
}
