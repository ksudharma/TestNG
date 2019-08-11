package DemoTestNg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Demo4 {
	WebDriver driver;


	@Before
	public void Bf(){
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\Jar files\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

			
	}
	@Test
	public void test(){
		System.out.println("This is my test method");

	}
	
	@After
	public void after() {
		driver.close();
		System.out.println("This is after the method");
}
}