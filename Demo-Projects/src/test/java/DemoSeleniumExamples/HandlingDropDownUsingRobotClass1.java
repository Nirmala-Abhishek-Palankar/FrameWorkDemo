package DemoSeleniumExamples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingRobotClass1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		WebElement DayList = driver.findElement(By.id("day"));
		DayList.click();
		Thread.sleep(1000);

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);

        rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		 rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
		

	}

}
