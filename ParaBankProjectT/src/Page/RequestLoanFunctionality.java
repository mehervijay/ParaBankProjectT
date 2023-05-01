package Page;

import java.time.Duration;

import org.openqa.selenium.By;

import main.ParaBankBase;

public class RequestLoanFunctionality {

	public class RequestLoanFunct  extends ParaBankBase{
		RequestLoanFunct  RLF;
		public  RequestLoanFunct ()
		{
			driver.findElement(By.xpath("//a[normalize-space()='Request Loan']")).isDisplayed();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			driver.findElement(By.xpath("//a[normalize-space()='Request Loan']")).click();
			
			
		}
		public void ApplyNowBtn()
		{
			driver.findElement(By.xpath("//a[normalize-space()='Request Loan']")).isDisplayed();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			driver.findElement(By.xpath("//a[normalize-space()='Request Loan']")).click();
			
			
		}
	}
}