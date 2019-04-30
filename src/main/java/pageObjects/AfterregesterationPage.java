package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterregesterationPage extends BasePageObject{

	public AfterregesterationPage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]")
	WebElement Success;
	
	@FindBy(linkText ="Log out")
	WebElement LogoutLink;
	
	

	public String Confirm()
	{
		
	String SuccessMSg = Success.getText(); 
	System.out.println(SuccessMSg);
	return SuccessMSg;
	}
	
	public void Logout ()
	{
		//LogoutLink.click();
		ClickButton(LogoutLink);
	}
}
