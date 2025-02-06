package DemoSeleniumExamples;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollBarUsingJavaScriptExecutorEx2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com");
		
//		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Instagram\"]"));
//		org.openqa.selenium.Point loc =ele.getLocation();
//		System.out.println(loc.getX());
//		System.out.println(loc.getY());
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		  js.executeScript("window.scrollBy(392,825)");
//		  Thread.sleep(1000);
//		  ele.click();
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView()",ele); 
//		ele.click();

		driver.get("https://www.amazon.in");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	     Thread.sleep(1000);
	     js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
	}

}
