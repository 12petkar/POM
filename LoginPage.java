package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Identify Username tf
	
	@FindBy(name = "user_name") //identify username tf
	
	private WebElement user_name;
	

	public WebElement getUser_name() {
		return user_name;
	}



	public WebElement getUser_password() {
		return user_password;
	}



	public WebElement getSubmitButton() {
		return submitButton;
	}



	@FindBy(name = "user_password") //identify password tf

   private WebElement user_password;
	

  
	@FindBy(id = "submitButton") //Identify	Login Button
	
	private WebElement submitButton;
	

	

	
	
//create a constructor - to initialize the webelement

public LoginPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	
	


		
	}


//create a method

public void Login(String usernamedata ,String PasswordData) {
	
	 user_name.sendKeys(usernamedata);

	 user_password.sendKeys(PasswordData);

	 submitButton.click();


}


}


