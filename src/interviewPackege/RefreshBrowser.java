package interviewPackege;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		Thread.sleep(3000);
		
		
		
		// to refresh the browser, we are using the following 5 ways.
		
		// dirver.navigate. refresh
		driver.navigate().refresh();
		
		
		// using the send key of action classfor refresh we have to create action class
		
		
	Actions actions = new Actions(driver);
	
	actions.sendKeys(Keys.F5).build().perform();
		
	
	// java executor
	JavascriptExecutor jse =(JavascriptExecutor)driver;
	jse.executeScript("window.location.reload();");
	
	// driver. get( driver currenturl
	driver.get(driver.getCurrentUrl());
	
	
	// driver.navigate
	driver.navigate().to(driver.getCurrentUrl());
	

	
	
	driver.quit();



	
	
		
	}

}
