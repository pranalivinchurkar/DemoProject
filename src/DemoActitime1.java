import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActitime1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.partialLinkText("Inc.")).click();
		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs){
}
		System.out.println(driver.getTitle());
		
		}
		
		

	}
		
