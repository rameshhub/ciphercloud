package cypercloud;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Reading {

	public  ArrayList<String> getUserDefied() throws IOException, BiffException {
		
		
		FileInputStream fs = new FileInputStream("C:\\Users\\RAMESH\\Desktop\\xlsdoc.xls");
		
		Workbook wb = Workbook.getWorkbook(fs);
		
		Sheet sh =wb.getSheet(0);
		int totalNoOfRows = sh.getRows();
		int totalNoOfCols = sh.getColumns();
		
		ArrayList<String> al=new ArrayList<String>();
		
		for (int row = 0; row < totalNoOfRows; row++) {

			for (int col = 0; col < totalNoOfCols; col++) {
				//System.out.print(sh.getCell(col, row).getContents() + "\t");
				
				 al.add(sh.getCell(col, row).getContents());
			}
			//System.out.println();

		}
		fs.close();
		
		return al;
		
	}
	
		

	}


