package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegesterationPage extends BasePageObject {
	public UserRegesterationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="gender-female")
	WebElement genderbtn;

	@FindBy(id="FirstName")
	WebElement FirstName;

	@FindBy(id="LastName")
	WebElement Lastname;

	@FindBy(id="Email")
	WebElement Email;

	@FindBy(id="Password")
	WebElement Password;

	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPass;

	@FindBy(id="register-button")
	WebElement RegisterBtn;



	public void Userregister( String FName, String Lname , String Pass , String EMail) {
		//genderbtn.click();
		//ClickButton(genderbtn);
		ClickButton(genderbtn);
		
		//FirstName.sendKeys(FName);
		SetElementtxt(FirstName, FName);
		
		//Lastname.sendKeys(Lname);
		SetElementtxt(Lastname, Lname);
		
		//Email.sendKeys(EMail);
		SetElementtxt(Email, EMail);
		
		//Password.sendKeys(Pass);
		SetElementtxt(Password, Pass);
		
		//ConfirmPass.sendKeys(Pass);
		SetElementtxt(ConfirmPass, Pass);
		//RegisterBtn.click();
		ClickButton(RegisterBtn);
		
	}
	

}

