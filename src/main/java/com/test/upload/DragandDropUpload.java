package com.test.upload;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.utils.DriverKit;

public class DragandDropUpload {
	@Test
	public void dragAndDropUpload() throws IOException {
		WebDriver driver =DriverKit.DriverTool();
		driver.get("https://www.dragdrop.com/test/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.id("demo-upload")).click();
		String path = "C:\\Users\\acer\\Desktop\\RunScript.exe";
		ProcessBuilder builer = new ProcessBuilder(path);
		
		try {
			Process process = builer.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new IOException();
		}
		driver.quit();
	}

}
