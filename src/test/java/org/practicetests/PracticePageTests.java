package org.practicetests;

import java.io.IOException;

import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.pageobjects.PracticePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticePageTests extends Base {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws IOException {
		driver = initializeDriver();
	}

	@Test
	public void verifyHomeFunctionality() {
		PracticePage homePage = new PracticePage(driver);
		homePage.getNumberOfRadioButtons();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
