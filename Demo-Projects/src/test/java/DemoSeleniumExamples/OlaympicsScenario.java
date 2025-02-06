package DemoSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OlaympicsScenario {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://olympics.com/en/paris-2024/medals");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
	
	String gold = driver.findElement(By.xpath("//span[text()='United States of America']/../following-sibling::span[1]")).getText();
	System.out.println("Gold medals are:" +gold);
	
	String silver = driver.findElement(By.xpath("//span[text()='United States of America']/../following-sibling::span[2]")).getText();
	System.out.println("Silver medals are:" +silver);
	
	String bronze = driver.findElement(By.xpath("//span[text()='United States of America']/../following-sibling::span[3]")).getText();
	System.out.println("bronze medals are:" +bronze);
	
	String totalMedals = driver.findElement(By.xpath("//span[text()='United States of America']/../following-sibling::span[4]")).getText();
	System.out.println("total Medals are:" +totalMedals);
	
	//String button = driver.findElement(By.xpath("//span[text()='United States of America']/../following-sibling::button")).getText();
	
	//System.out.println("United States: close the row:" +button);
	}

}
