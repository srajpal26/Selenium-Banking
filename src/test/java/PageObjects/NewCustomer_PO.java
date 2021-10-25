package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer_PO {

	WebDriver rdriver;
	public NewCustomer_PO(WebDriver ldriver){
		rdriver=ldriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement NewCustLink;
	
	@FindBy(name="name")
	WebElement name;
	
	@FindBy(name="rad1")
	WebElement gender;
	
	@FindBy(name="dob")
	WebElement dob;
	
	@FindBy(name="addr")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pinnumber;
	
	@FindBy(name="telephoneno")
	WebElement telephone;
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="sub")
	WebElement submit;
	
	@FindBy(name="res")
	WebElement reset;
	
	public void  clickLink() {
		NewCustLink.click();
	}
	
	public void setCustomerName(String cname) {
		name.sendKeys(cname);
	}
	
	public void setGender(String cgender) {
		gender.click();
	}
	
	public void setDateof(String mm, String dd, String yy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}
	public void setAddress(String caddress) {
		address.sendKeys(caddress);
	}
	
	public void setCity(String ccity) {
		city.sendKeys(ccity);
	}
	public void setState(String cstate) {
		state.sendKeys(cstate);
	}
	
	public void setPinno(String string) {
		pinnumber.sendKeys(String.valueOf(string));
	}
	
	public void setTelephone(String ctel) {
		telephone.sendKeys(ctel);
	}
	
	public void setEmail(String cemail) {
		email.sendKeys(cemail);
	}
	
	public void setPassword(String cpassword) {
		password.sendKeys(cpassword);
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
	public void clickReset() {
		reset.click();
	}
}
