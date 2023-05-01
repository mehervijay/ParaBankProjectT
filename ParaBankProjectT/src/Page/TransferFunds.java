package Page;

import java.time.Duration;

import org.openqa.selenium.By;

import main.ParaBankBase;

	public class TransferFunds  extends ParaBankBase{
		TransferFunds  TF;
		public TransferFunds()
		{
			driver.findElement(By.xpath("//select[@id='fromAccountId']")).isDisplayed();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//select[@id='toAccountId']")).isDisplayed();
			
			driver.findElement(By.xpath("//select[@id='fromAccountId']")).click();
			driver.findElement(By.xpath("//select[@id='toAccountId']")).click();
			
		}
		public void Transferbtn()
		{
			driver.findElement(By.xpath("//input[@value='Transfer']")).isDisplayed();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
			driver.findElement(By.xpath("//input[@value='Transfer']")).click();
			
			
		}
}
