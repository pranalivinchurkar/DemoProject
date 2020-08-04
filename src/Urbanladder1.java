
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Urbanladder1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
        Thread.sleep(2000);
       List<WebElement> menus =driver.findElements(By.xpath("//ul[@class'topnav bodytext']/li"));
        System.out.println(menus.getClass());
        System.out.println("=================================");
        Actions a= new Actions(driver);
        for(WebElement menuName : menus){
        	System.out.println(menuName.getText());
        	System.err.println(name);
        	Thread.sleep(2000);
        	a.moveToElement(menuName).perform();
        	 List<WebElement> subMenues = driver.findElements
        			( By.xpath("//span[contains(.,'"+ name +"')]/parent::li/descendant::ul[@class-'taxonslist']"));
        			 		for(WebElement subMenusName : subMenues){
        			 			System.out.println(subMenusName.getText());
        			 			
        			 		}
        }
   
	}

}
