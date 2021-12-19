package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="/html/body/div[1]/div[4]/div[1]/div[3]/div/div[2]/div[4]/div/form/div[2]/div/div/div[1]/span")
	public WebElement removemessage;
	
	@FindBy(xpath="/html/body/div[1]/div[4]/div[1]/div[3]/div/div[2]/div[4]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/ul/li[1]/span/a/span[1]/span/span[2]")
	public WebElement itemincart;	
	
	
	@FindBy(xpath="/html/body/div[1]/div[4]/div[1]/div[3]/div/div[2]/div[4]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input")
	WebElement DeleteCart;
	
	
	
	public void DeleteFromTheCart()
	{
		DeleteCart.click();
	}
	


}



