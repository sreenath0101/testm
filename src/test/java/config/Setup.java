package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Setup {
	 public static WebDriver driver;
	 public static Properties prop;
	  public static ExtentReports log;
	   public static ExtentTest logger;
	@BeforeSuite
	public void  method() {
		readproperties();
		 log=  new ExtentReports(".//reports1.html");
		}
	
	
	
	public  static  void  readproperties()  {
		try {
	File f=new File(".//config.properties");
		FileInputStream fis= new FileInputStream(f);
		prop= new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@BeforeMethod
	 public void method2() {
		logger=log.startTest(" test1");
		 logger.setDescription(" testcase1");
		openBrowser(prop.getProperty("browser"));
		 
	 }
	 public WebDriver openBrowser(String browser) {
		 
		 switch(browser) {
		 case "chrome":
			 System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			 driver= new ChromeDriver();
			  break;
		 case " firefox":
			  break;
			  
		 case " edge":
			  break;
			  
		 default:
		System.out.println(" no browser defined");
		break;
		 }
		  return driver;
	 }
	
	 @AfterMethod
	   public void method3() {
		   log.flush();
		 
	   }
	
	@AfterSuite
	 public void method4() {
		if(driver!=null) {
			 driver.quit();
		}
	}
	

}
