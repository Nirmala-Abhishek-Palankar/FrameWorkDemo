package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingEx2 {

	public static void main(String[] args)
	{
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt=\"Apple iPhone 15 (Black, 128 GB)\"]")).click();
		
		String mainId = driver.getWindowHandle(); //win 1
		System.out.println(mainId);
		
		Set<String> allIds = driver.getWindowHandles(); //win 2
		System.out.println(allIds);
		
		for (String id : allIds)
		{
			if(!mainId.equals(id))
			{
			driver.switchTo().window(id);
			String phn = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
			System.out.println(phn);
			
			}
			}
		}
		
		
		
		
		
		
		
		
	}

