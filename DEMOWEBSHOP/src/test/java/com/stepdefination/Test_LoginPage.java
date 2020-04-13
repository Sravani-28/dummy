package com.stepdefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.BaseClass;
import com.excel.ExcelLogin;
import com.pages.Webshop_Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Test_LoginPage extends BaseClass{
	
	
	private static Logger logger = (Logger) LogManager.getLogger(Test_LoginPage.class);
	//ExcelLogin data = new ExcelLogin();
	//importing the login_page and creating an instance
	Webshop_Loginpage lp;
	
	@Given("User launches demowebshop page")
	public void user_launches_demowebshop_page() throws Throwable {
		launchApp("chrome");
		logger.debug("chrome launched and website opened");
		lp=new Webshop_Loginpage(driver);
		lp.log();
	    //lp.loginac();
	}
  
	@When("User enters valid credentials {string} and {string}")
	public void user_enters_valid_credentials(String email,String password) {
		lp=new Webshop_Loginpage(driver);
		ExcelLogin ExcelLogin = new ExcelLogin();
		
		try {
			lp.email(ExcelLogin.excel_email(1));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			lp.email(ExcelLogin.excel_password(1));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//lp = new Webshop_Loginpage(driver);
		lp.login();
	    logger.info("credentials entered");
	    
	}

	@Then("User can login successfully")
	public void user_can_login_successfully() throws Throwable {
	   //System.out.println(driver.getTitle()); 
	logger.info("login successfully");
	screenshot("src/main/resources/Screenshots/Login.png");
	
	//driver.quit();
	}

}

