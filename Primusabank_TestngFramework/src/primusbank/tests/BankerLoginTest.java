package primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import primusbank.library.BankerHomepage;
import primusbank.library.PrimusbankHomepage;
import utils.Apputils;

public class BankerLoginTest extends Apputils
{
	@Parameters({"brname","uid","pwd"})
	@Test
	public void checkBankerLogin(String bname,String uid,String pwd)
	{
		
		PrimusbankHomepage phome=new PrimusbankHomepage();
		boolean res=phome.bankerLogin(bname, uid, pwd);
		Assert.assertTrue(res);
		
		
		BankerHomepage bhome=new BankerHomepage();
		bhome.bankerLogout();
		
	}
	
	
}
