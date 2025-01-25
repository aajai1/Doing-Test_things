package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utils.DriverKit;

public class DetailsFill {
	
	@Test
	public static void fillTest() {
		WebDriver driver = DriverKit.DriverTool();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("Francis");
		driver.findElement(By.id("email")).sendKeys("francis063@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("96522 (257) 563-7401");
	
		driver.findElement(By.id("textarea")).sendKeys("Cecilia Chapman \n711-2880 Nulla St. \nMankato Mississippi ");
		
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("tuesday")).click();
		driver.findElement(By.xpath("//*[@id=\"colors\"]/option[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"animals\"]/option[6]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.close();
	}
}
