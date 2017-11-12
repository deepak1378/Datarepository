package webDriver;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	ChromeDriver ch;
	ResourceBundle rb;
	
	public LoginPage(ChromeDriver ch)
	{
		this.ch = ch;
		rb= ResourceBundle.getBundle("Elements");
	}
	
	public void enterusername(String uname)
	{
		
		ch.findElementById(rb.getString("Login_username_id")).sendKeys(uname);
	}
	
	public void enterpass(String pass)
	{
		ch.findElementById(rb.getString("Login_pass_id")).sendKeys(pass);
	}

	public void signin()
	{
		ch.findElementByXPath(rb.getString("Login_signin_xpath")).click();
	}
	
}
