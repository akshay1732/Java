package com.Java.advanced;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


public class Filecompare {
	
	
	
	

	public static void main(String[] args) throws IOException{


		String commonpath = "D:\\EclipseWorkspace\\JavaProject\\src\\com\\Java\\advanced\\";
		String path1 = commonpath+"InputFile.txt";
		String path2 = commonpath+"InputFile2.txt";
		Compare(path1,path2,"LastName","City","FirstName");
		
		
			
}//End of main
	
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



	public static List<Map<String,String>>  ConverttexttoExcel(String path) throws IOException {
	
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
	
		List <Map<String,String>> values = new ArrayList<Map<String,String>>();
		for (int c=1;c<=rowcount;c++)
		{
			String[] rowdatavalues =  rowdata[c].split("\t");
			
			Map<String, String> map = IntStream.range(0, Columnheader.length).boxed()
				    .collect(Collectors.toMap(i -> Columnheader[i], i -> rowdatavalues[i]));
			values.add(map);	
		}	
		
		System.out.println(values.get(0).get(Columnheader[2]));
		return values;
		
		
}//end of functiom

	
	
	
	public static String Compare(String path1,String path2, String ...keyval) throws IOException {
		String result = "Fail";
	
		
	List<Map<String,String>> table1 = ConverttexttoExcel(path1);
	List <Map<String,String>>table2 = ConverttexttoExcel(path2);
	int rowcount1 = table1.size();
	int rowcount2 = table2.size();
	
	
	//to create report Excel with Headers
	Workbook report = new XSSFWorkbook();
	Sheet resultsheet=report.createSheet("Result"); 

	//find column no 
	int numberofkeys = keyval.length;
	Row row = resultsheet.createRow(0);	
	for (int k=0;k<numberofkeys;k++) {
		int currentcolumn=2*k;
		Cell col1 = row.createCell(currentcolumn);
		Cell col2 = row.createCell(currentcolumn+1);
		col1.setCellValue(keyval[k]);
		col2.setCellValue(keyval[k]);
	}
	Cell col3 = row.createCell(2*numberofkeys);
	col3.setCellValue("Result");
	
	
	
	//comparison
	boolean mainflag = true;
	boolean subflag = true;
	
	//start of outer  loop
	for (int a=0;a<rowcount1;a++) {
																
		String[] cellval1 = new String[numberofkeys];
		for(int x=0;x<numberofkeys;x++) {
			
			 cellval1[x] =table1.get(a).get(keyval[x]);
			
		}
		
		
		//start of inner loop file2
		Row resultrow1= resultsheet.createRow(a+1);
		for(int c=0;c<rowcount2;c++) {
			String [] cellval2=new String[numberofkeys];
			for(int y=0;y<numberofkeys;y++) {
				cellval2[y] =table2.get(c).get(keyval[y]);
				 
			}
			
			
			//comparison of one row
			subflag = false;
			
			for(int col=0;col<cellval1.length;col++) {
				
				 int currentcolumn=2*col;
				Cell col1 = resultrow1.createCell(currentcolumn);
				Cell col2 = resultrow1.createCell(currentcolumn+1);
					
				col1.setCellValue(cellval1[col]);
				col2.setCellValue(cellval2[col]);
					
				//System.out.println(cellval1[col]+" "+cellval2[col]);
				if(cellval1[col].equals(cellval2[col])) {		
					subflag=true;
				
				}
				else {
						subflag=false;
						break;
					}
		
				}//end of single row comparison loop in 2nd sheet
			
			if(subflag) {
				Cell resultcell = resultrow1.createCell(keyval.length*2);
				resultcell.setCellValue("Pass");	
				break;	
			}
			else {
				continue;
			}
			
			}//End of inner loop	
		
	
		if(!subflag) {
			mainflag = false;
			Cell resultcell = resultrow1.createCell(keyval.length*2);
			resultcell.setCellValue("Fail");	
			}
	}//end of outer loop
		
	if(mainflag) {
		System.out.println("\nPass: All values Match");		 
	}
	else {
		System.out.println("\nFail: All values dont Match");
		
	}
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
	createExcel(report,"D:\\EclipseWorkspace\\JavaProject\\Excel","Report"+timeStamp+".xlsx");
	return result;

}


	
	
	
	
	
	}
