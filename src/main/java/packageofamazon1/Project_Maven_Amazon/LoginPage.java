package packageofamazon1.Project_Maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	WebDriver driver;
	//step1
	@FindBy(name="email")
	WebElement username;
	

	@FindBy(id="continue")
	WebElement continuebutton;
	
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signin_button;
	//step2
	
	public void un()
	{
		username.sendKeys("angira.tarun4@gmail.com");
	}
	public void cntButtonClick()
	{
		continuebutton.click();
	}
	public void passw()
	{
		password.sendKeys("abc123@");
	}
	public void SigninClick()
	{
		signin_button.click();
	}
	
	//step3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
