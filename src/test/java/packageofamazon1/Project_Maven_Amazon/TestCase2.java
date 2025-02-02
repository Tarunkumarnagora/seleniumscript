package packageofamazon1.Project_Maven_Amazon;
//login-->Search-->add it to wishlist-->add it to cart--> logout

import java.time.Duration;

import org.testng.annotations.Test;

public class TestCase2 extends LaunchQuit
{	
		@Test
		public void test() throws InterruptedException 
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
			
			SearhResultPage searchpage = new SearhResultPage(driver);
			searchpage.productselection(driver);
			
			Product1Page product1page = new Product1Page(driver);
			product1page.productwishlistadd();
			product1page.continueshoppingclick();
			
			product1page.addtocartclick();
			
			Thread.sleep(3000);
			homepage.hoverover(driver);
			homepage.logout();
			
			
		}


}
