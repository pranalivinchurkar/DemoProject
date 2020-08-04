package Org.qsp.TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataExcelDemo {
	@Test(dataProviderClass = ReadDataDemo.class,dataProvider = "getData")
   public void m1(String un, String pw){
		Reporter.log(un + " " + pw, true);
	}
}
