package com.test.Alerts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.FindElement;
import com.utils.PreValues;

public class ConfirmationOkay {

	@Test
	public static void ConfirmAlertOkay() {
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		WebElement simppleAlert=  FindElement.IdLocate(driver, "confirmBtn");
		simppleAlert.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().alert().accept();;
		
	}
	
	@Test
	public static void ConfirmAlertDismiss() {
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		WebElement simppleAlert=  FindElement.IdLocate(driver, "confirmBtn");
		simppleAlert.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().alert().dismiss();
		
	}
}
