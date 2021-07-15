package org.practicetests;

import java.io.IOException;

import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.pageobjects.HomePage;
import org.pageobjects.PracticePage;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class HomePageTests extends Base {
	public WebDriver driver;

	@BeforeTest
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

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
