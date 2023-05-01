package Page;

import java.time.Duration;

import org.openqa.selenium.By;

import main.ParaBankBase;

	public class LogoutField  extends ParaBankBase{
		LogoutField  LF;
		public  LogoutField ()
		{
			driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).isDisplayed();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
			
			
		}
}
