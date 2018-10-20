package com.pluralsight;

import java.util.Set;

import org.openqa.selenium.By;

public class Accessibility {

	static String url = "https://uk.virginmoney.com/virgin/accessibility.jsp";

	static String title = "Accessibility | Virgin Money UK";

	static String pdfurltext = "Making-it-Easier.pdf";

	static String parentwindow;

	public void goTo() {

		Browser.goTo(url);

	}

	public boolean isAt() {

		return Browser.title().equals(title);

	}

	public boolean clickonguidepdf() throws InterruptedException {

		Browser.driver.findElement(By.xpath("//a[text()='Making it easier guide']")).click();
		Thread.sleep(4000);

		parentwindow = Browser.driver.getWindowHandle();

		Set<String> allwindows = Browser.driver.getWindowHandles();

		for (String child : allwindows) {
			if (!parentwindow.equalsIgnoreCase(child)) {

				Browser.driver.switchTo().window(child);

			}

		}

		Browser.driver.getCurrentUrl().contains(pdfurltext);
		Browser.driver.close();
		Browser.driver.switchTo().window(parentwindow);
		return true;
		

	}
}
