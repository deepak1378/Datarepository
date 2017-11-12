package webDriver;


import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC03 {
	
	@Test
	public void TC05()
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver ch =  new ChromeDriver();
		ch.get("http://www.carnival.com");
	

	ch.findElementByXPath("//a[contains(text(),'Create Account')]").click();
	ch.findElementById("noiamnot").click();
	
	Select tit = new Select(ch.findElementById("Title1"));
	tit.selectByIndex(1);
	
	ch.findElementById("FirstName").sendKeys("Deepak");
	ch.findElementById("LastName").sendKeys("kumar");
	
	Select brth = new Select(ch.findElementById("BirthMonth"));
	brth.selectByIndex(5);
	
		
	Select brdt = new Select(ch.findElementById("BirthDate"));
	brdt.selectByIndex(6);
	
	Select bryr = new Select(ch.findElementById("BirthYear"));
	bryr.selectByIndex(90);
	
	Select cntry = new Select(ch.findElementById("Country"));
	cntry.selectByIndex(74);
	
	ch.findElementById("Address1").sendKeys("D229 mahendra enclave");
	
	ch.findElementById("Address2").sendKeys("Shastri Nagar");
	
	ch.findElementById("City").sendKeys("Ghaziabad");
	
	ch.findElementById("FullProfile_ProfileHousehold_ZIP").sendKeys("201002");
	
	
	Select phn = new Select(ch.findElementById("PhoneType"));
	phn.selectByIndex(6);
	
	ch.findElementById("AreaCode").sendKeys("0120");
	
	ch.findElementById("PhoneNumber").sendKeys("9599410821");
	
	ch.findElementById("Email").sendKeys("deepakupadhyay1377@gmail.com");
	
	ch.findElementByCssSelector("input#Password").sendKeys("lp$74177");
	
	ch.findElementByCssSelector("input#VerifyPassword").sendKeys("lp$74177");
	
	ch.findElementByCssSelector("input#chkAcceptTerms").click();
	
	
	ch.findElementByCssSelector("a#EnrollSubmitBtn").click();
	
	
	
	}
	

}





