package reusablecomponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import config.Setup;

public class TechnicalComponents extends Setup {

	 public  static void  launchurl(String url) {
		 try {
		  driver.get(url);
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		    logger.log(LogStatus.PASS," able to launch"+url);
	 }catch(Exception e) {
		 logger.log(LogStatus.FAIL, " not able to launch url");
	 }
	 }
		 
		  public static void mousehover(WebElement element) {
			  Actions act= new Actions(driver);
			  act.moveToElement(element).build().perform();
		  }
		   public static void clickelement(WebElement element) {
			   element.click();
		   }
		   
		    public static void type(WebElement element, String text) {
		    	 element.sendKeys(text);
		    }
		 
	 
	
}
