import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
         Thread.sleep(10000);
          driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
          WebElement liv = driver.findElement(By.xpath("//li/span[contains(.,'living')]"));
         // driver.findElement(By.xpath("//input[@placeholder = 'Search']")).sendKeys(liv.getText(),Keys.ENTER);
          WebElement sale =driver.findElement(By.xpath("//li[@class-'topnav_item saleunit']"));
        Actions a=new Actions(driver);
        Thread.sleep(20000);
        a.moveToElement(sale).perform();
        driver.findElement(By.xpath("//li[@class-'topnav_item saleunit']/descendant::span[contains(.,'wooden sofa sets']")).click();
        
          
         
		

	}

}
