package com.utils;

import org.openqa.selenium.WebDriver;

public class PreValues {
	
	public static void preValues(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.get("https://practice.expandtesting.com/upload");
	}

}
