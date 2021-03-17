package Demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
 static WebDriver driver;
	public static void main(String []args)	
	{
		System.setProperty("webdriver.chrome.driver", "H:\\practiceworkspace\\DemoProject\\src\\utilities\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://github.com/thripura939/Demo.git");
		System.out.println("execution successful");
		
	}
}
