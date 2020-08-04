package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test(priority=2)
	public void m1(){
		Reporter.log("Hii...1", true);
	}
	@Test(priority=0,invocationCount = 3)
	public void m2(){
		Reporter.log("Hii...2", true);
	}
	@Test(priority= -5)
	public void m3(){
		Reporter.log("Hiii...3", true);
		
	}
}
	
