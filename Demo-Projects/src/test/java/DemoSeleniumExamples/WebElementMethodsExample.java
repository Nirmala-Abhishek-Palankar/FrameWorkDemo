package DemoSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethodsExample {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.saucedemo.com/v1/");
		
		//method1--sendkeys()
		WebElement UserName = driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		
		//method2--clear()
		Thread.sleep(2000);
		UserName.clear();
		
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//method3-- click()
		driver.findElement(By.id("login-button")).click();*/
		
		//driver.get("https://www.amazon.in/");
		
		//method4--getCssValue()
		/* WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		 System.out.println(ele.getCssValue("color"));
		 
		 WebElement eles = driver.findElement(By.id("nav-logo-sprites"));
		 System.out.println(eles.getCssValue("color"));
		 System.out.println(eles.getCssValue("font-size")); */
		
		//method5--getLocation()
		//WebElement Phone = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		//System.out.println(Phone.getLocation().getX());
		//System.out.println(Phone.getLocation().getY());
		
		//method6-getSize()
	//	WebElement Search = driver.findElement(By.name("field-keywords"));
		//System.out.println(Search.getSize().getHeight());
		//System.out.println(Search.getSize().getWidth());
		
	/*	WebElement Phone = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println(Phone.getRect().getX());
		System.out.println(Phone.getRect().getY());
		System.out.println(Phone.getRect().getHeight());
		System.out.println(Phone.getRect().getWidth());*/
		 
		
	/*	WebElement link = driver.findElement(By.linkText("Amazon miniTV"));
		if(link.isDisplayed())
		{
			System.out.println("Element is displyed ");
		}
		else {
			System.out.println("Element is not displyed ");
			}
		
		
		WebElement search = driver.findElement(By.name("field-keywords"));
		if (search.isEnabled()) {
			search.sendKeys("Nike");
			}
		else {
			System.out.println("Element is not enabled");
		}
		*/
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
		radio.click();
		
		if (radio.isSelected()) 
		{
			System.out.println("Radio is selected ");
		}
		else 
		{
			System.out.println("Radio is not seleted");
		}*/
		
		//method-11
		//driver.get("https://www.flipkart.com/");
		
		/*WebElement searchBar = driver.findElement(By.name("q"));
		System.out.println(searchBar.getAttribute("class"));
		System.out.println(searchBar.getDomAttribute("placeholder"));
		System.out.println(searchBar.getDomProperty("offsetHeight"));*/
		
		/*WebElement logo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		System.out.println(logo.getAttribute("src"));
		System.out.println(logo.getAttribute("fecthPriority")); */
		
	/*	WebElement searchBar = driver.findElement(By.name("q"));
		System.out.println(searchBar.getTagName());
		*/
		driver.get("https://www.amazon.in/");
		
		/*WebElement ele = driver.findElement(By.cssSelector("[data-csa-c-slot-id=\"nav_cs_3\"]"));
		//System.out.println(ele.getAccessibleName());
		System.out.println(ele.getAriaRole());
		
		WebElement value = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		System.out.println(value.getAriaRole());*/
		
		
		//WebElement logoAmazon = driver.findElement(By.id("nav-logo-sprites"));
		//System.out.println(logoAmazon.getAccessibleName());
		
		//WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		//search.sendKeys("bluetooth");
		//search.submit();
		
		String price = driver.findElement(By.xpath("//span[text()='791']")).getText();
		System.out.println(price);
		
		}
	}
