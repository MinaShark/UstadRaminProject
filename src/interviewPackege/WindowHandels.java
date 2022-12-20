package interviewPackege;

import java.sql.DriverManager;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		
		
		// getWindowHandel()
		// Get us the window handle of the current focused window
		// get handel it is uniq adress for currently focused window
		// return only one window
		
		driver.findElement(By.linkText("Open a popup window")).click();
		String defaultWindow = driver.getWindowHandle();
		
	Set<String>	allWindows= driver.getWindowHandles();
	Iterator<String> itr = allWindows.iterator();
	itr.next();
	String childWindow = itr.next();
	
	driver.switchTo().window(childWindow);
	Thread.sleep(3000);
	driver.close();
		
	
	driver.switchTo().window(defaultWindow);
	
	Thread.sleep(3000);
	
	driver.close();
		
		
		// getwindowHandls()
		// get us all the currrently open windows
		// return type is set
	}

}
