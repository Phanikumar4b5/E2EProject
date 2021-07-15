package org.practicetests;

import java.io.IOException;

import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.pageobjects.HomePage;
import org.pageobjects.LoginPage;
import org.pageobjects.PracticePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTests extends Base {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws IOException {
		driver = initializeDriver();
	}

	@Test
	public void verifyHomeFunctionality() {
		PracticePage practicePage = new PracticePage(driver);
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage=new LoginPage(driver);
		practicePage.clickOnHomeButton();
		homePage.clickOnLoginButton();
		Assert.assertTrue(loginPage.usernameField().isEnabled());
		Assert.assertTrue(loginPage.passwordField().isEnabled());
		Assert.assertTrue(loginPage.loginButton().isEnabled());
		Assert.assertEquals(loginPage.loginPageDescription().getText(), "Log in to Rahul Shetty Academy123");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
