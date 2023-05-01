package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.LoginPageField;

public class LoginPageFieldTest {

	

		LoginPageField LGPage;
		
		@BeforeMethod
		public void browserConfig()
		{
			LGPage=new LoginPageField();
			LGPage.initialization();
				
		}
		
		@Test
		public void validateLoginTest()
		{
			LGPage.login();
		}
		
		@AfterMethod
		public void closeBrowser()
		{
			LGPage.tearDown();
		}
	}




