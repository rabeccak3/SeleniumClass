package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://www.training.qaonlinetraining.com/testPage.php/");
	
	     // 4. Select class is used in case of Dropdown. Select class object countrySelect specifies the webElement location.
	        WebElement cn=browserObject.findElement(By.name("country"));
	        Select countrySelect = new Select(cn);
	        
		// 5. Using the object of Select class call the selectByVisibleText method and select text in dropdown
	        countrySelect.selectByVisibleText("USA"); //options [USA,India, Ethiopia,France]
	        //or
	        Thread.sleep(5000);
	        countrySelect.selectByVisibleText("France");
	        
	        Thread.sleep(5000);
	       // Same explanation for skill dropdown 
	        Select skillSelect = new Select(browserObject.findElement(By.name("skill")));
	        //using skillSelect to select menu options -- Programming
	        skillSelect.selectByVisibleText("Programming");
	     
	        skillSelect.selectByVisibleText("Database");
	        System.out.println("selectByVisibleText(\"Database");
	        
	        // 6. Locate the send button and perform click
	        browserObject.findElement(By.name("submit")).click();
	        System.out.println("Form Fill-up Succesfull");
		// 7. Close the web browser
	      //  browserObject.close();
	
	
	}

}
