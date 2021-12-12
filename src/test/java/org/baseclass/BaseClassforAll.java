package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassforAll {
	
public static WebDriver driver;
	
//1
	public static void browserLaunch() {
		 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
}
	
	
	
	//2
public static void UrlandTitle() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	String title = driver.getTitle();
	System.out.println(title);
}
//3
public static void maximizewindow() {
	
	driver.manage().window().maximize();
}


//4
public static void geturl(String name) {
	driver.get(name);

}
//5
public static void sendkeys(String name , WebElement sendkeysbox) {
	
sendkeysbox.sendKeys(name);
}

//6
public static void close() {
driver.close();
}

//7
public static void click(WebElement cli) {
	cli.click();

}
 //8
public static Actions a; 

public static void Actions(WebElement x) {
	a = new Actions(driver);
	a.moveToElement(x).perform();
	}

private void DragandDrop(WebElement source, WebElement  target) {
	a = new Actions(driver);
	a.dragAndDrop(source, target).perform();
}

private void doubleclick(WebElement dclick) {
	a = new Actions(driver);
	a.doubleClick(dclick).perform();
}

private void contextclick(WebElement rclick) {
a = new Actions(driver);
a.contextClick(rclick).perform();
}

public static void shiftKeyUpandDown(WebElement target, String key) {
	a = new Actions(driver);
	a.keyDown(Keys.SHIFT).sendKeys(target, "key").keyUp(Keys.SHIFT).build().perform();

}

//Alert
  
public static Alert al;
public static void switchToAlert() {

al = driver.switchTo().alert();	
}
 
// Screenshot
public static TakesScreenshot tc;

public static void screenShotObject() {
 tc = (TakesScreenshot)driver;
 
}

//public static void getScreenShot() {
//File sc = tc.getScreenshotAs(OutputType.FILE);
//}

// javascriptExecutor

public static JavascriptExecutor js;
public static void javaScriptExcutor() {
	
	 js = (JavascriptExecutor)driver;
}

public static void javaSendKeys(String name, WebElement arg1) {
	js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('value',name)", arg1);	
}

public static void javaClick( WebElement arg1) {
	js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click", arg1);
}
public static void javaGetAttribute(WebElement arg1) {
	js = (JavascriptExecutor)driver;
	js.executeScript("returnarguments[0].getAttribute('value')", arg1);
}

public static void javaScrollDown(WebElement arg1) {
	js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", arg1);
}
public static void javaScrollUp(WebElement arg1) {
	js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", arg1);
}

public static Object excelRead(String file, int x , int y, int z) throws IOException {
	File f1 = new File(file);
	
	
	FileInputStream in = new FileInputStream(f1);
	
	
	Workbook wb = new XSSFWorkbook(in);
	
	Sheet sheetAt = wb.getSheetAt(x);
	
	Row row2 = sheetAt.getRow(y);
	 
	Cell cell = row2.getCell(z);
	
     int cellType = cell.getCellType();
		
		if (cellType == 1) {
			
		
			String value = cell.getStringCellValue();
		}
			else if (DateUtil.isCellDateFormatted(cell)) {
				
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
                  String format = sd.format(dateCellValue);					
				
                //  System.out.println(format);
                  }
		
			else {
				double dd = cell.getNumericCellValue();
				long l = (long)dd;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
				
				
			
		}
		return cellType;}
}















