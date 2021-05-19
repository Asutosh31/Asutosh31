package primusbank.library;

import org.openqa.selenium.By;

import utils.Apputils;

public class AdminHomepage extends Apputils
{

	
	public boolean adminLogout()
	{
		driver.findElement(By.xpath("//*[@src='images/admin_but_03.jpg']")).click();
		if(driver.findElement(By.id("login")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
}
