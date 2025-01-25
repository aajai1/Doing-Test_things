package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.PreValues;

public class FileUpload {
	@Test
	public static void fileUpload() {
		
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		//driver.findElement(By.id("fileInput"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement upload = driver.findElement(By.id("multipleFilesInput"));
		String path = "C:\\Users\\acer\\Pictures\\Screenshots\\Screenshot (2).png";
		upload.click();
		//driver.findElement(By.xpath("//*[@id=\"singleFileForm\"]/button")).click();
		//System.out.println(upload.getText());
		//driver.close();
	}
}
