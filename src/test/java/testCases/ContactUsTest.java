package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactUsPage;
import pageObjects.HomePage;

public class ContactUsTest extends BaseTestCase{
	HomePage HomeObject ;
	
	ContactUsPage ContactObject ;
	String Name  = "Asmaa";
	String Email  = "AsmaaTest@gmail.com";
	String Msg = "This is for testing contactus page.";
			
	
	@Test
	public void UserContactUS ()
	{
		HomeObject = new HomePage(driver);
		ContactObject = new ContactUsPage(driver);
		HomeObject.ScrollToBottom();
		ContactObject.ContactUs(Name, Email, Msg);
		Assert.assertTrue(ContactObject.SuccessMsg.getText().contains(""));
	}

}
