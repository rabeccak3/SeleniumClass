package testNG_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


// 1. Use @BeforeTest to execute the part of method before the test method. 

//public void beforeTest() {
	WebDriver browserObject;
    // 1. The @Test will generate the test report of each method used
	
    @BeforeTest
    public void performLogin() throws InterruptedException {
	// 2. setup the property of chromedriver to perform multiple test case through chrome web browser.
        System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver");
	
    // 3. Initialize WebDriver object through ChromeDriver class.
        browserObject = new ChromeDriver();
        
        
	// 4. Open the http://demo.itlearn360.com/ link using get method.
      browserObject.get("http://demo.itlearn360.com/");
        
      browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
      
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

@Test()
public void searchCourses() {

		//	WebDriver browserObject;
		    // 1. The @Test will generate the test report of each method used
		    public void openitlearn360Site() throws InterruptedException {
			 // 2. setup the property of chromedriver to perform multiple test case through chrome web browser.
		        System.setProperty("webdriver.chrome.driver", "/Users/rabeccakamaluddin/Downloads/chromedriver-mac-x64/chromedriver");
			// 3. Initialize WebDriver object through ChromeDriver class.
		      browserObject = new ChromeDriver();      
			// 4. Open the http://demo.itlearn360.com/ link using get method.
		      browserObject.get("http://demo.itlearn360.com/");        
		      browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);    
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
		    // browserObject.findElement(By.className("home page-template-default")).click();   
		    // 9. Start typing a Class name        
		      browserObject.findElement(By.name("search_course")).sendKeys("Software Testing");  
	       // 10. Click Magnifying Glass
		      browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button")).click();         
		   //  11. Clear Class Search field
		      WebElement search= browserObject.findElement(By.className("form-control"));      	        
	          search.clear();   
		   //  12. Close Browser  
		      browserObject.close();	
		    }
		      
@Test()
public void  DashboardPage() {
	{

	WebDriver browserObject;
    // 1. The @Test will generate the test report of each method used
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
   
	//10. Close Browser  
     //   browserObject.close();
      
    } 
public void OfferedAcademics() {
	{

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

public void Payment() {
	}

	{		
}

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
       
    //11. Click 'Pay With Stripe' Radio Button
      browserObject.findElement(By.xpath("//*[@id=\"learn-press-payment\"]/ul/li/label")).click();
      
      JavascriptExecutor js = (JavascriptExecutor) browserObject;
      js.executeScript("window.scrollBy(0,750)", "");
 
    //12.  Click on Place Order Button  NOTE: Tried the following, didn't work.
    //     browserObject.findElement(By.name("learn_press_checkout_place_order")).click();
      	  
    // browserObject.findElement(By.className("onpayment")).click();  //*THIS PASSED BUT IT DIDN'T CLICK BUTTON
    //   browserObject.findElement(By.className("button")).click();
         browserObject.findElement(By.xpath("//*[@id=\"learn-press-checkout-place-order\"]")).click();
    //     browserObject.findElement(By.className("button alt onpayment")).click();
           
         WebElement frameelement= browserObject.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe")) ;
         browserObject.switchTo().frame(frameelement);
    
	
	
	

	


