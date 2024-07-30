package selenium_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExplicitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver" );
		  
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		
		// 3. In Explicit Wait we will use WebDriverWait class .This class object is created and the the browserObject and time is intialized to the object
		// Explicit Wait is applied to element in the webpage
	      	WebDriverWait wait=new WebDriverWait(browserObject,Duration.ofSeconds(20));
	     
	     // 4.  Open the web page https://www.google.com/
	      browserObject.get("http://google.com" );
	      //Maximizes the browser window
	     
	      WebElement gmailLink;
		// 5. Locate the gmail element and apply the wait and until method to the element.
	      gmailLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[contains(text(),'Gmail')]")));
	      gmailLink.click();
	     // 6. close the browser
	   browserObject.quit();

	}

}
