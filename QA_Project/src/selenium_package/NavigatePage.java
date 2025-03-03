package selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open facebook page through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver");
		// 2. Initialize WebDriver object through ChromeDriver class.
	      ChromeDriver  browserObject = new ChromeDriver();
		// 3. Open the web page https://www.facebook.com/
	        browserObject.get("https://www.facebook.com/");
	        
	        System.out.println("this is " + browserObject.getTitle() + " website");
			// 5. In next line we are using getCurrentUrl method .This will give the current url of the webpage
		        System.out.println("url is: " + browserObject.getCurrentUrl());
		       // 6. Using the navigate method we move to next website http://www.instagram.com/
		        browserObject.navigate().to("http://www.instagram.com/");
		        
		        System.out.println("this is " + browserObject.getTitle() + " website");
				// 8. In next line we are using getCurrentUrl method .This will give the current url of the webpage
			        System.out.println("url is: " + browserObject.getCurrentUrl());
			       // 9. Using navigate method we again move to next website http://www.twitter.com/
			        browserObject.navigate().to("http://www.twitter.com/");
			        browserObject.navigate().back();
			        
			        System.out.println("this is " + browserObject.getTitle() + " website");
			        System.out.println("url is: " + browserObject.getCurrentUrl());
			        // 11. Now we use back method again to navigate back to the first website that is "https://www.facebook.com/"
			        browserObject.navigate().back();
			        
				// 12. Now we use forward method to move forward direction that is to "http://www.instagram.com"
			        browserObject.navigate().forward();
			        System.out.println("this is " + browserObject.getTitle() + " website");
			        System.out.println("url is: " + browserObject.getCurrentUrl());
				// 13. Close the browser
			        browserObject.close();
	}

}
