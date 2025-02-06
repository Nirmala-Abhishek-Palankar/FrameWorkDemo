
package PopUps;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(2000);
	
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	//	driver.findElement(By.xpath("//div[text()='September 2024']/../..//p[text()='5']")).click();

	// driver.findElement(By.xpath("//div[text()='September 2024']/ancestor::div[@class='DayPicker-Month']//p[text()='10']")).click();
	
	//	driver.findElement(By.xpath("//div[text()='September 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='7']")).click();
	
	//Dynamic xpath:- The path remains same, any value changes should be done outside the path.
		String month = "August 2024";
		String date = "30";
		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
	
	}

}
