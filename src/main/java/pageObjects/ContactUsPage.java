package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePageObject{

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath ="//*[@id=\"FullName\"]")
	WebElement UserName;

	@FindBy (id="Email")
	WebElement EmailTxt;

	@FindBy (id ="Enquiry")
	WebElement Enquiry ;	

	@FindBy (css="input.button-1.contact-us-button")
	WebElement SubmitBtn;

	@FindBy ( css ="div.result")
	public WebElement SuccessMsg;	
	
	
	public void ContactUs (String Name , String Email , String Msg)
	{
		SetElementtxt(UserName, Name);
		SetElementtxt(EmailTxt, Email);
		SetElementtxt(Enquiry, Msg);
		ClickButton(SubmitBtn);

	}
}
