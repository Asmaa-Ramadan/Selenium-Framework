package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProuctDetails  extends BasePageObject{

	public ProuctDetails(WebDriver driver) {
		super(driver);
	}
	// Web element found by auto-complete search
	@FindBy (css = "strong.current-item")
	public WebElement ProductNameSearchResult;
	
	
	// Web element found by clicking on search 
	@FindBy (partialLinkText ="Apple MacBook Pro 13-inch")
	public WebElement ProductNameSearchByAutomComplet;
	
	// to find the product price, also used for checking change currency
	@FindBy (css= "span.price-value-4")
	public WebElement ProductPrice ;

}
