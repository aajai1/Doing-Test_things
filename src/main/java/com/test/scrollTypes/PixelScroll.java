package com.test.scrollTypes;

import org.openqa.selenium.Point;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.FindElement;
import com.utils.PreValues;

public class PixelScroll {
	@Test
	public static void pixelScroll() {
		WebDriver driver = new ChromeDriver();
		PreValues.preValues(driver);
		WebElement element= FindElement.XpathLocate(driver, "//*[@id=\"HTML15\"]/h2");
	
		System.out.println(element.getLocation());
		Actions action = new Actions(driver);
		
		action.scrollToElement(element).perform();
		driver.quit();
		
		
		 
	}

}
