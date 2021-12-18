package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage  extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		
		
		action  = new Actions(driver);
		
		
	}
		@FindBy(id="nav-hamburger-menu")
		WebElement ALLlink;
		
		@FindBy(xpath="//div[normalize-space()='Computers']")
		WebElement Computerslink;
		
		
		@FindBy(xpath="//a[@class='hmenu-item'][normalize-space()='Computers & Tablets']")
		WebElement ComputersAndTabletslink;
		
		
		
		
		public void ALLhovermenu() throws Exception
		{
			
			
			ALLlink.click();
			Thread.sleep(3000);
			Computerslink.click();
			Thread.sleep(3000);
			ComputersAndTabletslink.click();
			//action.moveToElement(Computerslink).moveToElement(ComputersAndTabletslink)
			//.click().build().perform();
			
			
		}
		
		
	
		

}
