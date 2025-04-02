package utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	
//	SS
	public static void screenshot(WebDriver driver,String name) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date s=new Date();
		String dateString = s.toString();
		String d = dateString.replace(":", "-");
		File dest=new File("C:\\Users\\Mahesh Shelke\\OneDrive\\Desktop\\SS\\"+name+d+".png");

		FileHandler.copy(src, dest);	
		}
//	Excel read
    public static String excelRead(String SheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException, InvalidFormatException 
    {		
     File ex=new File("C:\\Users\\Mahesh Shelke\\OneDrive\\Desktop\\NameSheet.xlsx");

	 Workbook value = WorkbookFactory.create(ex);
			 Sheet sheet = value.getSheet(SheetName);
	         Row row = sheet.getRow(rowNum);
	         Cell cell = row.getCell(cellNum);
	         String Stringvalue = cell.getStringCellValue();
	         return Stringvalue;
	}
//	Scroll By JS
    public static void scroll(WebDriver driver,int x,int y ) 
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy("+x+","+y+")", "");
    }
    public static void scrollByElement(WebDriver driver,WebElement element) 
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView();",element);
    }
//	waits
    public static void implicitWait(WebDriver driver,int sec) 
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		
	}
    public static void explicitWait(WebDriver driver,int sec,WebElement element) 
    {
    	WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(sec));
    	w.until(ExpectedConditions.visibilityOf(element));
	}
//	Actions
    public static void actions() 
    {
		
	}
    public static void highlightObject(WebDriver driver,WebElement element) 
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}

    public static void deHighlightObject(WebDriver driver,WebElement element) 
    {
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border=''", element);
		
	}
}
