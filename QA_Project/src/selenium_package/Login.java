package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	        
	        WebElement email= browserObject.findElement(By.name("Email"));
	        
	        WebElement pass= browserObject.findElement(By.name("Password"));
	        
	        email.clear();
	        email.sendKeys("admin@yourstore.com");
	        pass.clear();
	        pass.sendKeys("admin");
	        browserObject.findElement(By.className("login-button")).click();
	        
	}

}
