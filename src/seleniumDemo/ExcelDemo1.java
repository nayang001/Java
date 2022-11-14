package seleniumDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo1 
{
	public void getDataFromExcel(int i,int j,String path) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream(path);
		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
		System.out.print(data+" ");
		
	}
	
	public void getAllDataFromExcel(int num1,int num2, String path) throws EncryptedDocumentException, IOException
	{
		for(int i=1;i<num1;i++)
		{
			for(int j=0;j<num2;j++)
			{
				FileInputStream file=new FileInputStream(path);
				String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+" ");	
			}
			System.out.println();
		}	
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		for(int i=1;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				String path="E:\\AT SOFT\\Excel selenium.xlsx";
				FileInputStream file=new FileInputStream(path);
				String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+" ");
				
			}
			System.out.println();
		}	
	}
}
