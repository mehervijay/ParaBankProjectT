package Page;

import org.openqa.selenium.By;

import main.ParaBankBase;


	public class LoginPageField extends ParaBankBase {
		
		public void login()
		
	{ 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

		public void Logout() {
			
		}
	
}

