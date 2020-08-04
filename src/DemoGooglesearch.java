import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGooglesearch {

	public static void main(String[] args)throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		WebElement java = driver.findElement(By.xpath("//div[@data-attrid='title']/span[contains(.,'java')]"));
		Actions a = new Actions(driver);
		a.doubleClick(java).perform();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		
		
		
	}

}
