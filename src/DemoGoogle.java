import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Archana/Desktop/HTML/SelectButton.html");

		WebElement btn = driver.findElement(By.id("otherBtn"));
		WebDriverWait WW = new WebDriverWait(driver, 15);
		WW.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
	}

}
