package testPackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverInitializer;
import pages.HomePage;
import pages.TablePage;
import util.ExcelUtil;

public class ExcelDataCompare extends DriverInitializer{
	
	WebDriver driver;
	HomePage home;
	TablePage table;
	ExcelUtil excel;
	 SoftAssert softAssert;
	@Test
	public void TableDataRead() throws IOException
	{
		driver= getDriver();
		home =new HomePage(driver);
		home.clickTable();
		table =new TablePage(driver);
		
		Map<String, String> tableData =table.tableData();
		System.out.println(tableData);
		softAssert = new SoftAssert();
	     softAssert.assertEquals(tableData.get("Position"),ExcelUtil.getStringData(1,1));
	     softAssert.assertEquals(tableData.get("Office"),ExcelUtil.getStringData(1,2));
	     softAssert.assertEquals(tableData.get("Age"),ExcelUtil.getStringData(1,3));
	     softAssert.assertEquals(tableData.get("StartDate"),ExcelUtil.getStringData(1,4));
	     softAssert.assertEquals(tableData.get("Salary"),ExcelUtil.getStringData(1,5));
	     //softAssert.assertAll();
		}
	
	

}

