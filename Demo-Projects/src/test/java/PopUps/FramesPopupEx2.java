package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPopupEx2 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
//		driver.switchTo().frame(1);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Qspider");
		
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
//		driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
		
		WebElement frame = driver.findElement(By.cssSelector("[id='singleframe']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nirmala");

	}

}
