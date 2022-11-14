package seleniumPratice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelForSQL 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		for (int i=1;i<129;i++)
		{
			System.out.print("Insert into tablename Values (");
			for (int j=0;j<5;j++)
			{
				String path="E:\\AT SOFT\\Excel Selenium1.xlsx";
				FileInputStream file=new FileInputStream(path);
				String data=WorkbookFactory.create(file).getSheet("Table 1").getRow(i).getCell(j).getStringCellValue();
				System.out.print("'"+data+"',");
			}
			System.out.print(")");
			System.out.println();
		}

	}

}
