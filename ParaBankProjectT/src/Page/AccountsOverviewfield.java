package Page;

import java.time.Duration;

import org.openqa.selenium.By;

import main.ParaBankBase;

	public class AccountsOverviewfield  extends ParaBankBase{
		AccountsOverviewfield  AOF;
		public void TypeofAccount()
		{
			driver.findElement(By.xpath("//a[normalize-space()='Accounts Overview']")).isDisplayed();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//a[normalize-space()='Accounts Overview']")).click();
			
		}

		
}

