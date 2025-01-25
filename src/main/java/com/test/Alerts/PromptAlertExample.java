package com.test.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utils.FindElement;
import com.utils.PreValues;

public class PromptAlertExample {
	@Test
	public static void promptAlertOkay() {
		WebDriver driver = new ChromeDriver();
		PreValues.preValues(driver);
		WebElement promptText = FindElement.IdLocate(driver, "promptBtn");
		promptText.click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("New ME");
		promptAlert.accept();




	}
	@Test
	public static void promptAlertDismiss() {
		WebDriver driver = new ChromeDriver();
		PreValues.preValues(driver);
		WebElement promptText = FindElement.IdLocate(driver, "promptBtn");
		promptText.click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("New ME");
		promptAlert.dismiss();
	}
}
