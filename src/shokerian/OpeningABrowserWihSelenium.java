package shokerian;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpeningABrowserWihSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// to setup chrom driver to be used by selenium
		// before we used the setproperty
		
		WebDriverManager.chromedriver().setup();
		
		// create or instantiat the object of chrome driver and it is static way
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		//driver.close();// closing curent tab only one tab
		
		
		driver.quit(); // will close all the tab and close the session
		
		// if you add anything after driver.quict it will throuw no suchsession exception.. how to fix it
		// you have to debug it
	}

}
