package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElement {
	
	public static WebElement IdLocate(WebDriver driver,String path) {
		return driver.findElement(By.id(path));
	}
	
	public static WebElement ClassNameLocate(WebDriver driver,String path) {
		return driver.findElement(By.className(path));
	}
	
	
	public static WebElement CssSelectorLocate(WebDriver driver,String path) {
		return driver.findElement(By.cssSelector(path));
	}
	
	
	public static WebElement LinkTextLocatelinkText(WebDriver driver,String path) {
		return driver.findElement(By.linkText(path));
	}
	
	
	public static WebElement LinkTextLocatepartial(WebDriver driver,String path) {
		return driver.findElement(By.partialLinkText(path));
	}
	
	
	public static WebElement NameLocate(WebDriver driver,String path) {
		return driver.findElement(By.name(path));
	}
	
	public static WebElement TagNameLocate(WebDriver driver,String path) {
		return driver.findElement(By.tagName(path));
	}
	
	public static WebElement XpathLocate(WebDriver driver,String path) {
		return driver.findElement(By.xpath(path));
	}
	
	
	

}
