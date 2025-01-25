package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.FindElement;
import com.utils.PreValues;

public class Labeltest {
	
	@Test
	public static void labeltest() {
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		WebElement label= FindElement.IdLocate(driver, "samsung");
		if(label.isDisplayed()) {
			System.out.println("Label is Prest");
			
		}else System.out.println("No Lbel");
	}

}
