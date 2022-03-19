package reusablecomponents;

import cmor.HomepageoR;

public class BussinessComponents extends TechnicalComponents {

	public void navigateurl(String url) {
		 TechnicalComponents.launchurl(url);
	}
	 public void validatedurl() {
		 HomepageoR or= new HomepageoR(driver);
		 or.validatedurl();
	 }
	  public void mhover() {
		  HomepageoR or= new HomepageoR(driver);
		  or.hover();
	  }
	  public void clikable() {
		  HomepageoR or= new HomepageoR(driver);
		 // Clikable ck = new Clikable(driver);
		  or.clicktshrit();
	  }
}
