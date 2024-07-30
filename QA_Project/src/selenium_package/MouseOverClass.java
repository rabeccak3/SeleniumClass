package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.amazon.com/");
	        
			// 4. Thread.sleep is used to hold the part of code for given time limit. In this case take mouse over the thread and add Interrupted exception to this method
	        Thread.sleep(3000);
		
	        // 5. Locate the element using the xpath and store in the reference SiginInelement 
	        WebElement element = browserObject.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]")) ;
	        
		
	      
		 // 6. In case of RightClick we use Actions class.Create object and pass the driver to the reference
	        Actions action = new Actions(browserObject);
	        System.out.println("Mouse is over the - HELLO, SIGN IN - option");
	        
	        // 7. Using the action object call the moveToElement method and pass  SigiInelement reference to this method and perform mouseOver
	        action.moveToElement(element).build().perform();
	        //Thread.sleep(3000);
		// 8. Select a element from the pop up box and perform click
	        browserObject.findElement(By.xpath("//span[contains(text(),'Create a List')]")).click();
		
	        // 9. Close the browser
	}

}
