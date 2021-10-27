package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCust {

	WebDriver rdriver;
public 	EditCust(WebDriver ldriver){
		rdriver=ldriver;
		PageFactory.initElements(rdriver, this);
	}

@FindBy(xpath="/html/body/div[3]/div/ul/li[3]/a")
WebElement editlink;

@FindBy(name="cusid")
WebElement editcusid;

@FindBy(name="AccSubmit")
WebElement esubmit;

public void ClickElink() {
	editlink.click();
}

public void enterCusEditid(String ecusid) {
	editcusid.sendKeys(ecusid);
}

public void clicksub() {
	esubmit.click();
}
}
