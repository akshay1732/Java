package com.Java.advanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Filecomparefunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static Workbook ConverttexttoExcel(String path) throws IOException {
		
		File file = new File(path);
	
	
	
			FileReader fin = new FileReader(file);
	
			int r = fin.read();
	
			
			StringBuilder str = new StringBuilder();
			while(r!=-1) {	
				str= str.append((char)r);
				r = fin.read();
			}
			System.out.println("File read complete");
			
			//System.out.println(str.toString());
			String[] rowdata = str.toString().split("\r?\n");
		
			//System.out.println(inputrowdata1[0]);
			String[] Columnheader = rowdata[0].split("\t");
			
			int rowcount  = rowdata.length-1;
	
			int columncount = Columnheader.length;		
			
			System.out.println("No. of Rows: "+rowcount);	
			System.out.println("No. of Columns: "+columncount);
		
			
			
			List <List<String>> values = new ArrayList<List<String>>();
	
			for (int i=0;i<=rowcount;i++) {
				
				String[] rowdatavalues =  rowdata[i].split("\t");
				List<String> l = Arrays.asList(rowdatavalues);
				values.add(l);
				
			}
			
			Workbook workbook = new XSSFWorkbook();
			
			Sheet sheet = workbook.createSheet("Input1");

				
			
			for (int a=0;a<=rowcount;a++) {
		
				Row row = sheet.createRow(a);
				
				for(int b=0;b<columncount;b++) 
					{
					Cell cell = row.createCell(b);
					cell.setCellValue(values.get(a).get(b));    
					}
			}
			 
			return workbook;
					
	}

}
