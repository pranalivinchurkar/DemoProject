import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNaukari {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("Webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukari.com//" );
		String parent = driver.getWindowHandle();
		System.out.println("Parent Windo handle:" + parent);
         Thread.sleep(5000);
         Set<String> windows = driver.getWindowHandles();
         for(String win : windows){
        	 System.out.println("All window Handle" + win);
        	 driver.switchTo().window(win);
            driver.close();
         
         
        	 
         }
		

	}

}
