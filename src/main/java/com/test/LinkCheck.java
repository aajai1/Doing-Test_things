package com.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.logging.log4j.core.appender.HttpURLConnectionManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;

public class LinkCheck {
	public static void main(String[] args) throws URISyntaxException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i< links.size();i++) {
			WebElement element = links.get(i);
			@SuppressWarnings("deprecation")
			String url= element.getAttribute("href");
			System.out.println(url);
			HttpClient conn = HttpClient.newHttpClient();
			URI uri = new URI(url);
			HttpRequest req = HttpRequest.newBuilder().uri(uri).GET().build();
			HttpResponse<?> response = null;
			try {
				response = conn.send(req, HttpResponse.BodyHandlers.discarding());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(response.statusCode()>=400) {
				System.out.println("Link is broken");
			}else {
				System.out.println("Link is working");
			}
			
		}
		
	}
}
