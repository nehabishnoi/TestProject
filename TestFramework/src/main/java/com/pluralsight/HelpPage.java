package com.pluralsight;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {
	
	//OR
	
	/*	@FindBy(className= "image__product-page")
		WebElement ImageOnHelpPage;
		
		@FindBy(linkText="faq-section__link")
		WebElement Link1;
		
		public HelpPage() {
			
			PageFactory.initElements(Browser.driver,this);
		}*/

	static String url = "https://uk.virginmoney.com/virgin/contact/support-hub/";

	static String title ="Help and support hub | Contact us | Virgin Money UK";
	
	
	public void goTo() {
		
		Browser.goTo(url);
		
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

	/*public boolean testLogo() {
		
		return ImageOnHelpPage.isDisplayed();
	}*/

}
