package testleafgrand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditBox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("//img[@src='images/edit.png']")).click();
	WebElement emailAdress = driver.findElement(By.xpath("//input[@id='email']"));
		emailAdress.sendKeys("abc@123gmail.com");	
		
	driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Mina");
	
	//System.out.println(driver.findElement(By.xpath("//input[@value='TestLeaf']"))
	//		.getText());
	
	
	WebElement getText = driver.findElement(By.xpath("//input[@name='username' and @"
			+ "value ='TestLeaf']"));
	String textValue = getText.getAttribute("name");
	System.out.println(textValue);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input)[4]")).clear();
	
	WebElement disabled = driver.findElement(By.xpath("(//input)[5]"));
	
	disabled.isEnabled();
	boolean isdisabledTrue = disabled.isEnabled();
	System.out.println(isdisabledTrue);
	
	
	
	
	
	
	
	
	
	}

}
