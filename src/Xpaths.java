import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpaths {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://myaccount.uscis.gov/");
		
		driver.findElement(By.linkText("Create an account.")).click();
		
		
		// xpath
		//TagName[@atribute='value]
	
		driver.findElement(By.xpath("//input[@id= 'user_email']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='user[email_confirmation]']")).sendKeys("abc@gmail.com");
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//input[@name = 'user[email]']")).sendKeys("abc@gmail.com");
		
	//	driver.findElement(By.xpath("//input[@name='user[email]']")).clear();
		
		
	//	<input class="form-control string email optional form-control" 
		//		autofocus="autofocus" type="email" value="" name="user[email]" id="user_email">
		
		
		driver.findElement(By.cssSelector(". uscis-button-primary")).click();
	System.out.println(driver.findElement(By.xpath("//div[@id='footer']")).getText());
		driver.close();
		
		
		
	}

}
