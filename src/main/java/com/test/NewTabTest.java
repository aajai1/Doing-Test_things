package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.FindElement;
import com.utils.PreValues;
import com.utils.SwitchToWindow;

public class NewTabTest {
	//for Tab
	@Test
	public static void newTabTest() {
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		WebElement tabNew= FindElement.XpathLocate(driver, "//*[@id=\"HTML4\"]/div[1]/button");
		tabNew.click();
		SwitchToWindow.switchToWindow(driver);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
	}
	//for window
	@Test
	public static void newWindowTest() {
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		WebElement tabNew= FindElement.XpathLocate(driver, "//*[@id=\"PopUp\"]");
		tabNew.click();
		SwitchToWindow.switchToWindow(driver);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
	}

}
