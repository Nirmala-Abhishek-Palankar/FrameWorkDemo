package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPopupEx3 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		//driver.switchTo().frame(2);--> not recommended 
	Thread.sleep(1000);
	WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
driver.switchTo().frame(topFrame);
	
	//from parent to child frame   //approach:2
	driver.switchTo().frame("frame-left");
	String leftFrame = driver.findElement(By.xpath("//body[contains(text(),' LEFT')]")).getText();
		System.out.println(leftFrame);
		
	
//		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		String middleFrame = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
	System.out.println(middleFrame);
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame("frame-right");
	String rightFrame = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
System.out.println(rightFrame);

//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();

driver.switchTo().defaultContent();

		driver.switchTo().frame("frame-bottom");
		String bottomFrame = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(bottomFrame);

	}

}
