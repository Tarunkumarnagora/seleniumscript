package packageofamazon1.Project_Maven_Amazon;
import java.time.Duration;

import org.testng.annotations.Test;




public class TestCase1 extends LaunchQuit
{
	@Test
	public void test() 
	{
		
		
		HomePage homepage = new HomePage(driver);
		homepage.hoverover(driver);
		homepage.signin();
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.un();
		loginpage.cntButtonClick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage.passw();
		loginpage.SigninClick();
		
		homepage.searching();
		homepage.hoverover(driver);
		homepage.logout();
		
		
	}

}
