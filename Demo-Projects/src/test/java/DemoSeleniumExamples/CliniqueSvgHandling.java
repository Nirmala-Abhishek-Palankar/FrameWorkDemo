package DemoSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CliniqueSvgHandling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.clinique.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='OK, ACCEPT ALL']")).click();
		
		//driver.findElement(By.xpath("//*[name()='svg' and @class='header-search-icon']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @class='ufc-cart-icon-svg']")).click();
	}

}
