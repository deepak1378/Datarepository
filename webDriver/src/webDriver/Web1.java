package webDriver;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Web1 {
	
	@Test
	public void TC04()
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver ch =  new ChromeDriver();
		ch.get("http://www.carnival.com");
		//ch.findElementByCssSelector("input.login-link").click();

	ch.findElementByXPath("//a[contains(text(),'Log In')]").click();
	ch.findElementById("username").sendKeys("deepakupadhyay1378@gmail.com");
	ch.findElementById("password").sendKeys("abc123");
	ch.findElementById("login").click();
		
	//	ch.findElementByXPath("//input[@aria-label='Enter your password')]").sendKeys("lp$74177");
		
	}
	

}
