package testleafgrand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGroundButton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@src='images/button.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		
		
	driver.findElement(By.xpath("//img[@src='images/button.png']")).click();	
//	WebElement positionOfButton =	driver.findElement(By.xpath("//button[@id='position']"));
	//int xPostion =	positionOfButton.getLocation().x;
 //  int yPosition =	positionOfButton.getLocation().y;
 //  System.out.println("X position" + xPostion + "Y position is" + yPosition);
		
	
		WebElement positionOfButton = driver.findElement(By.xpath("//button[@id='home']"));
	int xPosition =	positionOfButton.getLocation().x;
	int yPosiotion = positionOfButton.getLocation().y;
	System.out.println("X Position is "+ xPosition + "Y Position is " + yPosiotion);
	
	
	WebElement color = driver.findElement(By.xpath("//button[@id='color']"));
	color.getAttribute("style");
	String printColor = color.getAttribute("style");
	System.out.println(printColor);
	
	
	WebElement getHighAndWeight = driver.findElement(By.xpath("//button[@id='size']"));
	int height = getHighAndWeight.getSize().height;
	int width = getHighAndWeight.getSize().width;
	System.out.println("Height is " + height + " Weight is " + width);
	
	
	
	
	
	}

}
