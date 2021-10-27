package TestCases;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DeleteCust;
import PageObjects.Login_PO;

public class DelCustTC extends BaseCLass {
	@Test
	public void delCust() throws InterruptedException, IOException {
		Login_PO lp= new Login_PO(driver);
		DeleteCust dc = new DeleteCust(driver);
		logger.info("entered username");
		lp.setUserName(username);
		logger.info("entered pwd");
		lp.setPassword(password);
		
		lp.clickSubmit();
		  dc.ClickLink(); 
		  dc.enterId("95050"); 
		  dc.clickSub();
		  logger.info("validating details");
		  Alert alert= driver.switchTo().alert();
		  alert.accept();
		  Thread.sleep(3000);
		  		   
		  if(driver.switchTo().alert().getText().equals("Customer deleted Successfully")) {
			  Assert.assertTrue(true);
			  logger.info("pass");
		  }
		  else {
			  captureScreen(driver, "DelCustTC");
			  Assert.assertTrue(false);
		  }
		  
		
		}
}
	
	
