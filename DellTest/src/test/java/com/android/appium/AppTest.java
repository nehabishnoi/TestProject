package com.android.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTest {

	AndroidDriver<MobileElement> driver;

	@BeforeMethod
	public void setup() throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S8");
		cap.setCapability(MobileCapabilityType.UDID, "ce061826654a4d1f03");
		// cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
		cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.9.0");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		driver = new AndroidDriver<MobileElement>(new URL("https://0.0.0.0:4723/wd/hub"), cap);
	}

	@Test
	public void test() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Appium");
		driver.pressKeyCode(66);
		Thread.sleep(4000);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
