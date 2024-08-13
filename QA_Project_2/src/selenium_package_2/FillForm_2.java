package selenium_package_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://www.training.qaonlinetraining.com/testPage.php/");
	    
	        //Input fields
	        browserObject.findElement(By.name("name")).sendKeys("RabeccaK");
	        browserObject.findElement(By.name("email")).sendKeys("rabeccak3@gmail.com");
	        browserObject.findElement(By.name("website")).sendKeys("www.training.qaonlinetraining.com/testPage.php/");
	        browserObject.findElement(By.name("comment")).sendKeys("This is my 2nd Selenium program.");
	        
	        //Radio Buttons
	       browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	       browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	       browserObject.findElement(By.xpath("//*[@id='other']")).click();
	       
	       //Check Boxes
	       browserObject.findElement(By.name("bike")).click();
	       browserObject.findElement(By.name("car")).click();
	       browserObject.findElement(By.name("boat")).click();
	       browserObject.findElement(By.name("horse")).click();
	       
	       //Submit
	       //browserObject.findElement(By.name("submit")).click();
	        
	}

}
