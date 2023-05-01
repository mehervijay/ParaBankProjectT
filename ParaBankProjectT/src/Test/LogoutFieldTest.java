package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.LoginPageField;


	public class LogoutFieldTest {
		LogoutFieldTest lgot;
			LoginPageField LGpage;
			
			@BeforeMethod
			public void browserConfigure()
			{
				LGpage=new LoginPageField();
				LGpage.initialization();
				LGpage.login();
			}
			
			@Test
			public void validateLogoutField() 
			{
				LGpage.login();
				LogoutFieldTest lgot=new LogoutFieldTest();
				lgot.validateLogoutField();	
			}
			
}
