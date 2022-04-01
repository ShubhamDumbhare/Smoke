package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
	public static String DataFromExecl(String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream  file = new FileInputStream("E:\\VELOCITY LEC\\SOFTWARE\\ECLIPSE\\ECLIPSE CODE\\Smokesuite\\src\\main\\resources\\Excel1.xlsx");
		return WorkbookFactory.create(file).getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}

}
