import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(10000);
			  driver.findElement(By.xpath("//a[@class='fk-modal-visible']")).click();

	}

}
