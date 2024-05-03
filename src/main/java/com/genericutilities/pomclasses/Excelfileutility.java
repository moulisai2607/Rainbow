package com.genericutilities.pomclasses;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfileutility {
	public String readDataFromExcel(String SheetName,int rowNum,int CellNum)throws Throwable{
		FileInputStream fisp=new FileInputStream("");
		Workbook wb=WorkbookFactory.create(fisp);
		return wb.getSheet(SheetName).getRow(rowNum).getCell(CellNum).getStringCellValue();
	}
	}


