package interviewPackege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookWithZuhal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("http://tek-school.com/retail/");
		
	WebElement text =	driver.findElement(By.xpath("//a[text() = 'TEST ENVIRONMENT']"));
	//System.out.println(textElement.getText());
	
	Assert.assertEquals(text.getText(),"TEST ENVIRONMENT");
	
	
	
	driver.close();
		
		
		
		
		
		
		
		
	}

}
