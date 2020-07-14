package javaActivity4_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity4_3 {
	private static String fileName="C:\\Users\\RakhiMaheshwari\\Documents\\SDET_Trainning_Session\\resources\\ExcelTest.xlsx";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			XSSFWorkbook workBook = new XSSFWorkbook();
			XSSFSheet sheet = workBook.createSheet("Datatypes in java");
			
			Object[][] datatypes = {
				    {"Datatype", "Type", "Size(in bytes)"},
				    {"int", "Primitive", 2},
				    {"float", "Primitive", 4},
				    {"double", "Primitive", 8},
				    {"char", "Primitive", 1},
				    {"String", "Non-Primitive", "No fixed size"}
				};
			
			int rownum=0;
			
			for(Object[] dataType: datatypes) {
				Row row = sheet.createRow(rownum++);
				int colNum=0;
				for(Object field:dataType) {
					Cell cell = row.createCell(colNum++);
					if(field instanceof String) {
						cell.setCellValue((String)field);
					}else if(field instanceof Integer) {
						cell.setCellValue((Integer)field);
					}
				}
			}
			
			FileOutputStream outputStream = new FileOutputStream(fileName);
			workBook.write(outputStream);
			workBook.close();
		}catch(FileNotFoundException io) {
			io.getMessage();
		}catch(IOException fileEx) {
			fileEx.getMessage();
		}
		
		
		

	}

}
