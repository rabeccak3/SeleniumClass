package selenium_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WaitImplicitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
			
			// 4. Intialize the value of title.
			String eTitle = "Google";
			
			// 3. Apply implict wait to webpage .implicitlyWait method  holds the webdriver for a certain amount of time before throwing "No Such Element Exception".
			// In this given time the wait will  locate the element.
			browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

			// 5. Open the web page https://www.google.com/
			browserObject.get("https://www.google.com/");
				
			// 6. maximaize the browser window
			browserObject.manage().window().maximize() ;
			// 7. Get the title of webpage 
			String aTitle = browserObject.getTitle();
			// 8. Compare the actual element and expected element
			if (aTitle.equals(eTitle))
			{
			System.out.println( "Test Passed") ;
			}
			else {
			System.out.println( "Test Failed" );
			}
			// 9. close the web browser
			browserObject.close();
	}

}
