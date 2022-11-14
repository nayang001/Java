package seleniumDemo;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path="E:\\AT SOFT\\Excel selenium.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
		System.out.println(data);

	}

}
