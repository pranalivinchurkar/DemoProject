package Org.qsp.TestNGDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Demo4IP {
	 @Test(dependsOnMethods = "m4")
	    public void m1(){
	    	System.out.println("Hii1");
	    }
	    
	    @Test
	    public void m2(){
	    	System.out.println("Hii2");
	    	Assert.fail();
	    	System.out.println("hdggdhbfb");
	    }
	    
	    @Test
	    public void m3(){
	    	System.out.println("Hiii3");
	    }
	    
	}


}
