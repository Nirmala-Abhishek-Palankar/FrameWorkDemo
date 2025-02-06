package DemoSeleniumExamples;

import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollBarUsingJavaScriptExecutor 
{

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.amazon.in");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for (int i = 0; i < 5; i++)
		{
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(1000);
		}

		for (int i = 0; i < 3; i++)
		{
			js.executeScript("window.scrollBy(0,-800)");
			Thread.sleep(1000);
		} */
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for (int i = 0; i < 2; i++)
		{
			js.executeScript("window.scrollBy(100,0)");
			Thread.sleep(2000);
		}
		
		for (int i = 0; i < 2; i++)
		{
			js.executeScript("window.scrollBy(-100,0)");
			Thread.sleep(1000);
		}
		
	}

}
