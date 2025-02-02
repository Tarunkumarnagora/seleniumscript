package packageofamazon1.Project_Maven_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	//step1
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtf;
	
	//span[@class='nav-line-2 ']
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist_hoverover;
	
	//(//span[text()='Sign in'])[1]
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	WebElement signin_home;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	WebElement logoutbutton;
	//step2
	
	public void searching()
	{
		searchtf.sendKeys("shoe"+Keys.ENTER);
	}
	public void hoverover(WebDriver driver)
	{
		Actions a1= new Actions(driver);
				a1.moveToElement(accountandlist_hoverover).perform();
	}
	public void signin()
	{
		signin_home.click();
	}
	public void logout()
	{
		logoutbutton.click();
	}
	
	//step3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
