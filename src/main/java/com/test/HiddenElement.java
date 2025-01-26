package com.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.FindElement;

public class HiddenElement {
	@Test
	public static void hiddenElement() {
		WebDriver driver = DriverKit.DriverTool();
		driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
		FindElement.IdLocate(driver, "toggleInput").click();
		FindElement.IdLocate(driver, "input2").sendKeys("hey",Keys.ENTER);
	}
}
