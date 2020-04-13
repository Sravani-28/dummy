package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Login  to the website
public class Webshop_Loginpage  {  
	
	
   WebDriver driver; 
	@FindBy(xpath="//*[@class='ico-login']") 
	WebElement login;
	@FindBy(name="Email") 
	WebElement email;
	@FindBy(id="Password") 
	WebElement password;
	@FindBy(xpath="//*[@class='button-1 login-button']")  
	WebElement loginbtn;
	
	public  Webshop_Loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	this.driver=driver;   
	}
	//click the login option
	public void log() {
		login.click();
		}
	public void loginac() {
		login.click();
		email.sendKeys("sravanilokam444@gmail.com");
		password.sendKeys("Webshop1234");
		loginbtn.click();
	}
	public void email(String excel_email) {
		this.email.sendKeys(excel_email);
	}
	public void password(String excel_password) {
		this.password.sendKeys(excel_password);
	}
	public void login() {
		loginbtn.click();
	}
}

