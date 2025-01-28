package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.FindElement;
import com.utils.PreValues;

public class HandleLinks {
	@Test
	public static void newTabTest() {
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		WebElement apple = FindElement.IdLocate(driver, "apple");
		apple.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.quit();
}
}
