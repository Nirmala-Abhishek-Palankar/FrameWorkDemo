package DemoSeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.co.in/");

		//svg:- Scalar vector graphics
		//*[name()='svg' and @AttributeName='AttributeValue']
		driver.findElement(By.xpath("//*[name()='svg' and @class=\"A_8a-icon\"]")).click();

	}

}
