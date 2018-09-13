package Group.Artifact;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTest {

	@Test
	public static void Browser() throws MalformedURLException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\software\\Android Softwares\\Drivers\\for v2.40 chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "21ac4f0128017ece");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
		cap.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.9.0");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("https://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://uk.virginmoney.com");
		Thread.sleep(5000);

	}

}
