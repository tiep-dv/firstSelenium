package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataobjects.Account;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.RegisterPage;

public class Register extends Base {
	@Test
	public void registerTest() {
		HomePage homePage = new HomePage();
		homePage.open();
		homePage.goToPage("login");

		Account account = new Account();

		LoginPage loginPage = new LoginPage();
		loginPage.createAnAccount(account.getEmail());

		RegisterPage registerPage = new RegisterPage();
		registerPage.register(account);

		String accountName = homePage.getAccountName();
		Assert.assertEquals(accountName, account.getCustomerFirstName() + " " + account.getCustomerLastName());
	}
}
