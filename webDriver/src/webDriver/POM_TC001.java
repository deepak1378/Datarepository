package webDriver;

import org.testng.annotations.Test;
import org.testng.Assert;


public class POM_TC001 extends BaseClass {
	@Test
	public void test1()
	{
		
	//	LoginPage lg = new LoginPage(ch);
	//	lg.enterusername("deepakupadhyay1378@gmail.com");
	//	lg.enterpass("lp$74177");
	//	lg.signin();
		
		boolean res = Validation.validate(ch,"https://www.facebook.com/");
		Assert.assertTrue(res,"URL not expected");
		
		
		boolean res1 = Validation.validateTitle(ch,"Facebook – log in or sign up");
		Assert.assertTrue(res1,"Title not expected");
		
	}

}
