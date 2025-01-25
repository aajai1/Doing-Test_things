package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utils.FindElement;
import com.utils.PreValues;

public class StaticTable {
	
	@Test
	public static void staticTable() {
		
		WebDriver driver = new ChromeDriver();
		PreValues.preValues(driver);
		WebElement staticTabel = FindElement.IdLocate(driver, "taskTable");
		List<WebElement> tableHEad = staticTabel.findElements(By.tagName("th"));
		
		for(WebElement header : tableHEad) {
			
			List<WebElement> value = header.findElements(By.tagName("tr"));
			
		}
	}

}
