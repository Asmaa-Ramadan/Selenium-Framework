package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePageObject {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(className = "change-password")
	public WebElement ChangePass;

	@FindBy (id="OldPassword")
	public	WebElement OldPass;

	@FindBy(id = "NewPassword")
	public WebElement NewPass;

	@FindBy(id = "ConfirmNewPassword")
	public	WebElement ConfirmNewPass;

	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/input")
	public	WebElement ChangePassBtn;

	@FindBy(className ="result")
	public	 WebElement ChangedSuccessfully;

	public void ClickChange() 
	{
		//ChangePass.click();
		ClickButton(ChangePass);
	}

	public void Chagepassword(String oldPassword , String NewPassword)
	{
		//OldPass.sendKeys(oldPassword);
		SetElementtxt(OldPass, oldPassword);

		//NewPass.sendKeys(NewPassword);
		SetElementtxt(NewPass, NewPassword);

		//ConfirmNewPass.sendKeys(NewPassword);
		SetElementtxt(ConfirmNewPass, NewPassword);

		//ChangePassBtn.click();
		ClickButton(ChangePassBtn);

	}
}

