package DemoTestNg;

import org.testng.annotations.Test;

public class Demo7 {
	@Test(priority=4)
	public void Z() {
		System.out.println("1");
	}
	
	@Test(priority=2)
	public void B() {
		System.out.println("2");
	}
	
	@Test(priority=3)
	public void C() {
		System.out.println("3");
	}
	
	@Test(priority=1)
	public void A() {
		System.out.println("4");
	}
	
	@Test
	public void X() {
		System.out.println("5");
	}
	
	@Test
	public void D() {
		System.out.println("6");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


