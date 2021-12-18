package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends PageBase {

	public AddToCart(WebDriver driver) {
		super(driver);

	}
	@FindBy(id="add-to-cart-button")
	WebElement AddtocartBUTTON;


	@FindBy(id="nav-cart-count-container")
	WebElement opencart;

	public void submitAddTOcart()
	{
		AddtocartBUTTON.click();
	}
	
	
	public void OpenTheCart()
	{
		
		opencart.click();
	}
}
