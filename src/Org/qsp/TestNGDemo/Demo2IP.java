package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2IP {
    @Test(dependsOnMethods = { "m2","m3"})
    public void m1(){
    	Reporter.log("Hiii1");
    }
    
    @Test()
    public void m2(){
    	Reporter.log("Hiii2");
    }
    
    @Test
    public void m3(){
    	System.out.println("Hiii3");
    }
    
}
