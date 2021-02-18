package com.Java.advanced;



	import java.io.*;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
	import java.util.Map;
	import java.util.stream.Collectors;
	import java.util.stream.IntStream;

	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.*;


	public class Comparator {	
		
		
		public static void main(String[] args) throws IOException{


			String commonpath = "D:\\EclipseWorkspace\\JavaProject\\src\\com\\Java\\advanced\\";
			String path1 = commonpath+"InputFile.txt";
			String path2 = commonpath+"InputFile2.txt";
			Compare(path1,path2,"FirstName,LastName","FirstName,City");
			
			
				
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

		
		
		
		public static String Compare(String path1,String path2, String ...keys) throws IOException {
			
			
		String result = "Failed";	
		Workbook masterreport = new XSSFWorkbook();
		Sheet mainresultsheet=masterreport.createSheet("Summmary"); 
		Sheet mismatchsheet=masterreport.createSheet("Mismatch details");
		Row header = mainresultsheet.createRow(0);
		Row mismatchheader = mismatchsheet.createRow(0);
		header.createCell(0).setCellValue("Key");
		header.createCell(1).setCellValue("Result");
		header.createCell(2).setCellValue("Reason");
		header.createCell(3).setCellValue("Comment");
		
		mismatchheader.createCell(0).setCellValue("Key");
		mismatchheader.createCell(1).setCellValue("ColumnName");
		mismatchheader.createCell(2).setCellValue("File1 value");
		mismatchheader.createCell(3).setCellValue("File2 value");
		
		
		for(int z=0;z<keys.length;z++) {
			Row keyresultrow = mainresultsheet.createRow(z+1);
			keyresultrow.createCell(0).setCellValue(keys[z]);
			Map<String,String> failedcols1 = new HashMap<String,String>();
			Map<String,String> failedcols2= new HashMap<String,String>();	
	
			
			String[] keyval = keys[z].split(",");
				
			
		
			
		List<Map<String,String>> table1 = ConverttexttoExcel(path1);
		List <Map<String,String>>table2 = ConverttexttoExcel(path2);
		int rowcount1 = table1.size();
		int rowcount2 = table2.size();
		
		
	
		//find column no 
		int numberofkeys = keyval.length;
		
		 
		//comparison
		boolean mainflag = true;
		boolean subflag = true;
		
		//start of outer  loop
		for (int a=0;a<rowcount1;a++) {
																	
			String[] cellval1 = new String[numberofkeys];
			for(int x=0;x<numberofkeys;x++) {
				
				 cellval1[x] =table1.get(a).get(keyval[x]);
				
			}
			
			String [] cellval2=new String[numberofkeys];
			boolean rowexist = false;
			for(int c=0;c<rowcount2;c++) {
				
				for(int y=0;y<numberofkeys;y++) {
					
					cellval2[y] =table2.get(c).get(keyval[y]);
					if(table2.get(c).containsValue(cellval1[y])){	
						rowexist = true;
					}			
				}
			}	
			
			if(rowexist) {
				//comparison of one row
				subflag = true;			
				for(int col=0;col<cellval1.length;col++) 
				{
					if(!(cellval1[col].equals(cellval2[col]))) {		
						subflag=false;
						int mismatchrowcount = mismatchsheet.getLastRowNum();
						Row mismatchresultrow = mismatchsheet.createRow(mismatchrowcount+1);
						mismatchresultrow.createCell(0).setCellValue(keys[z]);
						mismatchresultrow.createCell(1).setCellValue(keyval[col]);
						mismatchresultrow.createCell(2).setCellValue(cellval1[col]);
						mismatchresultrow.createCell(3).setCellValue(cellval2[col]);
						}
					}
				}//end of single row comparison loop in 2nd sheet
				else {
					break;
				}
			
				
				
		
	}//end of outer loop
			
		if(mainflag) {
			System.out.println("\nPass: All values Match");
			keyresultrow.createCell(1).setCellValue("Passed");
			keyresultrow.createCell(2).setCellValue("Matched");
		}
		else {
			System.out.println("\nFail: All values dont Match");
			keyresultrow.createCell(1).setCellValue("Failed");
			keyresultrow.createCell(2).setCellValue("Mismatched");
		}
		//end of one key get mismatched columns
		
		
	}//end of all keys
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
		createExcel(masterreport,"D:\\EclipseWorkspace\\JavaProject\\Excel","Report"+timeStamp+".xlsx");
		
		return result;

		
	}
	
}
