package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpsEx {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		// Alert alt = driver.switchTo().alert();
 //alt.accept();
		//or
//		 driver.switchTo().alert().accept();//accept----->to click ok button in alert
		
		// String ele = driver.switchTo().alert().getText();//getText()---->to fetch the alert message
		// System.out.println(ele);
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();------> to click ok button
		
		//driver.switchTo().alert().dismiss();------> to click cancel button 
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Good");
		//Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		
		
	}

}
