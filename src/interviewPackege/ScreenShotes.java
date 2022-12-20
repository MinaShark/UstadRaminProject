package interviewPackege;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotes {

	private static final String ScreenShotes = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		Thread.sleep(3000);
		
		File srcScreenshot = driver.findElement(By.name("search")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcScreenshot,new File(System.getProperty("user.dir")+"\\ScreenShotes.png"));
		
		
	}

}
