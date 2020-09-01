package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelLibrary {
	XSSFSheet sheet1;
	XSSFWorkbook book1;
	
	public ReadExcelLibrary(String filePath) {
		
		try {
			File exf = new File(filePath);
			FileInputStream exBook = new FileInputStream(exf);
			book1 = new XSSFWorkbook(exBook);
		}   catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String pullData(int shNum, int rNum, int cNum) {
		sheet1 = book1.getSheetAt(shNum);
		String output = sheet1.getRow(rNum).getCell(cNum).getStringCellValue();
		return output;
	}
	
	public int pullRow(int shAt) {
		int rNum = book1.getSheetAt(shAt).getLastRowNum();
		rNum = rNum +1;
		return rNum;
	}
	

}
