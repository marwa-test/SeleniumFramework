package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddToCart;
import pages.CartPage;
import pages.HomePage;
import pages.ProductsPage;


public class AmazonTest extends TestBase {
	
	HomePage HP;
	ProductsPage PP;
	AddToCart ADD;
	CartPage CP;
	String ProductName= "Samsung Tab A7 Lite 8.7\" Gray 32GB (SM-T220NZAAXAR)";
	
	
	@Test(priority=1)
	public void UserCanNavigateToTheProductPage() throws Exception
	{
		
		Thread.sleep(15000);
		HP = new HomePage(driver);
		
		HP.ALLhovermenu();
		

	}
		
	@Test (priority=2)
	public void addToCartCase() throws Exception 
	{
	 PP = new ProductsPage(driver);
	 Thread.sleep(3000);
		
		PP.clickOnSamsungAndElectronics();

	}

	@Test(priority=3)
	public void chooseProduct() 
	{
		PP = new ProductsPage(driver);
		
		PP.ClickOnProduct();

	}
	
	@Test (priority=4)
	public void clickAddToCart() throws Exception
	{
		
		
		ADD= new AddToCart(driver);
		Thread.sleep(5000);
		ADD.submitAddTOcart();
		
	}
	

	@Test (priority=5)
	public void gotoAddToCart() {

		ADD = new AddToCart(driver);

		driver.navigate().to("https://www.amazon.com/"+"gp/cart/view.html?ref_=nav_cart");
		CP = new CartPage(driver);
		Assert.assertTrue(CP.itemincart.getText().equals(ProductName));
		

	}
	@Test(priority=6)
	public void removeproduct() throws Exception
	{
		CP= new CartPage(driver);
		Thread.sleep(5000);
		CP.DeleteFromTheCart();
		Assert.assertTrue(CP.removemessage.getText().equals("Samsung Tab A7 Lite 8.7\" Gray 32GB (SM-T220NZAAXAR) was removed from Shopping Cart."));
		
	
	

	
	
}}








