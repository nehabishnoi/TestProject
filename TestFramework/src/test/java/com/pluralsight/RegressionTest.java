package com.pluralsight;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RegressionTest {

	@Test(priority = 1)
	public void canGoToHomePage() {
		Pages.homepage().goTo();
		Pages.homepage().clickonfind();
		Assert.assertTrue(Pages.homepage().isAt());

	}

	@Test(priority = 2)
	public void canGoToHelpPage() {
		Pages.helppage().goTo();
		// Assert.assertTrue(Pages.helppage().testLogo());
		// System.out.println("Help Page main Banner is displayed");
		Assert.assertTrue(Pages.helppage().isAt());
		System.out.println("Help Page exist");

	}

	@Test(priority = 3)
	public void canGoToFindusPage() {
		Pages.findus().goTo();
		Assert.assertTrue(Pages.findus().isAt());
	}

	@Test(priority = 4)
	public void canGoToAccessibilityPage() throws InterruptedException {
		Pages.accessibility().goTo();
		Assert.assertTrue(Pages.accessibility().isAt());
		Assert.assertTrue(Pages.accessibility().clickonguidepdf());
		System.out.println("PDF is displayed finally");
	}
	

	@AfterMethod
	public static void clean() {
		Browser.cleanUp();

	}
}
