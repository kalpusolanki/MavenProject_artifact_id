package libraryfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Utility_Class 
{
public static String getTestData(int rowno,int cellno) throws EncryptedDocumentException, IOException
{
	FileInputStream file = new FileInputStream("C:\\\\Users\\\\kalpu\\\\OneDrive\\\\Desktop\\\\KALPESH VELOCITY\\\\Auto\\\\excelex\\\\example1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
	String actual = sh.getRow(rowno).getCell(cellno).getStringCellValue();
	return actual;
	
}

public static void CaptureSS(WebDriver driver,int TCID) throws IOException 
{
	File TSS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\scshot\\img"+TCID+".jpg");
	FileHandler.copy(TSS, dest);
}

public static String PFTestData( String key) throws IOException 
{
	FileInputStream file =new FileInputStream("C:\\Users\\kalpu\\workspace\\selenium1\\src\\POMDDF_TSS_BC_UC_MODIFIED\\Propertyfile.properties");
		Properties pf = new Properties();
		pf.load(file);
	 String value = pf.getProperty(key);
	 return value;
		
}
}
