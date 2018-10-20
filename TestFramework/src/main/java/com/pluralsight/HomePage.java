package com.pluralsight;

import org.openqa.selenium.By;

public class HomePage {

	static String url = "https://uk.virginmoney.com/virgin/";

	static String title = "Virgin Money UK - Credit cards, Mortgages, Savings, ISAs, Investments and Insurance";

	public void goTo() {

		Browser.goTo(url);

	}

	public void clickonfind() {

		Browser.driver.findElement(By.xpath("//a[text()='Find us']"));

	}

	public boolean isAt() {

		return Browser.title().equals(title);
	}

	public void clickoncurrentaccount() {
		
		Browser.driver.findElement(By.xpath("//a[text()='Current accounts']")).click();
		
	}

}
