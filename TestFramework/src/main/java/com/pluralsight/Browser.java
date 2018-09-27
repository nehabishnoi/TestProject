package com.pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	static WebDriver driver = null;

	public static void goTo(String url) {

		System.setProperty("webdriver.gecko.driver", "E:/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);

	}

	public static String title() {

		return driver.getTitle();

	}

	public static void cleanUp() {
		driver.close();

	}

}
