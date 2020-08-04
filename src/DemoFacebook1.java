
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoFacebook1 {

	private static Select sday;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com//");
		Thread.sleep(2000);
		WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
				Select s = new Select(day);
				s.selectByValue("19");
				
				WebElement month= driver.findElement(By.xpath("//Select[@id='month']"));
				Select smonth = new Select(month);
				smonth.selectByIndex(6);
				
				WebElement year= driver.findElement(By.xpath("//Select[@title='Year']"));
				Select syear = new Select(year);
				syear.selectByValue("1996");
				
				System.out.println("========================");
				List<WebElement> days =sday.getOptions();
				for(WebElement dayValue : days){
					System.out.println(dayValue.getText());
				}
				
				

	}

}
