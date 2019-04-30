package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AfterregesterationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import pageObjects.UserRegesterationPage;

public class UserRegisterTest extends BaseTestCase {


	HomePage HomeObject;
	UserRegesterationPage RegisterObject;
	AfterregesterationPage SuccessMSG; 
	AfterregesterationPage LogoutObject;
	LoginPage LoginObject;
	MyAccountPage MyAccountObject;

	String FirstName ="Asmaa";
	String LastName = "Ramadan";
	String Mail = "TestingByMe@gmail.com" ;
	String OldPassword = "Asma123456";
	String NewPassword = "Asma2NEW123456";
	
	@Test(enabled = false)
	public void Userregisteration() {

		HomeObject = new HomePage(driver);
		HomeObject.OpenRegisterationPage();
		RegisterObject = new UserRegesterationPage(driver);
		RegisterObject.Userregister(FirstName, LastName, OldPassword, Mail);

		// To confirm that user has logged in 
		SuccessMSG = new AfterregesterationPage(driver);
		Assert.assertEquals(SuccessMSG.Confirm(),"Your registration completed");

	}

	//User can logout from this method
	@Test(enabled = false)
	public void UserLogOut() {
		LogoutObject = new AfterregesterationPage(driver);
		LogoutObject.Logout();
	}


	// User that has registered in method one can login here with same credentials 
	@Test  (enabled = true)
	public void UserLogin() {
		HomeObject = new HomePage(driver);
		HomeObject.OpenLoginPage();
		LoginObject = new LoginPage(driver);
		LoginObject.UserLogin(Mail, OldPassword);

		
	}
	@Test(enabled = false)
	public void ChangePassword() {
		HomeObject.MyAccount();
		MyAccountObject = new MyAccountPage(driver);
		MyAccountObject.ClickChange();
		MyAccountObject.Chagepassword(OldPassword, NewPassword);
		Assert.assertTrue(MyAccountObject.ChangedSuccessfully.getText().contains("Password was changed"), "Password was changed");
		System.out.println(MyAccountObject.ChangedSuccessfully.getText());

	}
	@Test (enabled = false)
	public void Search() {
		HomeObject.ClcikOnSearch();
	}




}
