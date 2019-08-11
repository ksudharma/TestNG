package DemoTestNg;

import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo9 {
	WebDriver driver;
	
	@BeforeTest
	public void bt() {
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\Jar files\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		driver = new FirefoxDriver();	
		driver.get("https://www.google.com");
		driver.manage().window().maximize();		
	}
	
	@Test(groups={"smoke"},priority=2)
	public void testcase1() {
		System.out.println("This is my first");
	}
	
	@Test(groups={"smoke"},priority=1)
	public void testcase2() {
		System.out.println("This is my second");
	}

	@Test(groups={"regression"})
	public void testcase3() {
		System.out.println("This is my third");
	}
	
	@AfterTest
		public void AF(){
			driver.close();
		}
	}



