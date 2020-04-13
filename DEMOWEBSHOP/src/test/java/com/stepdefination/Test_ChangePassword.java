package com.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.BaseClass;
import com.pages.ChangePassword;
import com.pages.Webshop_Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_ChangePassword  extends BaseClass{

	Webshop_Loginpage lp;  
	ChangePassword cp;
	
	private static Logger logger = (Logger) LogManager.getLogger(Test_ChangePassword.class);
	@Given("The user launches  the chrome")
	public void the_user_launches_the_chrome() throws Throwable{
	    launchApp("chrome");
	    logger.debug("chrome launched and navigated to website");
	}

	@When("The user login  to the site")
	public void the_user_login_to_the_site() throws Throwable{
		lp=new Webshop_Loginpage(driver);
		lp.loginac();
		
	logger.info("login to the website");
	}

	@Then("The user enters {string} and {string} and {string}")
	public void the_user_enters_and_and(String string, String string2, String string3) throws Throwable{
	    
		
		cp=new ChangePassword(driver);
    	cp.changepassword(string,string2,string3);
    	
    	screenshot("src/main/resources/Screenshots/Changepassword.png");
    	driver.quit();
    	logger.warn("the old password didn't match");
	}
	
}


