package DemoSeleniumExamples;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestionEx2 
{

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	driver.findElement(By.name("field-keywords")).sendKeys("Bluetooth");
		
		Thread.sleep(2000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		Thread.sleep(2000);
		
	for (WebElement ele : allsugg) 
	{
		System.out.println(ele.getText());
		if(ele.getText().contains("bluetooth mouse"))
		{
			ele.click();
			break;
		}
	}
		

	}

}
