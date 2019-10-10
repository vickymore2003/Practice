package scripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.Current;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/resources/Excel/Test.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Adress");

		Iterator<Row> it = sheet.iterator();
		while (it.hasNext()) {
			Row row = it.next();
			Iterator<Cell> cell = row.iterator();
			while (cell.hasNext()) {
				Cell currentCell = cell.next();
				switch (currentCell.getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(currentCell.getNumericCellValue()+"\t");
					break;

				case Cell.CELL_TYPE_STRING:
					System.out.print(currentCell.getStringCellValue()+"\t");
					break;
					
				}
			}	System.out.println("");
			
		}
	}
}