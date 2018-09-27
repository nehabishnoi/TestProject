package com.pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		options.addArguments("disable-web-security");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.pluralsight.com");
		

	}	

}
