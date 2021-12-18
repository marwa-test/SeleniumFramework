package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase {

	public ProductsPage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath="//li[@id='p_89/Samsung Electronics']//i[@class='a-icon a-icon-checkbox']")
	WebElement SamsungElectronicslink;
	
	
	@FindBy(xpath="//img[@alt='Samsung Tab A7 Lite 8.7\" Gray 32GB (SM-T220NZAAXAR)']")
	WebElement Product;
	
	
	
	
	public void clickOnSamsungAndElectronics()
	{
		
		SamsungElectronicslink.click();
		
		
	}
	public void ClickOnProduct()
	{
		
		Product.click();
	}
	
	
	
	
	
}




