package com.test;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.PreValues;

public class DatePickByIco {
	@Test
	public static void datePickByIcon() {
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		driver.findElement(By.id("start-date")).sendKeys("12-11-2001");
		driver.findElement(By.id("end-date")).sendKeys("13-11-2024");
		driver.findElement(By.className("submit-btn")).click();
		driver.close();
		
//		Actions action = new Actions((WebDriver) elemrnt);
//		action.moveToElement(elemrnt).click();
//		//elemrnt.sendKeys("12-11-2025");
	}
}
