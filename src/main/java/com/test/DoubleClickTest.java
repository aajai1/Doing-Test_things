package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.FindElement;
import com.utils.PreValues;

public class DoubleClickTest {

	@Test
	public static void doubleClick() {
		WebDriver driver = new ChromeDriver();
		PreValues.preValues(driver);
		WebElement doubleClick= FindElement.XpathLocate(driver, "//*[@id=\"HTML10\"]/div[1]/button");
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick).perform();
		driver.quit();
	}
}
