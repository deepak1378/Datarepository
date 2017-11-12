package webDriver;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_05 {

	
	@Test
	public void TC05()
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver ch =  new ChromeDriver();
		ch.get("http://www.carnival.com");
	

	ch.findElementByXPath("//a[contains(text(),'Log In')]").click();
	ch.findElementById("username").sendKeys("deepakupadhyay1378@gmail.com");
	ch.findElementById("password").sendKeys("abc");
	ch.findElementById("login").click();
		
	
		
	}
	

}


