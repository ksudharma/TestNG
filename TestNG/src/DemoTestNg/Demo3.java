package DemoTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Demo3 {
	//i am making webdriver public so that can be used in all methods  
	WebDriver driver;

	@Test
	public void f() {
		String expectedTitle=driver.getTitle();
		String actualTitle= "Google";
		//using assert
		Assert.assertEquals(actualTitle,expectedTitle);
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\Jar files\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		driver = new FirefoxDriver();	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
		driver.close();

	}

}
