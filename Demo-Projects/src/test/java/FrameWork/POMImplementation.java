package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;

public class POMImplementation {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties.txt");
		
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		String USENAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
driver.get(URL);
//driver.findElement(By.id("user-name")).sendKeys(USENAME);
//driver.findElement(By.id("password")).sendKeys(PASSWORD);
//driver.findElement(By.id("login-button")).click();

//LoginPage login = new LoginPage(driver);
//login.getUserTextField().sendKeys(USENAME);
//login.getPasswordTextField().sendKeys(PASSWORD);
//login.getLoginButton().click();

//implementated using Business Logic
		LoginPage login = new LoginPage(driver);
		login.loginToApplication(USENAME, PASSWORD);
		

	}

}
