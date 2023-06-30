package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithChrome {
		
	ChromeDriver driver;
	
//	String url = "https://demo.guru99.com/test/selenium-xpath.html";
	
	@BeforeTest
	public void openChrome() {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhiraj\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void getTitle(String url) {
		
		driver.get(url);
		
		String xpath = "//img[@class= \"lnXdpd\"]";
		
		
		String Text = driver.findElement(By.xpath(xpath)).getText();
		
//		String PageTitle = driver.getTitle();
		
//		System.out.println("Page title " + Text);
		
		driver.findElement(By.xpath("//*[@id=\":rk:\"]")).sendKeys("dhiraj@yopmail.com");
		
		driver.findElement(By.xpath("//*[@id=\":rm:\"]")).sendKeys("1234567");
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
