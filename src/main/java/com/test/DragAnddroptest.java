package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.DriverKit;
import com.utils.FindElement;
import com.utils.PreValues;

public class DragAnddroptest {
	@Test
	public static void fileUpload() {

		WebDriver driver = DriverKit.DriverTool();
		PreValues.preValues(driver);
		WebElement source = FindElement.IdLocate(driver, "draggable");
		WebElement target = FindElement.IdLocate(driver, "droppable");
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		driver.quit();
		
	}

}
