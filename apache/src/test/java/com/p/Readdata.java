package com.p;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static void main(String[] args) throws IOException {

		File file =new File("./testdata/logindata.xlsx");
		FileInputStream input=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet sheet=wb.getSheetAt(0);
		for (int i= 0; i <=3; i++) {
			XSSFRow row = sheet.getRow(i);

			for(int j=0;j<=1;j++) {
				XSSFCell cell = row.getCell(0);
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		} 
	}

}



