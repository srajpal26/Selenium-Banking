package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.DeleteCust;
import PageObjects.EditCust;
import PageObjects.Login_PO;

public class EditCustTC extends BaseCLass{
	@Test
	public void editCust() throws InterruptedException {
		Login_PO lp= new Login_PO(driver);
		EditCust ec= new EditCust(driver);
		logger.info("entering username");
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		logger.info("login successful");
		ec.ClickElink();
		ec.enterCusEditid("47840");
		ec.clicksub();
		Thread.sleep(3000);
        boolean res= driver.getPageSource().contains("Edit Customer");
		if(res==true) {

			Assert.assertTrue(true);
		}
		else {
			
			Assert.assertTrue(false);
		}
	}

}
