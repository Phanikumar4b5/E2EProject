package org.practicetests;

import java.io.IOException;

import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.pageobjects.HomePage;
import org.pageobjects.PracticePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends Base {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws IOException {
		driver = initializeDriver();
	}

	@Test
	public void verifyHomeFunctionality() {
		PracticePage practicePage = new PracticePage(driver);
		HomePage homePage = new HomePage(driver);
		practicePage.clickOnHomeButton();
		homePage.clickOnLoginButton();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
