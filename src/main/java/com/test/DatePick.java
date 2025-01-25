package com.test;
import com.utils.PreValues;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.FindElement;
import com.utils.PreValues;


public class DatePick {
	
//	public static void datePick1()  {
//		WebDriver driver = DriverKit.DriverTool();
//		PreValues.preValues(driver);
//		driver.findElement(By.id("datepicker")).click();
//		
//		String monthDate=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
//		String month = monthDate.split(" ")[0].trim();
//		String year = monthDate.split(" ")[1].trim();
//		
//		 System.out.println(monthDate);
//		 System.out.println(month);
//		 System.out.println(year);
//		 
//		 while(true) {
//			    String monthDate1 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
//			    String monthDate= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")).getText();
//			    System.out.println(monthDate1);
//			    
//			    if (monthDate1.equals("November")&&monthDate.equals("2001")) {
//			        break;
//			    }
//			    
//			    driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
//			}
//
//			driver.findElement(By.xpath("//a[text()='12']")).click(); 
//			 
//		 driver.close();

			
	
//}
	@Test
	public static void datePick2() {
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		driver.findElement(By.id("txtDate")).click();
		FindElement.ClassNameLocate(driver, "ui-datepicker-year").click();
		FindElement.XpathLocate(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[1]").click();
		FindElement.XpathLocate(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[1]").click();
		FindElement.XpathLocate(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[7]").click();
		FindElement.ClassNameLocate(driver, "ui-datepicker-month").click();
		FindElement.XpathLocate(driver, "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[11]").click();
		FindElement.XpathLocate(driver, "//a[text()='12']").click();
		driver.close();
		
		
	}
}
	        