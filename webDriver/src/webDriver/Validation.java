package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validation  {
	
	public static boolean validate(ChromeDriver ch, String URL)
	{
		boolean res = false;
		if(ch.getCurrentUrl().equalsIgnoreCase(URL))
		{
			res= true;
		}
		return res;
	}
	
	public static boolean validateTitle(ChromeDriver ch, String Title)
	{
		boolean res = false;
		
		if(ch.getTitle().equalsIgnoreCase(Title))
		{
			res= true;
		}
		return res;
	}


}
