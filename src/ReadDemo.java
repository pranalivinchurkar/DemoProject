import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDemo {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException,IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Archana\\Desktop\\Data.xlsx");
		Workbook W = WorkbookFactory.create(fis);
		Sheet sh = W.getSheet("Sheet1");
		Row firstRow = sh.getRow(0);
		int rowCount = sh.getPhysicalNumberOfRows();
		for (int i = 0; i < rowCount; i++) {
		
		for (int j = 0; j < firstRow.getFirstCellNum(); j++) {
			Cell cl = sh.getRow(i).getCell(j);
			System.out.println(cl);
			
		}
		}
		
	}
}