package cmcoretest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import reusablecomponents.BussinessComponents;

public class Verifyurl extends BussinessComponents {
	
	@Test
	public void validateurl() { 
		try {
	
	navigateurl(prop.getProperty("env_url")) ;
	validatedurl();
	mhover();
	clikable();
	 logger.log(LogStatus.PASS, " testcase 1 is  passed");
	}catch( Exception e) {
		 logger.log(LogStatus.FAIL, e+" Testcase testcase1 failed");
	}

}
}
