package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProuctDetails;
import pageObjects.SearchPage;

public class SearchProductTest extends BaseTestCase {
	 String productName= "Apple MacBook Pro 13-inch";
	 SearchPage SearchObject ;
	 ProuctDetails ProductDetailsObject;
	 
	 @Test
	 public void SearchForProduct () {
		 
		  SearchObject = new SearchPage(driver);
		  ProductDetailsObject = new ProuctDetails(driver);
		  SearchObject.ProductSearch(productName);
		  ProductDetailsObject.ProductNameSearchByAutomComplet.click();
		  Assert.assertTrue(ProductDetailsObject.ProductNameSearchResult.getText().equalsIgnoreCase(productName));
		 
	 }
	 

}


