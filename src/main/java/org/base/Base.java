package org.base;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	LoadProperties pro = new LoadProperties();

	public WebDriver initializeDriver() throws IOException {
		String browserName = pro.getPropertyValue("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		// Provide default time to wait for 10 seconds for every class which inherits
		// this class
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		getEnvUrl();
		return driver;
	}

	public void getEnvUrl() throws IOException {
		String environment = pro.getPropertyValue("Env");
		if (environment.equalsIgnoreCase("qa")) {
			driver.get(pro.getPropertyValue("UI_Url"));
		}
	}

}
