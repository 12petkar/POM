package BasicPOM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.ExelUtil;
import CommonUtils.JavaUtil;
import CommonUtils.PropertyFileUtil;
import CommonUtils.WebDriverUtil;
import POM.HomePage;
import POM.LoginPage;
import POM.OrganizationInformationPage;
import POM.OrganizationsPage;

public class BasePage {

	public static WebDriver  driver;
public static void main(String[] args) throws InterruptedException, IOException {
	
	
	
	//Create oject Property file
	PropertyFileUtil util = new PropertyFileUtil();
	
	JavaUtil jutil = new JavaUtil();
	
	ExelUtil eutil = new 	ExelUtil();
	
	WebDriverUtil wutil = new WebDriverUtil();
	
	//To Raed the data from property file
	 
	String BROWSER = util.getDataPropertyFile("Browser");
	String URL = util.getDataPropertyFile("Url");
	String USERNAME = util.getDataPropertyFile("Username");
    String PASSWORD = util.getDataPropertyFile("Password");
	
    
    //To Read  data from exel
    String ORGNAME = eutil.getDataFromExcel("Organization", 0, 1);
    
    
         String GROUP = eutil.getDataFromExcel("Organization", 1, 1);
                         
    
    //To lauch the Browser
    
    
    if(BROWSER.equals("Chrome")) {
	
       driver = new ChromeDriver();
    
    }else if(BROWSER.equals("Edge")) {
    	
    	driver=new FirefoxDriver();
    }else {
    	
    	driver = new FirefoxDriver();
    	
    }
	
	driver.manage().window().maximize(); //maxmize  the browser
	//driver.get("http://localhost:8888/");
	
	driver.get(URL); //To lauch the application
	
	
	//Create object of Login page
	
	LoginPage lp = new LoginPage(driver);  //Create object of Login page
  
	lp.Login(USERNAME, PASSWORD);

	
	//craete object the Object of HomePage
	
	HomePage hp = new HomePage(driver);

	  hp.Home(driver); // click on Organizations
	 
	
	  
	  //create Oject of  OrganizationsPage

	 OrganizationsPage op = new  OrganizationsPage(driver);
	
	 
	 op.Organizations(); // Click on Plus btn(+)


	 
	 //create oject of OrganizationsPageInformation
	 
	OrganizationInformationPage oip = new OrganizationInformationPage(driver);
	 
	
 oip.OrganizationsInformation(ORGNAME+jutil.getRandomNumber(), GROUP); //Enter Org Name
	 
	


   
    
 
     Thread.sleep(2000);
    //mouse Hover on img
    
   // wutil.mousehover(driver, hp.getIMG());

hp.Homes(driver);
   //click on signout btn
    /*Thread.sleep(2000);
    hp.getSignout().click();*/

}
}
