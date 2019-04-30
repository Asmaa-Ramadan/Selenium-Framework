package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProuctDetails;
import pageObjects.SearchPage;

public class SearchProductAutoSuggestTest extends BaseTestCase 
{
	String productName= "MacB";
	 SearchPage SearchObject ;
	 ProuctDetails ProductDetailsObject;
	 
	 @Test
	 public void SearchProductByAutoComplete ()
	 {
		SearchObject = new SearchPage(driver); 
		SearchObject.SearchByAutosuggest(productName);
		ProductDetailsObject = new ProuctDetails(driver);
		 Assert.assertTrue(ProductDetailsObject.ProductNameSearchResult.getText().contains(productName));
			 
		 
	 }
	 
}
