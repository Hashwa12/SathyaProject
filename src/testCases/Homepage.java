package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import testElements.SathyaElements;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Homepage {
	WebDriver driver;
	SathyaElements ele;
	File src;
	File src1;
	FileInputStream FIS;
	FileInputStream FIS1;
	FileOutputStream Fout;
	XSSFWorkbook WB;
	XSSFSheet sheet1;
	XSSFWorkbook WB1;
	XSSFSheet sheet11;
	DataFormatter formatter;
	
	@Test
	@Parameters("url")
	public void Setup(String url) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get(url);
  }
//	@BeforeSuite
//	public void excelRead() throws IOException
//	{
//		src = new File("D:\\Hashwanth\\Programs\\1.Java\\Mine\\Selenium\\Sathya\\Read.xlsx");
//		FIS = new FileInputStream(src);
//		WB = new XSSFWorkbook(FIS);
//		sheet1 = WB.getSheetAt(0);
//		formatter = new DataFormatter();
//		
////		*****************************EXCEL WRITE***************************
//		
//		src1 = new File("D:\\Hashwanth\\Programs\\1.Java\\Mine\\Selenium\\Sathya\\Write.xlsx");
//		FIS1 = new FileInputStream(src1);
//		WB1 = new XSSFWorkbook(FIS1);
//		sheet11 = WB1.getSheetAt(0);
//		
//		sheet11.createRow(0).createCell(0).setCellValue("Model Name");
//		sheet11.getRow(0).createCell(1).setCellValue("Price");
//		sheet11.getRow(0).createCell(2).setCellValue("RAM Capacity");
//		sheet11.getRow(0).createCell(3).setCellValue("Hard Disk Size");
//		sheet11.getRow(0).createCell(4).setCellValue("Warrenty");
//
//		Fout=new FileOutputStream(src1);
//		WB1.write(Fout);
//	}
//  @BeforeTest
//  @Parameters({"url"})
//  public void Setup(String url) throws InterruptedException
//  {
//	  System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver_win32\\chromedriver.exe");
//	  driver = new ChromeDriver();
//	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	  driver.manage().window().maximize();
//	  driver.get(url);
//  }
//  
//  @Test(priority = 1)
//  public void title() throws InterruptedException
//  {
//	  ele = new SathyaElements(driver);
//	  
//	  String product = sheet1.getRow(1).getCell(0).getStringCellValue();
//	  String Fname = sheet1.getRow(1).getCell(1).getStringCellValue();
//	  String Lname = sheet1.getRow(1).getCell(2).getStringCellValue();
//	  String address = sheet1.getRow(1).getCell(3).getStringCellValue();
//	  String city = sheet1.getRow(1).getCell(4).getStringCellValue();
//	  String pin = formatter.formatCellValue(sheet1.getRow(1).getCell(5));
//	  String email = sheet1.getRow(1).getCell(6).getStringCellValue();
//	  String phNo = formatter.formatCellValue(sheet1.getRow(1).getCell(7));
//	  
//	  ele.ItemSearch(product);
//	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	  ele.button();
//	  ele.item();
//	  ele.ItemName();
//	  ele.AddToCart();
//	  ele.CheckOut();
//	  ele.GuestUser();
//	  ele.details(Fname,Lname,address,city,pin,email,phNo);
//	  ele.country();
//	  ele.next();
//	  ele.ship();
//	  ele.next1();
//	  ele.next2();
//	  ele.Check();
//  }
//  
//  @Test(priority = 2)
//  public void getlist() throws Exception
//  {
//	  ele=new SathyaElements(driver);
//	  ele.ProductType();
//	  ele.Laptop();
//	  ele.Dell();
//	  int TotalModels=1;
//	  String model = "//h3/a/span";
//	  for (int i = 0; i < TotalModels; i++)
//      {
//    	  List<WebElement> ModelsList = driver.findElements(By.xpath(model));
//    	  TotalModels=ModelsList.size();
//          String modelname =ModelsList.get(i).getText();
//    	  sheet11.createRow(i+1).createCell(0).setCellValue(modelname);
//          ModelsList.get(i).click();
//    	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    	  String p;
//		try
//		{
//			p = driver.findElement(By.xpath("//div[@class='pd-price']")).getText();
//			
//		}
//		catch (Exception e)
//		{
//			p=driver.findElement(By.xpath("//div[@class='pd-price pd-price--offer']")).getText();
//			
//		}
//    	  sheet11.getRow(i+1).createCell(1).setCellValue(p);
//          
//    	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
//    	  
//    	  sheet11.getRow(i+1).createCell(2).setCellValue(features());
//    	  sheet11.getRow(i+1).createCell(3).setCellValue(ROM());
//    	  sheet11.getRow(i+1).createCell(4).setCellValue(Warrenty());
//	  
//    	  driver.navigate().back();
//    	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//      }
//	  Fout=new FileOutputStream(src1);
//		WB1.write(Fout);
//  }
//  
// 
//  @AfterTest
//  public void close()
//  {
//	  driver.quit();
//  }
//    
//  public String features() {
//	driver.findElement(By.xpath("//a[contains(text(),'Features')]")).click();
//	String ram;
//	ram = driver.findElement(By.xpath("//tr/td[contains(text(),'RAM Capacity')]/following::td[1]")).getText();		
//	return ram;
//}
//  public String ROM() {
//	String rom;
//	try {
//		rom = driver.findElement(By.xpath("//tr/td[contains(text(),'Hard Disk capacity')]/following::td[1]")).getText();
//	} catch (org.openqa.selenium.NoSuchElementException e) {
//		rom = driver.findElement(By.xpath("//tr/td[contains(text(),'ROM Capacity')]/following::td[1]")).getText();
//	}
//	return rom;
//}
//  public String Warrenty() {
//	String warrenty = driver.findElement(By.xpath("//tr/td[contains(text(),'Warranty')]/following::td[1]")).getText();
//	return warrenty;
//}
}