package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.FindElement;
import com.utils.PreValues;

public class FileUpload {
	@Test
	public static void fileUpload() throws IOException {
		
		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement idloacte=FindElement.IdLocate(driver, "multipleFilesInput");
		idloacte.sendKeys("C:\\Users\\acer\\Pictures\\Screenshots\\Screenshot (2).png"+
				"\nC:\\Users\\acer\\Pictures\\Screenshots\\Screenshot (3).png");
		//idloacte.sendKeys("C:/Users/acer/Pictures/Screenshots/Screenshot (3).png");
				
		driver.quit();
		
		
		

		
	

	}
}
