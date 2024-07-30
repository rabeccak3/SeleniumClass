package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {

			// TODO Auto-generated method stub
			ChromeDriver browserObject;
		       // 1. setup the property of WebDriver to perform "linktext" through Chrome web browser.
		        System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver");
			// 2. Initialize WebDriver object through ChromeDriver class.
		       browserObject = new ChromeDriver();
		       
			// 3. Open the web page https://www.google.com/
		        browserObject.get("https://www.google.com/");
			// 4. The value of LinkText is stored in bloglink reference . Here, LinkText is a locator that checks whether a text is a link or not.		  
		        WebElement blogLink = browserObject.findElement(By.linkText("Gmail"));
					  
					 
			// 5. If the text is in the form of a link, then it will display or else it will not display
		        if (blogLink.isDisplayed()) {
		            System.out.println("Gmail link is diplayed using LinkText");
		        } else {
		            System.out.println("Unable to find Gmail");
		        }
			// 6. Close the browser
		        browserObject.close();
		
	}

}
