package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@ Test(groups ="functional" )
	public void m1(){
		Reporter.log("Hii...1", true);
	}
	@Test(groups = "intigration",dependsOnGroups = "functional")
	public void m2(){
		Reporter.log("Hii...2", true);
	}
	@Test(groups = "functional")
	public void m3(){
		Reporter.log("Hiii...3", true);
	}
	@Test(groups = "intigration",dependsOnGroups = {"functional","unit"})
	public void m4(){
		Reporter.log("Hii...4", true);
	}
	@Test(groups = "functional")
	public void m5(){
		Reporter.log("Hiii...5", true);
	}
	@Test(groups = "unit")
	public void m6(){
		Reporter.log("Hiii...6", true);
	
	}
		

}
