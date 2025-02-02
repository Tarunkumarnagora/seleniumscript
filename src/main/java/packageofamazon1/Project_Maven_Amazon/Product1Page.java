package packageofamazon1.Project_Maven_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Product1Page {
	WebDriver driver;
	//step1
	@FindBy(id="wishListMainButton")
	WebElement productwislist;
	@FindBy(xpath="(//span[.='Continue shopping'])[1]")
	WebElement continueshoping;
   
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addtocart;
	
	@FindBy(xpath="//div[@id='nav-cart-count-container']")
	WebElement countcart;
	//step2
	
	public void productwishlistadd() throws InterruptedException
	{
		productwislist.click();
	}
	public void continueshoppingclick() throws InterruptedException
	{
		Thread.sleep(3000);
		continueshoping.click();
	}
	public void addtocartclick()
	{
		addtocart.click();
	}
	public void clickoncart()
	{
		countcart.click();
	}
	
	//step3
	public Product1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
