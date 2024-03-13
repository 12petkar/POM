package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.WebDriverUtil;

public class HomePage extends WebDriverUtil{


	// Identify Organization
	
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	
	private WebElement  Organizations;
     
	
	
//	 Identify Contacts
	
	@FindBy(xpath = "//a[text()='Contacts']")
	
	private WebElement Contacts;
	
	//Identify IMg
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	
	private WebElement IMG;
	
	
	//Indentify Signout
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;


	public WebElement getOrganizations() {
		return Organizations;
	}


	public WebElement getContacts() {
		return Contacts;
	}


	public WebElement getIMG() {
		return IMG;
	}


	public WebElement getSignout() {
		return signout;
	}
	

	
	//create a contructor HOmePage

	public HomePage (WebDriver driver) {
	PageFactory.initElements(driver, this);





}

	
	//create a method

   public void Home(WebDriver driver) {
	   
	   
	   //click on oragnization
  
	   Organizations.click();
   
   
   }
   public void Homes(WebDriver driver) {
	
 
	   
	   
	   //   //mouse Hover on img
   
    mousehover(driver, IMG);
   
   
  
   //click on signout
    
    signout.click();
   
   
   }


}
