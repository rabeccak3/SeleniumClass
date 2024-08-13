package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_New {

	WebDriver browserObject;
	
	@Test
	public void verifyLogin()
	{
		browserObject.findElement(By.id("loginlabel")).click();
        
	      WebElement login= browserObject.findElement(By.name("log"));
	        
	      WebElement pass= browserObject.findElement(By.name("pwd"));
	        
	      login.clear();
	      login.sendKeys("Demo12");
	      
	    //  browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	      
	      pass.clear();
	      pass.sendKeys("Test123456$");
	      
	    //  browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	      
	      browserObject.findElement(By.className("button-primary")).click();
	        
	}
	
	@Test
	public void serachCourse()
	{
		// 9. Start typing a Class name        
	      browserObject.findElement(By.name("search_course")).sendKeys("Software Testing");
	      
	  
     // 10. Click Magnifying Glass
	      browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();
	         
	   //  11. Clear Class Search field
	      WebElement search= browserObject.findElement(By.className("form-control"));
	      	        
	      search.clear();
	}
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver");
		
	    // 3. Initialize WebDriver object through ChromeDriver class.
	        browserObject = new ChromeDriver();
	        
	        
		// 4. Open the http://demo.itlearn360.com/ link using get method.
	      browserObject.get("http://demo.itlearn360.com/");
	        
	      browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
}
