package guru99Application;

import static org.testng.Assert.assertEquals;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class keyboardActions {
	
	ChromeDriver driver;
	
	String applicationUrl = "https://extendsclass.com/text-compare.html";
	
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
	public void keyboardActions() {
		
		WebElement el1 = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[1]/pre/span"));
		
		WebElement el2 = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[1]/pre/span"));

		Actions action = new Actions(driver);
		
		action.keyDown(el1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		action.keyDown(el2, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
}
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}
	
}
