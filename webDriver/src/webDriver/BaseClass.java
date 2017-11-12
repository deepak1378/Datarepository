package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {

	public ChromeDriver ch;
	@BeforeMethod
	public void Openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	    ch =  new ChromeDriver();
		ch.get("https://www.facebook.com/");
		
	}
	
	@AfterMethod
	public void Closebrowser()
	{
       //ch.quit();
			
	}
	


}
