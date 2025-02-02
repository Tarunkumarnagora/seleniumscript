package packageofamazon1.Project_Maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver driver;
	//step1
	@FindBy(xpath="(//div[@name='sc-quantity']/button)[2]")
	WebElement addicon;
	
	//step2
	
	public void clickonaddicon() throws InterruptedException
	{
		addicon.click();
		Thread.sleep(2000);
		addicon.click();
	}
	
	
	//step3
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
