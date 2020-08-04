import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLoc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		Point loc = search.getLocation();
		System.out.println(loc);
		int X = loc.getX();
		int Y = loc.getY();
		System.out.println("X : " + X + " ====== "+ "Y :" + Y);
		

	}

}
