package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePageObject 
{

	public SearchPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id ="small-searchterms")
	WebElement SerachTextBox ;
	
	//Using search button click
	@FindBy(css ="input.button-1.search-box-button")
	WebElement SearchButton;

	//Using auto suggest search
	@FindBy (id ="ui-id-1")
	List<WebElement> ProductList;

	
	// Method using search button
	public void ProductSearch (String ProductName)
	{
		SetElementtxt(SerachTextBox, ProductName);
		ClickButton(SearchButton);
		//	ClickButton(ProductAutoComplete);


	}

	// Method using auto suggest search
	public void SearchByAutosuggest ( String Searchtxt)
	{

		SetElementtxt(SerachTextBox, Searchtxt);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ProductList.get(0).click();
	}

}
