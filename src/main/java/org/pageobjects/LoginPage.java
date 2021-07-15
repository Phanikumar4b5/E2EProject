package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	By loginPageTitle = By.xpath("//h1[@class='text-center']");
	By email = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']");
	By loginButton = By.xpath("//input[@name='commit']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement loginPageDescription() {
		return driver.findElement(loginPageTitle);
	}

	public WebElement usernameField() {
		return driver.findElement(email);
	}

	public WebElement passwordField() {
		return driver.findElement(password);
	}

	public WebElement loginButton() {
		return driver.findElement(loginButton);
	}

}
