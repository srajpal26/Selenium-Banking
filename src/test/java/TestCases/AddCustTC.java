package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Login_PO;
import PageObjects.NewCustomer_PO;

public class AddCustTC extends BaseCLass{

	@Test
	public void addNewCust() throws InterruptedException, IOException {
		
		Login_PO lp= new Login_PO(driver);
		NewCustomer_PO nc = new NewCustomer_PO(driver);
		lp.setUserName(username);
		logger.info("username entered");
		lp.setPassword(password);
		logger.info("entered pwd");

		lp.clickSubmit();
		
		Thread.sleep(3000);
		nc.clickLink();
		logger.info("entereing cust details");

		nc.setCustomerName("simran");

		nc.setGender("female");
		nc.setDateof("26", "09", "1996");
		nc.setAddress("lkejrfkljf");
		nc.setCity("Mumbai");
		nc.setState("maharashtra");
		nc.setPinno("738398");
		nc.setTelephone("8765432567");
        String semail=	randomemail()+"@gamil.com";
        nc.setEmail(semail);
        nc.setPassword("kfjlij");
        nc.clickSubmit();
        Thread.sleep(3000);
        
		logger.info("validation started");

        boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
        if (res==true) {
        	Assert.assertTrue(true);
        	captureScreen(driver, "addNewCust");
    		logger.info("tc passed");

        }
        else {
        	captureScreen(driver, "addNewCust");
        	Assert.assertTrue(false);
    		logger.info("failed");

        	
        }

		
	}
	
	
}
