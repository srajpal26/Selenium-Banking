package TestCases;
import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Login_PO;
public class LoginTC extends BaseCLass{

	@Test
	public  void loginTest() throws IOException 
	{
			
		logger.info("URL is opened");
		
	Login_PO lp = new Login_PO(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}
