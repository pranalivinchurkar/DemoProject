import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueAssign1 {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // launching browser
		driver.manage().window().maximize();   //maximizing browser
		driver.get("https://www.bluestone.com/");  //Loading url
		
		WebElement RINGS= driver.findElement(By.xpath("//a[@title='RINGS']"));
		Actions a = new Actions(driver);  //mouse over action
		Thread.sleep(2000);
		a.moveToElement(RINGS).perform();
		

	}

}
