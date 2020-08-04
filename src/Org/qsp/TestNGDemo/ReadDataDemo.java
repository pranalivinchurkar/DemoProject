package Org.qsp.TestNGDemo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataDemo {
	@DataProvider
	 public  String[][] getData() throws Exception{
      String st[][] ;
      FileInputStream fis = new FileInputStream(".\\Data\\Data.xlsx");
      Workbook W = WorkbookFactory.create(fis);
		Sheet sh = W.getSheet("Sheet1");
		st = new String[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		
		for (int i = 1; i < sh.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {
				st[i-1][j] = sh.getRow(i).getCell(j).toString();
				
			}
				
			}
		return st;
		}
	@Test(dataProviderClass = ReadDataDemo.class,dataProvider = "getData")
	   public void m1(String un, String pw){
			Reporter.log(un + " " + pw, true);
		}
}

