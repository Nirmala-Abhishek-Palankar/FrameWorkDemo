package DemoSeleniumExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigatesMethods {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	//Alternative method to launch the WebApplication
	//	driver.navigate().to("https://www.makemytrip.com");
        
		Thread.sleep(2000);
		driver.get("https://www.makemytrip.com");
	
		Thread.sleep(2000);
	   driver.navigate().back();
	
	   Thread.sleep(2000);
	   driver.navigate().forward();
	
	   Thread.sleep(2000);
	   driver.navigate().refresh();
	}

}
