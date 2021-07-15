package org.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {
	public WebDriver driver;
	By radiobutton = By.name("radioButton");
	By homeButton = By.xpath("//button[text()='Home']");

	public PracticePage(WebDriver driver) {
		this.driver = driver;
	}

	public void getNumberOfRadioButtons() {
		List<WebElement> radioButtons = driver.findElements(radiobutton);
		for (int i = 0; i < radioButtons.size(); i++) {
			radioButtons.get(i).click();
			if (radioButtons.get(i).isEnabled()) {
				System.out.println("radio button " + i + " is enabled");
			}
		}
	}

	public void clickOnHomeButton() {
		driver.findElement(homeButton).click();
	}
}
