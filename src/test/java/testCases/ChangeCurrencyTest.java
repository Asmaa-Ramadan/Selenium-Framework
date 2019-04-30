package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProuctDetails;
import pageObjects.SearchPage;

public class ChangeCurrencyTest  extends BaseTestCase{

	HomePage HomeObject ;
	ProuctDetails ProductDetailsObject ;
	SearchPage SearchProductObject ;
	String productName= "Apple MacBook Pro 13-inch";

	@Test
	//To check if the currency of the product is changed after selecting it from Drop down list
	public void CheckProductChangedCurrency ()
	{
		HomeObject = new HomePage(driver);
		HomeObject.ChangeCurrency();
		SearchProductObject = new SearchPage(driver);
		SearchProductObject.SearchByAutosuggest(productName);
		ProductDetailsObject = new ProuctDetails(driver);
		Assert.assertTrue(ProductDetailsObject.ProductPrice.getText().contains("Ђ"));
		// Assert.assertTrue(SearchProductObject.ProductNameSearchResult.getText().equalsIgnoreCase(productName));

	}

}
