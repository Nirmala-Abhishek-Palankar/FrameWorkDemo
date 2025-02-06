package DemoSeleniumExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElements
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		int count=0;
		
		for (WebElement link : alllinks)
		{
			//System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			count++;
		}
		
		System.out.println("total number of links are :----->" +count);
	}

}
