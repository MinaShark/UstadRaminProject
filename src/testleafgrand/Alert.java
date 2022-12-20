package testleafgrand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
	
		driver.findElement(By.xpath("//img[@src='images/alert.png']")).click();
		
	//	driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		
	//	driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		
	//	WebElement confirm = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
			//	confirm.click();
	//			
				org.openqa.selenium.Alert alertBox = driver.switchTo().alert();
		//Thread.sleep(3000);
	//	alertBox.accept();
		//alertBox.dismiss();
		
		
	//	WebElement promptBox = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()\"]"));
	//	promptBox.click();
		
	//	org.openqa.selenium.Alert alertBox1 = driver.switchTo().alert();
	//	Thread.sleep(3000);
		//alertBox1.accept();
				
				WebElement lineBreak = driver.findElement(By.xpath("//button[@onclick=\lineBreaks()\"]");
				lineBreak.click();
				
				Alert alerBoxLineBreak = driver.switchTo().alert();
				Thread.sleep(3000);
				alerBoxLineBreak .getText();
				String textAlert = alerBoxLineBreak.getText();
				System.out.println(textAlert);
				
				
		
		
		
	}

}
