package utilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Utilityclass {
	public static WebDriver driver;

	@Test
	public static String getDataFromPF(String Keys) throws IOException {
		FileInputStream file = new FileInputStream("C:\\FinalScript\\QualityHorizon\\credentials.properties");

		Properties Prop = new Properties();

		Prop.load(file);

		String values = Prop.getProperty(Keys);

		return values;

	}

	@Test
	public static String getDataFromExcel(int Rowindex, int Cellindex) throws EncryptedDocumentException, IOException {
		FileInputStream file1 = new FileInputStream("C:\\automation\\para\\Sample_Stock.xlsx");

		Sheet sh = WorkbookFactory.create(file1).getSheet("Sheet1");

		String data = sh.getRow(Rowindex).getCell(Cellindex).getStringCellValue();

		return data;
	}
//	public static double getdatafromExcel(int Rowindex, int Cellindex) throws EncryptedDocumentException, IOException {
//	    FileInputStream file1 = new FileInputStream("C:\\automation\\para\\Sample_Stock.xlsx");
//	    Sheet sh = WorkbookFactory.create(file1).getSheet("Sheet1");
//	    double data = sh.getRow(Rowindex).getCell(Cellindex).getNumericCellValue();
//	    return data;
//	}

	@Test
	public static void takeScreenShot(WebDriver driver, int Testid) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\automation\\ScreenShots\\." + Testid + ".jpg");

		FileHandler.copy(source, destination);

	}

}
