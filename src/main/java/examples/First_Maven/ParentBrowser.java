package examples.First_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParentBrowser {


	@Test
	public void OpenBrowser() {

		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drive\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("http://testfire.net/login.jsp");
			
			WebElement userName = driver.findElement(By.id("uid"));
			userName.sendKeys("asmaa");
			
			WebElement passName = driver.findElement(By.id("passw"));
			passName.sendKeys("123456");
			
			WebElement login = driver.findElement(By.name("btnSubmit"));
			login.click();
	
	
		}
			
		

	
}

	private void Task() {
		// TODO Auto-generated method stub
		
	}}
