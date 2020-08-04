import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // launching browser
		driver.manage().window().maximize();   //maximizing browser
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");  //Loading url
       //driver.get(http://username:password@url");
	}

}
