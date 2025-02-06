package DemoSeleniumExamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingRobotClass {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//Thread.sleep(1000);
		
		//WebElement DayList = driver.findElement(By.id("day"));
		WebElement DayList = driver.findElement(By.id("day"));
		DayList.click();
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		 rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			
	Thread.sleep(1000);
			 rob.keyPress(KeyEvent.VK_UP);
			rob.keyRelease(KeyEvent.VK_UP);

	}

}
