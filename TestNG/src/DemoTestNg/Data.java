package DemoTestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class Data {

	WebDriver driver;
	@Test(dataProvider = "dp")
	public void f(String n, String s) throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys(n);
		driver.findElement(By.id("txtPassword")).sendKeys(s);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);	 
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul[1]/li[3]/a")).click();
		Thread.sleep(3000);

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "Admin", "admin123" },
			new Object[] { "linda.anderson", "linda.anderson" },
		};
	}


	@BeforeTest
	public void bt(){
		System.setProperty("webdriver.gecko.driver", "C:\\AT&T Project\\Selenium Automation Training\\Jar files\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
		driver = new FirefoxDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/ ");
		driver.manage().window().maximize();		
	}

	@AfterTest
	public void at(){
		driver.close();

	}
}
