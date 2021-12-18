package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;

public class RemoveFromCart extends TestBase {
	
	public CartPage CP;
	
	
	@Test(priority=6)
	public void removeproduct()
	{
		CP= new CartPage(driver);
		
		
		try {
			CP.DeleteFromTheCart();
			
            System.out.print("Samsung Tab A7 Lite 8.7\" Gray 32GB (SM-T220NZAAXAR) was removed from Shopping Cart.");
        } catch (Exception e) {
            Assert.fail("item not removed");
		
	
}}}
