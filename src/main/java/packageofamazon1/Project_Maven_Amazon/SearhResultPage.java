package packageofamazon1.Project_Maven_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearhResultPage 
{
	
		WebDriver driver;
		//step1
		@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
		WebElement product1;
		

		
		//step2
		
		public void productselection(WebDriver driver) throws InterruptedException
		{
			product1.click();
			Thread.sleep(2000);
			Set<String>s1 = driver.getWindowHandles();
		    Iterator<String> it = s1.iterator();
		    String ParentId = it.next();
		    String ChildId = it.next();
		    
		    driver.switchTo().window(ChildId);
		}
		
		
		//step3
		public SearhResultPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}


}
