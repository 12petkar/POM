package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.WebDriverUtil;

public class OrganizationInformationPage {

WebDriverUtil wutil = new WebDriverUtil();
//Identify OrgName
	
	@FindBy(name = "accountname")
	
	 private WebElement Oraganizationnametf;

	public WebElement getOraganizationnametf() {
		return Oraganizationnametf;
	}


    
	
	
	//Identify the Dropdown
	
	public WebElement getDropdown() {
		return dropdown;
	}





	@FindBy(name = "assigned_group_id")
	
	private WebElement dropdown;
	
	
	
	// Indentify Group Radio Button
	
	@FindBy(xpath = "(//input[@name='assigntype'])[2]")

	private WebElement groupbtn;

	
	

	//Identify Save Btn
	
	@FindBy(xpath = "(//input[@name='button'])[1]")	

	private WebElement SaveBtn;
	
	
	
	
	




	@FindBy(id = "search_txt")
	
	private WebElement  serchchtf;
	
	
	
	public WebElement getSaveBtn() {
		return SaveBtn;
	}





	public WebElement getGroupbtn() {
	
		return groupbtn;
	
		
		
	}
		
		
//create thecontructor 	 OrganizationInformationPage 
		 
		
		public  OrganizationInformationPage (WebDriver driver) {
		 PageFactory.initElements(driver, this); 
	 
			
		
	

	
	
	}
	
		//create a Method of OrganizationsInformation
		
		public void  OrganizationsInformation(String orgnamedata, String groupdata) {
			
			Oraganizationnametf.sendKeys(orgnamedata);	//Enter  Organizations Name
		
		//click on radio btn
		groupbtn.click();
		
		
		
		  //select group in dropdown

		
		wutil.handledropdown(dropdown, groupdata);
		
	
		
		
		//click on Save btn
		
		SaveBtn.click();
		}
		
		
	

}
