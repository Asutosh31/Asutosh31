package primusbank.library;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.Apputils;

public class PrimusbankHomepage extends Apputils
{

	public boolean adminLogin(String uid,String pwd)
	{
		String exp,act;
		exp="adminflow";
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		act=driver.getCurrentUrl().toLowerCase();
		if(act.contains(exp))
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	
	public boolean bankerLogin(String bname,String uid,String pwd)
	{
	
		String exp,act;
		exp="bankers";
		Select sel=new Select(driver.findElement(By.id("drlist")));
		sel.selectByValue(bname);
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		act=driver.getCurrentUrl().toLowerCase();
		if(act.contains(exp))
		{
			return true;
		}else
		{
			return false;
		}	
	}
	
	
}
