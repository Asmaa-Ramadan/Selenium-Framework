package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePageObject {

	public HomePage(WebDriver driver) {
		super(driver);
		// To be able to execute javascript scrolling in home page
		jse = (JavascriptExecutor) driver ;

	}

	// Used in register page
	@FindBy(linkText= "Register")
	WebElement RegisterLink;

	// Used in LoginPage
	@FindBy(linkText="Log in")
	WebElement LoginLink;

	// Used in MyAccount Page
	@FindBy(linkText= "My account")
	WebElement MyAccountlink;

	//Used in search page
	@FindBy (id ="small-searchterms")
	WebElement SearchBox;

	//Used in ContactUs
	@FindBy (partialLinkText ="Contact us")
	WebElement ContactUsLink;
	
	
	// Used for changing Currency, Used in ProductDetails
	@FindBy(id="customerCurrency")
	WebElement CurrencyChange;
	
	public void OpenRegisterationPage()
	{
		//RegisterLink.click();
		ClickButton(RegisterLink);
	}

	public void OpenLoginPage() 
	{

		//LoginLink.click();
		ClickButton(LoginLink);
	}

	public void MyAccount()
	{
		//MyAccountlink.click();
		ClickButton(MyAccountlink);
	}


	public void ClcikOnSearch()
	{
		SearchBox.click();
		SearchBox.sendKeys("Apple");
		SearchBox.submit();

	}

	// To Scroll to the bottom of the home page
	public void OpenContactUsPage()
	{

		ScrollToBottom();
		ClickButton(ContactUsLink);
		
	}
	
	
	// To change currency
	public void ChangeCurrency ()
	{
		select = new Select(CurrencyChange);
		select.selectByIndex(1);
	}
	
}
