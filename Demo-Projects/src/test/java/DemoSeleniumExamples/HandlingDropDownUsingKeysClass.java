package DemoSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement DayList = driver.findElement(By.id("day"));
		DayList.click();
		DayList.sendKeys(Keys.ARROW_DOWN);
		DayList.sendKeys(Keys.ARROW_DOWN);
		DayList.sendKeys(Keys.ARROW_DOWN);
		DayList.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(1000);
		
		DayList.sendKeys(Keys.ARROW_UP);
		DayList.sendKeys(Keys.ARROW_UP);

	}

}
