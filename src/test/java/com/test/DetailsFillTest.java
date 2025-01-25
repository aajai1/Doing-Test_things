package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.utils.DriverKit;

public class DetailsFillTest {
	
	public static void main(String[] args) {
		WebDriver driver = DriverKit.DriverTool();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("AJAI");
	}

  
}
