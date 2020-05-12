package MavenPackage;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 {
	WebDriver driver;
	@Test
	public void openfacebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\drivernew\\chromedriver.exe");				
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");	
		driver.quit();
	}
	@Test
	public void opengoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\drivernew\\chromedriver.exe");				
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");	
		driver.quit();
	}
	@Test
	public void openjavatpoint() {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\drivernew\\chromedriver.exe");				
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com");	
		driver.quit();
	}
	@Test
	public void openw3schools() {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\drivernew\\chromedriver.exe");				
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com");	
		driver.quit();
	}
}
