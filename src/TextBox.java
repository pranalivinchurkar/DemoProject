import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait WW = new WebDriverWait(driver, 15);
	
		driver.get("file:///C:/Users/Archana/Desktop/HTML/WebDriverWait.html");
        WebElement ele = driver.findElement(By.xpath("//input[@name='textA']"));
        ele.sendKeys("What is your name");
         WW.until(ExpectedConditions.textToBePresentInElementValue(ele, "What is your name"));
        driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Pranali");

	}

}
