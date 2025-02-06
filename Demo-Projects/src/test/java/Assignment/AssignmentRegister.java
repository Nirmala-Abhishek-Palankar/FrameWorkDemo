package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentRegister 
{
//It is a Register Program
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Pooja");
		driver.findElement(By.name("lastname")).sendKeys("Desai");
		
		WebElement mobEmail = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		mobEmail.sendKeys("8095951436");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Nirmala@1996");
		
		WebElement DayList = driver.findElement(By.id("day"));
		Select select = new Select(DayList);
		select.selectByVisibleText("12");
		
		WebElement MonthList = driver.findElement(By.id("month"));
        Select select1 = new Select(MonthList);
        select1.selectByVisibleText("Jun");
        
        WebElement yearList = driver.findElement(By.id("year"));
        Select select2 = new Select(yearList);
        select2.selectByVisibleText("1996");
		
       WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
		radio.click();
       
		driver.findElement(By.name("websubmit")).click();
		
		

	}

}
