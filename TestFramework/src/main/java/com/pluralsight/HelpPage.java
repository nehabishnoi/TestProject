package com.pluralsight;

public class HelpPage {

	static String url = "https://uk.virginmoney.com/virgin/contact/support-hub/";

	static String title ="Help and support hub | Contact us | Virgin Money UK";
	
	public void goTo() {
		
		Browser.goTo(url);
		
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}
	

}
