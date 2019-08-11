package DemoTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo1 {
	
	@BeforeSuite
	public void bs() {
		System.out.println("This will execute before @beforeTest");
	}
	
	@BeforeTest
	public void bt(){
		System.out.println("This works for entire testsuite, before class");
		
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is my first @before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before every method");
	}

	@Test
	public void f() {
		System.out.println("This is a method");
	}
	
	@Test
	public void g() {
		System.out.println("This is a method1");
	}


	@AfterMethod
	public void afterMethod() {
		System.out.println("This will execute after every method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is my first @after class");
	}

}
