import javax.swing.SortingFocusTraversalPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch2 {
	public static void main (String []args){
		System.setProperty("Webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.google.com//");
	   String title = driver.getTitle();
	   System.out.println(title);
	   System.out.println("=====> " + driver.getCurrentUrl());
	   System.out.println("Current URL IS :" + driver.getCurrentUrl());
	}
}

	   
	   
	

}
