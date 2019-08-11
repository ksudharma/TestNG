package DemoTestNg;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Demo8 {
	
	@Test
	public void Z() {
		String exp="sunil";
		String act="sunil";
		Assert.assertEquals(exp, act);
	}
	
	@Test
	public void B() {
		String exp="sunil";
		String act="su";
		Assert.assertEquals(exp, act);
	}
	
	@Test(dependsOnMethods="B")
	public void C() {
		String exp="sunil";
		String act="sunil";
		Assert.assertEquals(exp, act);
	}
	
	@Test
	public void A() {
		String exp="sunil";
		String act="sunil";
		Assert.assertEquals(exp, act);
	}
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




