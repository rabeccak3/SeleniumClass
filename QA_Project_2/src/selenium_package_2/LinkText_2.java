package selenium_package_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.google.com/");
	    // 4. The value of LinkText is stored in bloglink reference.  Here, LinkText is a locator that checks whether a link is a text or not.
	        WebElement bloglink = browserObject.findElement(By.linkText("Gmail"));
	        
	    // 5. If the text is in the form of a link, then it will display or else it will not display.
	        if(bloglink.isDisplayed()) 
	        	 {
	        	System.out.println("The Gmail link displays using the LinkText.");
	        	 }
	        else 
	        	 {
	        		System.out.println("Unable to find Gmail");
	        	 }
	     // 6.	Close Browser
	        browserObject.close();
	        }
	        
	}

