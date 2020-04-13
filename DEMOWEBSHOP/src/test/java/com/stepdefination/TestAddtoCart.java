package com.stepdefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.baseclass.BaseClass;
import com.pages.AddtoCart;
import com.pages.Webshop_Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAddtoCart extends BaseClass {
	
	private static Logger logger=(Logger)LogManager.getLogger(TestAddtoCart.class);
Webshop_Loginpage lp;
	AddtoCart pac;
	
	@Given("the user launches the chrome application")
	public void the_user_launches_the_chrome_application() {
		
		launchApp("chrome");
		logger.debug("chrome Launched and navigated to website");

	}

	@When("the user logged into the home page")
	public void the_user_logged_into_the_home_page() throws Throwable  {
	    
		lp=new Webshop_Loginpage(driver);
		lp.loginac();
		
		logger.info("login successfully");
	}

	@Then("the user search the product")
	public void the_user_search_the_product() throws Throwable {
		pac=new AddtoCart(driver);
		pac.Search();
		logger.info("the products  were searched ");
		
	}

	@Then("the user give the specifications")
	public void the_user_give_the_specifications() throws Throwable  {
		pac=new AddtoCart(driver);
		pac.specifications();
		logger.info("Requird specifications were entered");
	}

	@Then("the user adds the product to the cart")
	public void the_user_adds_the_product_to_the_cart() throws Throwable {

		pac=new AddtoCart(driver);
		pac.addtocart();
		screenshot("src/main/resources/Screenshots/Addtocart.png");
		logger.info("Products added to cart successfully");
		//driver.quit();
	}



}

