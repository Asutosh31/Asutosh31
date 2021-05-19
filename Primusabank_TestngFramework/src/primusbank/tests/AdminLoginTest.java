package primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import primusbank.library.AdminHomepage;
import primusbank.library.PrimusbankHomepage;
import utils.Apputils;

public class AdminLoginTest extends Apputils
{

	@Parameters({"uid","pwd"})
	@Test
	public void checkAdminLogin(String uid,String pwd)
	{
	 
		PrimusbankHomepage phome=new PrimusbankHomepage();
		boolean result=phome.adminLogin(uid, pwd);
		Assert.assertTrue(result);
		
		AdminHomepage ahome=new AdminHomepage();
		ahome.adminLogout();
		
	}


	
}
