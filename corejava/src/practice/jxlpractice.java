package practice;

import java.io.File;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class jxlpractice 
{

	public static void main(String[] args) throws JXLException, IOException 
	{
	/*
	 * open excel sheet for reading	
	 */
		File f= new File("E:\\javaproject\\practicejxl.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int nour=rsh.getRows();
		int nouc=rsh.getColumns();
		System.out.println("rows"+nour);
		System.out.println("columns"+nouc);
		WritableWorkbook wwb=Workbook.createWorkbook(f, rwb);
		WritableSheet wsh=wwb.getSheet(0);
		/*
		 * data driven testing
		 */
		//0th row is for names of the columns
		for(int i=1;i<nour;i++)
		{
			int x=Integer.parseInt(rsh.getCell(0, i).getContents());
			                                  //colimn,row 
			int y=Integer.parseInt(rsh.getCell(1, i).getContents());
			int z=x+y;
		
		Number n=new Number(2, i, z);//column,row,data to print on sheet
	wsh.addCell(n);				
		}
		/*
		 * save data and close excel sheet
		 */
		wwb.write();
		wwb.close();
		rwb.close();
	}

}
