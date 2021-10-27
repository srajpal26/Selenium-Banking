package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCust {

	WebDriver rdriver;
public 	DeleteCust(WebDriver ldriver){
	rdriver=ldriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[4]/a")
	WebElement dellink;
	
	@FindBy(name="cusid")
	WebElement customerid;
	
	@FindBy(name="AccSubmit")
	WebElement subbtn;
	
	public void ClickLink() {
		dellink.click();
	}
	
	public void enterId(String cid) {
		customerid.sendKeys(cid);
	}
	
	public void clickSub() {
		subbtn.click();
	}
}
