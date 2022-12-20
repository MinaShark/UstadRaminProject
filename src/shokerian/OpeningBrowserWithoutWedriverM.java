package shokerian;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowserWithoutWedriverM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
