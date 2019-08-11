package DemoTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Demo2 {
  @Test
  public void f1() {
	  System.out.println("This test method Belongs to 2nd class");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is my second @before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is my second @after class");
  }
  
  @AfterTest
  public void at() {
	  System.out.println("After test code");
	  
  }
  
  @AfterSuite
  public void as() {
	  System.out.println("After suite code");
  }

}
