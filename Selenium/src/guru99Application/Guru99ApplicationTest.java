package guru99Application;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99ApplicationTest {
	
	ChromeDriver driver;
	
//	String applicationUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
	String applicationUrl = "https://www.ebay.com/";
	
	String username = "d.h.i.r.a.j.45";
	
	String pass = "123456";
	
	@BeforeMethod
	public void invokeBrowser() {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhiraj\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get(applicationUrl);	
		
	}
	
	@Test
	public void alertPopup() {
				
		String expLabel = "Guru99 Bank";
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).build().perform();
		
		
		
}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}
	
}
