import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch1 {
	public static void main (String []args)throws InterruptedException{
		System.setProperty("Webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com//");
	   driver.navigate().to("https://www.google.com//");
         Thread.sleep(2000);	  
          driver.navigate().back();
	      Thread.sleep(2000);
	     driver.navigate().forward();
	       Thread .sleep(2000);
	   driver.navigate().refresh();
	   driver.close();
	   
	
		
		
	}
	

}
