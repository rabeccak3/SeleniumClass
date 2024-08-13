package selenium_package_2;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePage_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open facebook page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.facebook.com/ link using get method.
	       // browserObject.navigate().to("https://www.facebook.com");
	        browserObject.get("https://www.facebook.com");
	        browserObject.navigate().to("https://www.instagram.com");
	        
	        System.out.println("The name of this website is  "+browserObject.getTitle()  +"");
	        
	        browserObject.navigate().to("https://www.twitter.com");
	        browserObject.navigate().back();
	        
	        browserObject.navigate().to("https://www.ebay.com");
	        System.out.println("The URL for this website is " +browserObject.getCurrentUrl());
	        browserObject.navigate().back();

	}
}