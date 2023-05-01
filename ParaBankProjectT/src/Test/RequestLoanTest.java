package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.LoginPageField;

	public class RequestLoanTest {
		RequestLoanTest rlt;
			LoginPageField LGpage;
			
			@BeforeMethod
			public void browserConfigure()
			{
				LGpage=new LoginPageField();
				LGpage.initialization();
				LGpage.login();
			}
			
			@Test
			public void validateclickrequestloan() 
			{
				LGpage.login();
				RequestLoanTest rlt=new RequestLoanTest();
				rlt.validateclickrequestloan();	
			}
			
			@Test
			public void validateApplynow() 
			{
				LGpage.login();
				RequestLoanTest rlt=new RequestLoanTest();
				rlt.validateApplynow();	
			}
					
			
			@AfterMethod
			public void closeBrowser()
			{
				LGpage.tearDown();
			}
		}

