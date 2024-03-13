package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {

//Indentify create Organizations...(+)
	
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	
	private WebElement creatOrganizations;

	public WebElement getCreatOrganizations() {
		return creatOrganizations;
	}



	
	//create the contructor OrganizationsPage
	 
	 public OrganizationsPage (WebDriver driver) {
	 
	 PageFactory.initElements(driver, this);
	

}

//create a Method
	 
	 public void Organizations() {
		 
		 creatOrganizations.click(); //click on plush btn...(+)
		 
	 }


}
