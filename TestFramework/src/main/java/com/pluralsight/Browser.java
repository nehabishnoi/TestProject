package com.pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	static WebDriver driver = null;

	public static void goTo(String url) {

		
		System.setProperty("webdriver.chrome.driver", "E:/ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_OUT,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(url);

	}

	public static String title() {

		return driver.getTitle();

	}

	public static void cleanUp() {
		driver.close();

	}

}
