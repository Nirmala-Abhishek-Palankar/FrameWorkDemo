package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingEx1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://demo.automationtesting.in/Windows.html");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.findElement(By.linkText("Open New Seperate Windows")).click();
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				
				String mainId = driver.getWindowHandle(); //win 1
				System.out.println(mainId);
				
				Set<String> allIds = driver.getWindowHandles(); //win 2
				System.out.println(allIds);
				
				for (String id : allIds)
				{
					if(!mainId.equals(id))
					{
					driver.switchTo().window(id);
			 driver.findElement(By.linkText("Register now!")).click();
					
				
					
					}
					}

	}

}
