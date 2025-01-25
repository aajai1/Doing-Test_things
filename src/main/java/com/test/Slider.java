package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utils.FindElement;
import com.utils.PreValues;

public class Slider {
	
	@Test
	public static void slidertest() {
		WebDriver driver = new ChromeDriver();
		PreValues.preValues(driver);
		WebElement slider1 = FindElement.XpathLocate(driver, "//*[@id=\"slider-range\"]/span[1]");
		//Actions action = new Actions(driver);
		//action.clickAndHold();
		//action.dragAndDropBy(slider1, 100, 0).perform();
		//System.out.println(slider1.)
		
	}

}
