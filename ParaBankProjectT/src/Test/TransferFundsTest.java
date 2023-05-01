package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.LoginPageField;

public class TransferFundsTest {
	TransferFundsTest tft;
		LoginPageField LGpage;
	
	@BeforeMethod
	public void browserConfigure()
	{
		LGpage=new LoginPageField();
		LGpage.initialization();
		LGpage.login();
	}
	
		
	@Test
	public void validateFromAccount() 
	{
		LGpage.login();
		TransferFundsTest tft=new TransferFundsTest();
		tft.validateFromAccount();	
	}
	
	@Test
	public void validateToAccount() 
	{
		LGpage.login();
		TransferFundsTest tft=new TransferFundsTest();
		tft.validateToAccount();	
	}
	
	@Test
	public void validateTransferbtn() 
	{
		LGpage.login();
		TransferFundsTest tft=new TransferFundsTest();
		tft.validateTransferbtn();	
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		LGpage.tearDown();
	}
}

