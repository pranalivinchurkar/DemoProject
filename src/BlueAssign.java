import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueAssign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // launching browser
		driver.manage().window().maximize();   //maximizing browser
		driver.get("https://www.bluestone.com/");  //Loading url
		
		WebElement sale = driver.findElement(By.xpath("//a[@title='Jewellery']"));
		Actions a = new Actions(driver);  //mouse over action
		Thread.sleep(2000);
		a.moveToElement(sale).perform();
		
		driver.findElement(By.xpath("//a [contains(.,'Kadas')]")).click();
		
		driver.findElement(By.xpath("//div[@class='p-image']/a[@target='_blank']")).click();
		Set<String> tabs = driver.getWindowHandles(); // switch tab
		for (String tab : tabs) {
			driver.switchTo().window(tab);
			
		}
		



	}

}
