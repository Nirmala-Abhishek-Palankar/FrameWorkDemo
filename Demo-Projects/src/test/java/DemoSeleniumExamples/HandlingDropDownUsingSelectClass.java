package DemoSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) throws Throwable {
		//Three Approach
		//*Select by index------>index value starts from 0
		//*Select by Value
		//*Select by visibleText
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			Thread.sleep(1000);
			WebElement DayList = driver.findElement(By.id("day"));
           
			Select select = new Select(DayList);
			
			//select.selectByIndex(14);
			//select.selectByValue("25");
			select.selectByVisibleText("30");
			

			WebElement MonthList = driver.findElement(By.id("month"));
	        Select select1 = new Select(MonthList);
	    //    select1.selectByIndex(11);
	    //     select1.selectByValue("2");
	        select1.selectByVisibleText("Jun");
	        
	        WebElement yearList = driver.findElement(By.id("year"));
	        Select select2 = new Select(yearList);
	    //    select2.selectByIndex(24);
	    //    select2.selectByValue("2015");
	        select2.selectByVisibleText("1996");

	}

}
