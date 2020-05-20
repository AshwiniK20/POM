package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class Loginpagetest extends TestBase {
	Loginpage loginpage;
	Homepage homepage;
	public Loginpagetest() {
		super();
	}
	
@BeforeMethod
public void setup() {
	Intilization();
	 loginpage =new Loginpage();
	
}

@Test
public void validatelogin() {
	homepage=loginpage.login(prop.getProperty("email"), prop.getProperty("pssword"));

	
}


@AfterMethod
public void teardown() {
	driver.quit();
}
	
	


}
