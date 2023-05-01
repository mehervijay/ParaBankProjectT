package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.LoginPageField;

	public class BillPayFieldTest {
		BillPayFieldTest Bpf;
			LoginPageField LGpage;
			
			@BeforeMethod
			public void browserConfigure()
			{
				LGpage=new LoginPageField();
				LGpage.initialization();
				LGpage.login();
			}
			
			@Test
			public void validateclickbillpay() 
			{
				LGpage.login();
				BillPayFieldTest bpf=new BillPayFieldTest();
				bpf.validateclickbillpay();	
			}
			
			@Test
			public void validatePayeeName() 
			{
				LGpage.login();
				BillPayFieldTest bpf=new BillPayFieldTest();
				bpf.validatePayeeName();	
			}
			
			@Test
			public void validatePaymentbtn() 
			{
				LGpage.login();
				BillPayFieldTest bpf=new BillPayFieldTest();
				bpf.validatePaymentbtn();	
			}
			
			
			
			@AfterMethod
			public void closeBrowser()
			{
				LGpage.tearDown();
			}
		}



