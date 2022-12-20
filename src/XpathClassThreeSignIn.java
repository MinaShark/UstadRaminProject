import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathClassThreeSignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://myaccount.uscis.gov/");
		driver.findElement(By.xpath("//input[@name='user[email]']")).sendKeys("abc@gmail.com");
	//	driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("123-abc");
	//	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("Ali");
		driver.findElement(By.name("button")).click();
		
	//	driver.findElement(By.xpath("//button[text()= 'Sign In']")).click();
		driver.findElement(By.cssSelector("#Sing_In")).click();
		
		
		
		

	}

}
