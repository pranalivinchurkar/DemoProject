import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemofFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com//");
		//WebElement ele = driver.findElement(By.id("email"));
		//ele.sendKeys("Abc");
		//WebElement password = driver.findElement(By.name("pass"));
		//password.sendKeys("124h7");
	    //WebElement login = driver.findElement(By.id("loginbutton"));
	   // login.click();
		driver.findElement(By.xpath()
		
		

	}

}
