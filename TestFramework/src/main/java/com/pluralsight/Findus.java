package com.pluralsight;

public class Findus {
	
	static String url = "https://uk.virginmoney.com/store-finder/";

	static String title ="Store Finder | Virgin Money UK";
	
	public void goTo() {
			
			Browser.goTo(url);
			
		}

	public boolean isAt() {
		
		return Browser.title().equals(title);
		
	}
		
	}
