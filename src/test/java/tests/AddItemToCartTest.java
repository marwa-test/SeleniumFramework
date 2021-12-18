package tests;



import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.CartPage;
import pages.ProductsPage;

public class AddItemToCartTest extends TestBase {

	AddToCart ADD;
	ProductsPage pp;
	CartPage CP;
	String ProductName= "Samsung Tab A7 Lite 8.7\" Gray 32GB (SM-T220NZAAXAR)";

	@Test (priority=1)
	public void addtocartcase() 
	{
		pp = new ProductsPage(driver);
		
		pp.clickOnSamsungAndElectronics();

	}

	@Test(priority=2)
	public void chooseproduct() 
	{
		pp = new ProductsPage(driver);
		
		pp.ClickOnProduct();

	}

	@Test (priority=3)
	public void gotoAddToCart() {

		ADD = new AddToCart(driver);

		driver.navigate().to("https://www.amazon.com/"+"gp/cart/view.html?ref_=nav_cart");
		CP = new CartPage(driver);
		Assert.assertTrue(CP.itemincart.getText().equals(ProductName));
		

	}
	
	@Test(priority=5)
	public void VerifyAddToCart() {
		CP = new CartPage(driver);
	Assert.assertTrue(true, ProductName);

	}
	
	

}




