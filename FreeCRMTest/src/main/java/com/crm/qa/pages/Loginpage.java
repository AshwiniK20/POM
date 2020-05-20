package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase {

	//Page Factory - OR:
	@FindBy(name="userName")
	WebElement email;
	
    @FindBy(name="password")
    WebElement password;

    @FindBy(name="login")
    WebElement Login;
    
    public Loginpage() {
    	
    	//Initializing the Page Objects:
		PageFactory.initElements(driver, this);
    }
		
		//Action
		public String validateLoginPageTitle(){
			return driver.getTitle();
		
		}
		public Homepage login(String em, String pwd){
			email.sendKeys(em);
			password.sendKeys(pwd);
			Login.click();
			    	
			return new Homepage();
			
    }
  
}


