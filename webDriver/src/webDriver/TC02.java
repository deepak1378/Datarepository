package webDriver;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC02 {
	
	
	
		
		@Test
		public void TC05()
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			ChromeDriver ch =  new ChromeDriver();
			ch.get("http://www.carnival.com");
			Actions act = new Actions(ch);
			act.moveToElement(ch.findElementByXPath("//span[contains(text(),'Plan')]")).perform();
			
			

		}
		
	

}
