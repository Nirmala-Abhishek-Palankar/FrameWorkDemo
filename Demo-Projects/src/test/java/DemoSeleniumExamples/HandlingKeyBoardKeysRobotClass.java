package DemoSeleniumExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardKeysRobotClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		 rob.keyPress(KeyEvent.VK_A);
		 rob.keyRelease(KeyEvent.VK_CONTROL);
		 rob.keyRelease(KeyEvent.VK_A);
		 
		 Thread.sleep(1000);
		 rob.keyPress(KeyEvent.VK_CONTROL);
		 rob.keyPress(KeyEvent.VK_C);
		 rob.keyRelease(KeyEvent.VK_CONTROL);
		 rob.keyRelease(KeyEvent.VK_C);
		 
		 Thread.sleep(1000);
		 rob.keyPress(KeyEvent.VK_TAB);
		 rob.keyRelease(KeyEvent.VK_TAB);
		 
		 Thread.sleep(1000);
		 rob.keyPress(KeyEvent.VK_CONTROL);
		 rob.keyPress(KeyEvent.VK_V);
		 rob.keyRelease(KeyEvent.VK_CONTROL);
		 rob.keyRelease(KeyEvent.VK_V);
		

	}

}
