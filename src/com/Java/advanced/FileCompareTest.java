package com.Java.advanced;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileCompareTest {

	public static void main(String[] args) throws IOException {
		String commonpath = "D:\\EclipseWorkspace\\JavaProject\\src\\com\\Java\\advanced\\";
		
		Compare(commonpath+"InputFile.txt",commonpath+"InputFile3.txt","City","FirstName","LastName");

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
		fin.close(); 
		
		String[] rowdata = str.toString().split("\r?\n");
		String[] Columnheader = rowdata[0].split("\t");
		
		int rowcount  = rowdata.length-1;
		int columncount = Columnheader.length;		
		
		System.out.println("No. of Rows: "+rowcount);	
		System.out.println("No. of Columns: "+columncount);
	
	//	Map<Integer, Map<String,String>> table = new HashMap<Integer, Map<String,String>>();
		
		
		List <Map<String,String>> values = new ArrayList<Map<String,String>>();
		for (int c=0;c<=rowcount;c++)
		{
			String[] rowdatavalues =  rowdata[c].split("\t");
			
			Map<String, String> map = IntStream.range(0, Columnheader.length).boxed()
				    .collect(Collectors.toMap(i -> Columnheader[i], i -> rowdatavalues[i]));
			values.add(map);	
		}
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Input1");
		for (int a=0;a<=rowcount;a++) 
		{
			Row row = sheet.createRow(a);
			for(int b=0;b<columncount;b++) 
				{
				Cell cell = row.createCell(b);
				cell.setCellValue(values.get(a).get(Columnheader[b]));    
				}
		} 	
		return workbook;			
}//end of functiom

	
	
	
	public static String Compare(String path1,String path2, String ...keyval) throws IOException {
		String result = null;
	Workbook workbook1 = ConverttexttoExcel(path1);
	Workbook workbook2 = ConverttexttoExcel(path2);
	createExcel(workbook1,"D:\\EclipseWorkspace\\JavaProject\\Excel","Inputfile1.xlsx");
	createExcel(workbook2,"D:\\EclipseWorkspace\\JavaProject\\Excel","Inputfile2.xlsx");
	

	Sheet sheet1 = workbook1.getSheetAt(0);
	int rowcount1 = sheet1.getLastRowNum();
	Sheet sheet2 = workbook2.getSheetAt(0);
	int rowcount2 = sheet2.getLastRowNum();
	
	
	//to create report Excel with Headers
	Workbook report = new XSSFWorkbook();
	Sheet resultsheet=report.createSheet("Result"); 


	
	//find column no 
	int numberofkeys = keyval.length;
	int[] keys1 =new int[numberofkeys];
	int[] keys2 =new int[numberofkeys];
	
	
	for (int k=0;k<numberofkeys;k++) {
	 keys1[k] = getcolumn_num(sheet1,keyval[k]);
	 keys2[k] = getcolumn_num(sheet2,keyval[k]);
	}
	//comparison
	Row row = resultsheet.createRow(0);
	for(int p=0;p<numberofkeys;p++)
	{
	
	
	boolean mainflag = true;
	boolean flag = false;
	int currentcolumn = p*5;
	
	
	Cell col1 = row.createCell(currentcolumn);
	Cell col2 = row.createCell(currentcolumn+1);
	Cell col3 = row.createCell(currentcolumn+2);
	Cell col4 = row.createCell(currentcolumn+3);
	Cell col5 = row.createCell(currentcolumn+4);
	
	
	col1.setCellValue("Value1");
	col2.setCellValue("Row_No");
	col3.setCellValue("Value2");
	col4.setCellValue("Row_No.");
	col5.setCellValue("Result");
			
	//start of outer  loop
	for (int a=1;a<=rowcount1;a++) {
		
		Row row1 = sheet1.getRow(a);
		Cell cell1 = row1.getCell(keys1[p]);
		String cellval1 =   cell1.getStringCellValue();
		flag=false;
		//start of inner loop file2
	
		for(int c=1;c<=rowcount2;c++) {
			
			Row row2 = sheet2.getRow(c);
			Cell cell2 = row2.getCell(keys2[p]);
			String cellval2=   cell2.getStringCellValue();
			
			if(cellval1.equals(cellval2)) {
				//System.out.println("File1 Row: "+a+" Value: "+cellval1+"\nFile2 Row: "+c+" Value: "+cellval2);
				 Row resultrow1;
				if (p==0) {
					 resultrow1= resultsheet.createRow(a);
					}
				resultrow1 = resultsheet.getRow(a);
				col1 = resultrow1.createCell(currentcolumn);
				col2 = resultrow1.createCell(currentcolumn+1);
				col3 = resultrow1.createCell(currentcolumn+2);
				col4 = resultrow1.createCell(currentcolumn+3);
				col5 = resultrow1.createCell(currentcolumn+4);
				col1.setCellValue(cellval1);
				col2.setCellValue("Row: "+a);
				col3.setCellValue(cellval2);
				col4.setCellValue("Row: "+c);
				col5.setCellValue("Pass");
				
				flag=true;
				break;
			}	
		}//End of inner loop	
		if(!flag) {
			//System.out.println("File1 Row: "+a+" Value: "+cellval1+" Not Found in File2");
			mainflag = false;
			Row resultrow1;
			if (p==0) {
				 resultrow1= resultsheet.createRow(a);
				}
			resultrow1 = resultsheet.getRow(a);
			col1 = resultrow1.createCell(currentcolumn);
			col2 = resultrow1.createCell(currentcolumn+1);
			col3 = resultrow1.createCell(currentcolumn+2);
			col4 = resultrow1.createCell(currentcolumn+3);
			col5 = resultrow1.createCell(currentcolumn+4);
			col1.setCellValue(cellval1);
			col2.setCellValue("Row: "+a);
			col3.setCellValue("Value Not Found in File2: ");
			col5.setCellValue("Fail");
		}			
	}//End of outer loop
	
	if(mainflag) {
		System.out.println("\nPass: All values Match for"+keyval[p]);
		 
	}
	else {
		System.out.println("\nFail: All values dont Match"+keyval[p]);
		
	}
	
	}//end of keys loop
	createExcel(report,"D:\\EclipseWorkspace\\JavaProject\\Excel","Report.xlsx");
	
	return result;

}


	
	public static int getcolumn_num(Sheet sheet,String columm_name) {
		int column_num = -1;
		for(int col=0;col<sheet.getRow(0).getLastCellNum();col++) 
		{
			String s = sheet.getRow(0).getCell(col).getStringCellValue();
			if(s.equals(columm_name)) 
			{
				column_num = col;
				break;
			}
			else
			{
				//System.out.println("Key not Found in file");
			}
		}//end of loop
		return column_num;
		}//end of function
	
	
	
}
