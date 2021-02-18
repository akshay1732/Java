package com.Selenium.rough;

import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poiwritemethods {

	public static void main(String[] args) throws IOException {
		
		
		Workbook workbook = new XSSFWorkbook();
		
		//DataMaps
		
		Map<String, String> data01 = new LinkedHashMap<String, String>();
		Map<String, String> data02 = new LinkedHashMap<String, String>();
		Map<String, String> data03 = new LinkedHashMap<String, String>();
		Map<String, String> data04 = new LinkedHashMap<String, String>();
		Map<String, String> data05 = new LinkedHashMap<String, String>();
		Map<String, String> data06 = new LinkedHashMap<String, String>();
		
		
		data01.put("Name", "Akshay");
		data01.put("City", "Pune");
		data01.put("PinCode","411046");
		data01.put("Marks","100");
		
		data02.put("Name", "Rohan");
		data02.put("City", "Mumbai");
		data02.put("PinCode","411356");
		data02.put("Marks","640");
		
		data03.put("Name", "Alex");
		data03.put("City", "Delhi");
		data03.put("PinCode","781856");
		data03.put("Marks","110");
		
		data04.put("Name", "Kristen");
		data04.put("City", "NYC");
		data04.put("PinCode","316455");
		data04.put("Marks","154");
		
		data05.put("Name", "Jacob");
		data05.put("City", "Tokyo");
		data05.put("PinCode","651856");
		data05.put("Marks","440");
		
		data06.put("Name", "Austen");
		data06.put("City", "Sydney");
		data06.put("PinCode","988856");
		data06.put("Marks","85");
		
		
		//List of Data Maps
		@SuppressWarnings("rawtypes")
		List <Map> listofmaps = new ArrayList <Map>();
		listofmaps.add(data01);
		listofmaps.add(data02);
		listofmaps.add(data03);
		listofmaps.add(data04);
		listofmaps.add(data05);
		listofmaps.add(data06);
		
		
		
		//List of Column Names
		List<String> colnames = new ArrayList<String>();	
		colnames.add("Name");
		colnames.add("City");
		colnames.add("PinCode");
		colnames.add("Marks");
		
		
		Sheet sheet = workbook.createSheet("MyData");
		
		//Create Column Header Row
		
		
		Row Headerrow = sheet.createRow(0);
		for(int i=0;i<colnames.size();i++) {
		  
		  Cell cell = Headerrow.createCell(i);
		  
		  CellStyle style = workbook.createCellStyle();
		  Font font = workbook.createFont();
		  font.setBold(true);
		  style.setFont(font);
		  cell.setCellStyle(style);
		  cell.setCellValue(colnames.get(i));
		  
		  }
		  
		  
		  
		for(int i=1;i<=listofmaps.size();i++) {
		
		Row row = sheet.createRow(i);
		
		  for(int j=0;j<listofmaps.get(j).size();j++) {
			  
			 String colname= Headerrow.getCell(j).getStringCellValue();
			 
			 Cell cell = row.createCell(j);
			 
			//System.out.println(Headerrow.getLastCellNum()); 
			String value = (String) listofmaps.get(i-1).get(colname);
			cell.setCellValue(value);    
		  }
		  
		} 
		
		
		createExcel(workbook,"D:\\EclipseWorkspace\\JavaProject\\Excel","Myfile.xlsx");
		 

	}

	
	public static void createExcel(Workbook workbook,String path,String Filename) throws IOException {
		
		
		File file = new File(path+"\\"+Filename);
		if (!(file.exists())) {
		file.createNewFile();
		
		}
		OutputStream fout = new FileOutputStream(file);
		workbook.write(fout);
		fout.close();
		workbook.close();
	}
	
	public static void adddata() {
		
		
		
	}
}
