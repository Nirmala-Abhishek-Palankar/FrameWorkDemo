package DemoSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhoneColor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		////input[@name='field-keywords']
		driver.findElement(By.name("field-keywords")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
