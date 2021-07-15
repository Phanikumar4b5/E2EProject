package org.practicetests;

import java.io.IOException;

import org.apache.log4j.*;
import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.pageobjects.PracticePage;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class PracticePageTests extends Base {
	WebDriver driver;
	public Logger log = Logger.getLogger("");
	@BeforeMethod
	public void setup() throws IOException {
		driver = initializeDriver();
		PropertyConfigurator.configure("log4j.properties");
		log.info("Driver is initialized");
	}

	@Test
	public void verifyHomeFunctionality() {
		PracticePage homePage = new PracticePage(driver);
		homePage.getNumberOfRadioButtons();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
