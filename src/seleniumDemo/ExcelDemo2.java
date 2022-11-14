package seleniumDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Using FileInputStream
		String path="E:\\AT SOFT\\Excel selenium.xlsx";		
		FileInputStream file=new FileInputStream(path);			
		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();		
		System.out.println(data);
		
		//Using File
		File file1 =new File(path);
		String data1=WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data1);

	}

}
