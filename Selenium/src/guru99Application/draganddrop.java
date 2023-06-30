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

public class draganddrop {
	
	ChromeDriver driver;
	
//	String applicationUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
	String applicationUrl = "https://jqueryui.com/droppable/";
	
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
	public void dragandDrop() {
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
				
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(drag, drop).perform();
		
		
		
		
}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}
	
}
