package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	        
	        // 4. In case of RightClick we use Actions class.Create object and pass the driver to the reference
	        Actions action = new Actions(browserObject);    
		// 5. Locate the button using xpath and store the value in the reference that is rightClickElement
	        WebElement rightClickElement = browserObject.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	        
	       // 6. Using the action reference call the contextclick method and pass  element to perform right click
	        action.contextClick(rightClickElement).build().perform();
	}

}
