package com.pluralsight;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class UnitTest {

	@Test(priority = 1)
	public void canGoToHomePage() {
		Pages.homepage().goTo();
		Pages.homepage().clickonfind();
		Assert.assertTrue(Pages.homepage().isAt());

	}

	@Test(priority = 2)
	public void canGoToHelpPage() {
		Pages.helppage().goTo();
		Assert.assertTrue(Pages.helppage().isAt());

	}

	@Test(priority = 3)
	public void canGoToFindusPage() {
		Pages.findus().goTo();
		Assert.assertTrue(Pages.findus().isAt());
	}

	@AfterMethod
	public static void clean() {
		Browser.cleanUp();

	}
}
