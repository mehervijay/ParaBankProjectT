package Page;

	
	import java.time.Duration;

	import org.openqa.selenium.By;

	import main.ParaBankBase;

	public class OpenNewAccount extends ParaBankBase{
		OpenNewAccount OPA;
		public void TypeofAccount()
		{
			driver.findElement(By.xpath("//select[@id='type']")).isDisplayed();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//select[@id='type']")).click();
			
		}

		public void OpenNewAccountbtn()
		    
		{
			driver.findElement(By.xpath("//input[@value='Open New Account']")).isDisplayed();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//input[@value='Open New Account']")).click();
		}
}
