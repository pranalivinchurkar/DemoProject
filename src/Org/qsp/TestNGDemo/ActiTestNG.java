package Org.qsp.TestNGDemo;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActiTestNG {
	WebDriver driver; // declearing globally
	@BeforeSuite
	public void beforeS(){
		Reporter.log("Before Suite", true);
		

	}
	@BeforeTest
	public void beforeT(){
		Reporter.log("Before Test", true);
	}
	@BeforeClass
	public void beforeC(){
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	}
	
	@BeforeMethod
	public void before(){
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com/login.do");

}
	@Test
	public void m1(){
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		Reporter.log("+ve",true);
	}
	@Test
	public void m2(){
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin",Keys.ENTER);
		Reporter.log("-ve",true);
	}
	@AfterMethod
	
	public void afterM(){
		driver.close();
		Reporter.log("After Method", true);
	}
	@AfterClass
	public void afterC(){
		driver.quit();
	}
	@AfterTest
	public void AfterS(){
		Reporter.log("After Test", true);
	}
	
}
