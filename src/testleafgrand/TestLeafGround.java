package testleafgrand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/");
		
		driver.findElement(By.xpath("//))".click;
				try {
					Thread.sleep(3000);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				WebElement dropDown = driver.findElement(By.xpath("jkkkkk"));
				// we chose select class and we make object of the select class
				
				Select select = new Select(dropDown);
				select.selectByIndex(4);
				
				WebElement dropDown2 = driver.findElement(By.xpath("hgkalhfaj"));
			Select select2 = new Select(dropDown2);
			select2.selectByVisibleText("Appium");
			
			WebElement dropDown3 = driver.findElement(By.xpath("kfahkaghkoa"));
			Select select3 = new Select(dropDown3);
			select3.selectByValue("4");
			
			WebElement dropDown4 = driver.findElement(By.xpath("gakhglkalgj"));
			Select select4 = new Select(dropDown4);
		List<WebElement> allOptions = select4.getOptions();
		
		int count = allOptions.size();
		System.out.println(count);
		
		WebElement dropDown5 = driver.findElement(By.xpath("//select [5]"));
		dropDown5.sendKeys("selenium");
		
		
		WebElement dropDown6 = driver.findElement(By.xpath("select [6]"));
		Select select6 = new Select(dropDown6);
		select6.selectByVisibleText("selenium");
		select6.selectByVisibleText("Appium");
		
		select6.selectByVisibleText("UFT/QTP");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
