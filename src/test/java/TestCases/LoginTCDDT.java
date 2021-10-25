package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.Login_PO;
import Utilities.XLUtils;

public class LoginTCDDT extends BaseCLass {

	@Test(dataProvider="LoginData")
	public void TestMethod(String user, String pwd) throws InterruptedException {
		
		Login_PO lp= new Login_PO(driver);
		Thread.sleep(3000);

		lp.setUserName(user);
		logger.info("username is provided");
		lp.setPassword(pwd);
		logger.info("pwd is provided");

		lp.clickSubmit();
		
		Thread.sleep(3000);
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("tc failed");

		}
		else {
			Assert.assertTrue(true);
			lp.clickLogout();
			Thread.sleep(3000);

			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.info("tc passed");

		}
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e){
			return false;
			
		}
		
		
	}
	
	@DataProvider(name="LoginData")
	 String[][] DataProviderMethod() throws IOException{
		String path="C:\\Users\\simra\\eclipse-workspace\\Selenium-Banking\\src\\test\\java\\TestData\\testdata.xlsx";
		int rownumber= XLUtils.getRowCount(path, "Sheet1");
		int colnumber= XLUtils.getCellCount(path, "Sheet1", 1);
		String loginarray[][]= new String[rownumber][colnumber];
		for (int i=1;i<=rownumber;i++) {
			
			for (int j=0;j<colnumber;j++) {
				loginarray[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
				
			}
		}
		return loginarray;
	}
}
