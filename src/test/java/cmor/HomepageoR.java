package cmor;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;


import reusablecomponents.TechnicalComponents;

public class HomepageoR extends TechnicalComponents {
	public HomepageoR(WebDriver driver) {
         driver=this.driver;
		PageFactory.initElements(driver, this);
		
	}

	public void validatedurl() {
	String currenturl=	driver.getCurrentUrl();
	String expectedurl=prop.getProperty("env_url");
	 if(currenturl.equalsIgnoreCase(expectedurl)) {
		 logger.log(LogStatus.PASS, " verifed successfully");
	 }else {
		 logger.log(LogStatus.FAIL, "currenturl is not matched");
	 }
	}
	
@FindBy(xpath="(//a[contains(text(),'Women')])[1]")
	public WebElement womantab;
@FindBy(xpath="(//a[@title='T-shirts'])[1]")
 public WebElement tshrit;
	  public void hover( ) {
		  TechnicalComponents.mousehover(womantab);
		  logger.log(LogStatus.PASS, " element is hovered");
		  
	  }
	   public void clicktshrit() {
		   TechnicalComponents.clickelement(tshrit);
		   logger.log(LogStatus.PASS, " tshrit is clicked");
	   }
	  
	  
	  
	  
	  
	 
	 
}
