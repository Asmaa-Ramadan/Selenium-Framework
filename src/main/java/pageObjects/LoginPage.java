package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageObject {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy (id ="Email")
	WebElement Email;
	@FindBy(id = "Password")
	WebElement Pass;
	@FindBy (xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")
	WebElement LoginBtn;
	
	
	
	public void UserLogin ( String email , String pass) {
		
		//Email.sendKeys(email);
		SetElementtxt(Email, email);
		
		//Pass.sendKeys(pass);
		SetElementtxt(Pass, pass);
		
		//LoginBtn.click();
		ClickButton(LoginBtn);
	}
}
