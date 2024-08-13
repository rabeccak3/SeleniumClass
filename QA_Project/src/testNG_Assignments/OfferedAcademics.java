package testNG_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OfferedAcademics {

	WebDriver browserObject;
    // 1. The @Test will generate the test report of each method used
	
    @Test
    public void openitlearn360Site() throws InterruptedException {
	// 2. setup the property of chromedriver to perform multiple test case through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver");
	
    // 3. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
              
   // 4. Open the http://demo.itlearn360.com/ link using get method.
      browserObject.get("http://demo.itlearn360.com/");
        
      browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
      
      browserObject.findElement(By.id("loginlabel")).click();
      
    // 5. Create Login & Password objects to clear the fields      
      WebElement login= browserObject.findElement(By.name("log"));
        
      WebElement pass= browserObject.findElement(By.name("pwd"));
            
    // 6.  Clear the Login field, then type the Login 
      login.clear();
      login.sendKeys("Demo12");       
    
    // 7.  Clear the password field, then type the password
      pass.clear();
      pass.sendKeys("Test123456$");        
    
    // 8.  Press Submit button
      browserObject.findElement(By.className("button-primary")).click();
       
    // 9.  Press the Dashboard button
      browserObject.findElement(By.className("lg_button")).click();
   
   // 10.  Click on Offered Academics
      browserObject.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a")).click();
      
   // 11. Click on Subscribe Now Button of any Course (Select Software Testing Academy)
      browserObject.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[4]/form/div/button")).click();
         
	//10. Close Browser  
     //   browserObject.close();
      
    }


}
      
      
    
	
