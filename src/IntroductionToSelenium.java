import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IntroductionToSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//Users/mina/Downloads");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();// this is the object 
		
		driver.get("https://myaccount.uscis.gov/");
		
		driver.findElement(By.id("user_email")).sendKeys("mina.sediqi@gmail.com");
		driver.findElement(By.name("user[password]")).sendKeys("123ABC");
		driver.findElement(By.className("uscis-button-primary")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div#flash_alert")).getText());
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		
		
		//<input class="form-control string email optional form-control" autofocus="autofocus" 
		//		type="email" value="" name="user[email]" id="user_email">
		

	}

}
