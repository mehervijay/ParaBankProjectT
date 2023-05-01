package Page;

import java.time.Duration;

import org.openqa.selenium.By;

import main.ParaBankBase;

	public class BillPayField  extends ParaBankBase{
		BillPayField  BPF;
		public  BillPayField()
		{
			driver.findElement(By.xpath("//a[normalize-space()='Bill Pay']")).isDisplayed();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			driver.findElement(By.xpath("//a[normalize-space()='Bill Pay']")).click();
			
			
		}
		public void PayeeNameField()
		{
			driver.findElement(By.xpath("//input[@name='payee.name']")).sendKeys("mehervijay");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			driver.findElement(By.xpath("//input[@name='payee.name']")).click();
			
			
		}
		public void AccountNumber()
		{
			driver.findElement(By.xpath("//input[@name='payee.accountNumber']")).sendKeys("1234567891");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			driver.findElement(By.xpath("//input[@name='payee.accountNumber']")).click();
			
			
		}
		public void Paymenetbtn()
		{
			driver.findElement(By.xpath("//input[@value='Send Payment']")).isDisplayed();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			driver.findElement(By.xpath("//input[@value='Send Payment']")).click();
			
			
		}
		
}
