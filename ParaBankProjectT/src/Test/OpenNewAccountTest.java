package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.LoginPageField;


		public class OpenNewAccountTest {
			OpenNewAccountTest aof;
				LoginPageField LGpage;
				
				@BeforeMethod
				public void browserConfigure()
				{
					LGpage=new LoginPageField();
					LGpage.initialization();
					LGpage.login();
				}
				
				@Test
				public void validateOpenNewAccountTest() 
				{
					LGpage.login();
					OpenNewAccountTest aof=new OpenNewAccountTest();
					aof.validateOpenNewAccountTest();	
				}
				
				@Test
				public void validateTypeOfAccount() 
				{
					LGpage.login();
					OpenNewAccountTest aof=new OpenNewAccountTest();
					aof.validateTypeOfAccount();	
				}
				
				
				@AfterMethod
				public void closeBrowser()
				{
					LGpage.tearDown();
				}
			}

