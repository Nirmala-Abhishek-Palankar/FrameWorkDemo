package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//	driver.get("https://the-internet.herokuapp.com/basic_auth");

		//syntax:- https://username:password@URL
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	
	}

}
