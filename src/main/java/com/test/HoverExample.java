package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.FindElement;
import com.utils.PreValues;

public class HoverExample {
@Test
	public static void hoverMouse() {
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		WebElement hoverEle= FindElement.XpathLocate(driver, "//*[@id=\"HTML3\"]/div[1]/div/button");
		Actions action = new Actions(driver);
		action.moveToElement(hoverEle).perform();
		FindElement.XpathLocate(driver, "//*[@id=\"HTML3\"]/div[1]/div/div/a[1]").click();
		driver.quit();
		
		
	}
}
