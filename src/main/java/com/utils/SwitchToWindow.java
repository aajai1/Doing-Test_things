package com.utils;

import org.openqa.selenium.WebDriver;

public class SwitchToWindow {

	public static String switchToWindow(WebDriver driver) {
	    String windowHandles=  (String) driver.getWindowHandles().toArray()[1];
	    driver.switchTo().window(windowHandles);
	    return driver.getCurrentUrl();
	    
	}

}
