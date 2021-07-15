package org.practicetests;

import java.io.IOException;

import org.apache.log4j.*;
import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.pageobjects.PracticePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticePageTests extends Base {
	public WebDriver driver;
	public Logger log = Logger.getLogger("");
	@BeforeMethod
	public void setup() throws IOException {
		driver = initializeDriver();
		PropertyConfigurator.configure("log4j.properties");
		log.info("Driver is initialized");
	}

	@Test
	public void verifyRadioButtons() {
		PracticePage homePage = new PracticePage(driver);
		homePage.getNumberOfRadioButtons();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
