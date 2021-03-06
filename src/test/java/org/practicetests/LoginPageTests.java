package org.practicetests;

import java.io.IOException;

import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.pageobjects.HomePage;
import org.pageobjects.LoginPage;
import org.pageobjects.PracticePage;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class LoginPageTests extends Base {
	public WebDriver driver;

	@BeforeTest
	public void setup() throws IOException {
		driver = initializeDriver();
	}

	@Test
	public void verifyLoginPage() {
		PracticePage practicePage = new PracticePage(driver);
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		practicePage.clickOnHomeButton();
		homePage.clickOnLoginButton();
		Assert.assertTrue(loginPage.usernameField().isEnabled());
		Assert.assertTrue(loginPage.passwordField().isEnabled());
		Assert.assertTrue(loginPage.loginButton().isEnabled());
		Assert.assertEquals(loginPage.loginPageDescription().getText(), "Log in to Rahul Shetty Academy123");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
