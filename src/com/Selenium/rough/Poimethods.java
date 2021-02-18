package com.Selenium.rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poimethods {
	
	static Workbook workbook;
	

	public static void main(String[] args) throws IOException {
		
		
		String path = "D:\\EclipseWorkspace\\JavaProject\\Excel\\Myfile.xlsx";
		workbook = getWorkbook(path);
		
		
		
		//Getting data Rowwise
		List <String> mylist = getrowwisedata("MyData",1);
		for (String a :mylist) 
		{
			System.out.println(a);
		}	
		System.out.println("");
			
		
		//Getting data Columnwise
		
		List<String> newlist = getcolumnwisedata("MyData",1);
		
		ListIterator<String> itr = newlist.listIterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
			
		//getting column name and value pairs for row
		System.out.println("");
		Map <String,String> map = getrowmap("MyData",3);
		System.out.println(map);
		
		
	}
	
	
//************************Methods*********************************//	
	
	public static Workbook getWorkbook(String path) throws IOException 
	{
		File file = new File(path);
		FileInputStream ip = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(ip);
		return workbook;	
	}
	
	public static Sheet getsheet(String sheetname)
	{
		Sheet sheet = workbook.getSheet(sheetname);
		return sheet;
	}
	
	
	public static List<String> getrowwisedata(String sheetname, Object row)
	{
		
		Sheet sheet=workbook.getSheet(sheetname);
		
		int rownum=-1;
		String sval = row.getClass().getSimpleName();
		
		if (sval.equals("Integer")) 
		{
				rownum = (int) row;
		}
		else 
		{
			for (int i = 0;i<sheet.getLastRowNum();i++) 
			{
				
				String val = sheet.getRow(i).getCell(0).getStringCellValue();

				if (val.equalsIgnoreCase((String)row)) 
				{	
					rownum = i;	
				}
				
			}
		}
		
		List<String> list = new ArrayList<String>();
		for(int i = 0;i<sheet.getRow(rownum).getLastCellNum();i++) 
		{
			
			//String value = sheetname.getRow(rownum).getCell(i).getStringCellValue();
			DataFormatter formatter = new DataFormatter();
			String value = formatter.formatCellValue(sheet.getRow(rownum).getCell(i));
			list.add(value);
		}
		
		//using Iterator 
		/*
		 * List<String> newlist = new ArrayList<String>(); 
		 * Iterator <Cell> celliterator = sheetname.getRow(rownum).iterator(); 
		 * while(celliterator.hasNext()) 
		 * { 
		 * DataFormatter formatter = new DataFormatter(); 
		 * String value = formatter.formatCellValue(celliterator.next());
		 * newlist.add(value); 
		 *}
		 */
		return list;
	}
	
	
	
	public static List <String> getcolumnwisedata(String sheetname, Object col)
	
	{
		Sheet sheet=workbook.getSheet(sheetname);
		int colnum = -1;
		String val = col.getClass().getSimpleName();
		
		if (val.equals("Integer")) 
		{
			colnum = (int) col ;
		}
		
		else 
		{	
			for(int i=0 ; i<sheet.getRow(0).getLastCellNum() ; i++) 
			{
				String value = sheet.getRow(0).getCell(i).getStringCellValue();
				if (value.equals((String)col)) 
				{
					colnum = i;
				}	
			}
		}	
			
		
		Iterator <Row> rowiterator = sheet.rowIterator();
		rowiterator.next();
		List <String> list = new ArrayList<String>();
			
		while(rowiterator.hasNext()) 
		{	
			DataFormatter dataformatter = new DataFormatter();
			String value = dataformatter.formatCellValue(rowiterator.next().getCell(colnum));
			list.add(value);
		}
			
		return list;
		
	}
	
	
	
	public static Map<String,String> getrowmap(String sheetname, Object row)
	
	{
		List <String> columnames = getrowwisedata(sheetname,0);
		
		List <String> columnvalues = getrowwisedata(sheetname,row);
		Map <String,String> map = new LinkedHashMap<String,String>();
		
		
		ListIterator <String> itr1 = columnames.listIterator();
		ListIterator <String> itr2 = columnvalues.listIterator();
		while(itr1.hasNext() && itr2.hasNext()) 
			
		{	
		map.put(itr1.next(), itr2.next());
		}

		return map;
		 
		
	}

}
