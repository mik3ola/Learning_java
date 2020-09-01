package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File exf = new File("C:\\Users\\MIK3\\eclipse-workspace\\LoginData.xlsx");
		FileInputStream exBook = new FileInputStream(exf);
		XSSFWorkbook book1 = new XSSFWorkbook(exBook);
		XSSFSheet sheet1 = book1.getSheetAt(0);
		
		int rData = sheet1.getLastRowNum();
		for (int x=0; x<=rData; x++) {
		String output = sheet1.getRow(x).getCell(0).getStringCellValue();
		System.out.println(output);
		}
		
		
			
		
	}

}
