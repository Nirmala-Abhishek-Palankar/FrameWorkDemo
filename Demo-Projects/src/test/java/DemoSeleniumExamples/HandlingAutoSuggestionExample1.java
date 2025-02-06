package DemoSeleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestionExample1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("puma");
		Thread.sleep(2000);
		
		List<WebElement> allsegg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
		
		for (WebElement sugg : allsegg) {
			System.out.println(sugg.getText());
			if (sugg.getText().contains("puma shoes"))
			{
				sugg.click();
					break;
			}
			
		}
	}

}
