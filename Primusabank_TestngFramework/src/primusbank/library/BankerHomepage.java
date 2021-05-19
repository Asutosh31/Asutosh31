package primusbank.library;

import org.openqa.selenium.By;

import utils.Apputils;

public class BankerHomepage extends Apputils
{

	public boolean bankerLogout()
	{
		driver.findElement(By.id("IMG1")).click();
		if(driver.findElement(By.id("login")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
}
