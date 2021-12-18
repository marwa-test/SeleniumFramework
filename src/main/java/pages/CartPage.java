package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//span[@class='a-truncate-cut']")
	public WebElement itemincart;	
	
	@FindBy(xpath="//[@value='Delete']")
	WebElement DeleteCart;
	
	
	
	public void DeleteFromTheCart()
	{
		DeleteCart.click();
	}
	


}



