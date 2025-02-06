package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenShotEx 

{
	@Test
	
	public void screenshootEx() throws Throwable
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	TakesScreenshot screen = (TakesScreenshot)driver;
	
	File src = screen.getScreenshotAs(OutputType.FILE);
	File dest = new File("./FailedScript.png");
	
	FileUtils.copyFile(src, dest);

	
	
	}
	
	
}
