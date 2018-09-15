package com.hello;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Trial {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		// cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
		cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.9.0");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("https://0.0.0.0:4723/wd/hub"),
				cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://uk.virginmoney.com");
		Thread.sleep(3000);
		driver.quit();
	}

}