package com.sentrifugo.myInfo.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sentrifugo.myInfo.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	public TC_LoginTest_001() throws IOException {
		super();
		
	}

	@Test
	public void loginTest() throws IOException {
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered UserName");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clickLoginButton();
		logger.info("Clicked on Login");
		
		if(driver.getTitle().equals("OrangeHRM")) {
			
			Assert.assertTrue(true);
			logger.info("LoginTest Passed");
		}else {
			captureScreenshot(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("LoginTest Failed");
		}
	}
}
