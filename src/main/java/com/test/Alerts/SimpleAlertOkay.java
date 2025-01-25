package com.test.Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.FindElement;

import com.utils.PreValues;

public class SimpleAlertOkay {
	@Test
	public static void SimpleAlert() {
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		WebElement simppleAlert=  FindElement.IdLocate(driver, "alertBtn");
		simppleAlert.click();
		driver.switchTo().alert().accept();
		
	}
	
	@Test
	public static void ConfirmAlertOkay() {
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		WebElement simppleAlert=  FindElement.IdLocate(driver, "confirmBtn");
		simppleAlert.click();
		driver.switchTo().alert().accept();
		
	}
	
	
}
