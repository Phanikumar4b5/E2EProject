package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	By loginButton = By.xpath("//a[@class='theme-btn register-btn']");
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}
