package DemoSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4PhonePrice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone15");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//Approach1:-
		//String phnPrice = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 256 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
//			System.out.println(phnPrice);

		//Approach2:-
//			String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
//			System.out.println(price);
		
		
		//Approach3:-
		String phnPrice = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']//div[@class='Nx9bqj _4b5DiR']")).getText();
		System.out.println(phnPrice);

	}

}