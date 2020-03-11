package com.sentrifugo.myInfo.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sentrifugo.myInfo.pageObject.LoginPage;
import com.sentrifugo.myInfo.pageObject.PersonalDetails;

public class TC_PersonalDetailsTest_003 extends BaseClass {

	public TC_PersonalDetailsTest_003() throws IOException {
		super();
		
	}
	
	@Test
	public void editPersonalDetails() throws InterruptedException, IOException {
		
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("Entered username");
	
	lp.setPassword(password);
	logger.info("Entered password");
	
	lp.clickLoginButton();
	logger.info("clicked on login");
	
	PersonalDetails pd=new PersonalDetails(driver);
	pd.clickMyInfo();
	logger.info("clicked on myInfo link");
	
	pd.clickPersonalDetails();
	logger.info("clicked on personal details link");
	
	pd.clickEdit();
	logger.info("clicked on edit button");
	
	pd.setFirstName("Sunitha");
	logger.info("Entered first name");
	
	pd.setMiddleName("Raju");
	logger.info("Entered middle name");
	
	pd.setLastName("waghamare");
	logger.info("Entered last name");
	
	pd.setOtherID("Pan Card");
	logger.info("Entered Pan card");
	
	pd.clickLicenseExpDate();
	logger.info("click on license Exp date");
	
	pd.selectYear();
	logger.info("year selected");
	
	pd.selectMonth();
	logger.info("month selected");
	
	pd.clickDay();
	logger.info("date selected");
	
	pd.selectFemale();
	logger.info("gender selected");
	
	pd.selectMaritalStatus();
	logger.info("marital status selected");
	
	pd.selectNational();
	logger.info("nationality selected");
	
	scrollDown();
	logger.info("Scrolled down");
	
	pd.clickAddAttachment();
	logger.info("click on add attachment");
	
	//pd.clickChooseFile();
	//logger.info("click on choose file");
	
	//pd.setComment("photo attached");
	//logger.info("photo attched successfully");
	
	//pd.clickUpload();
	//logger.info("clicked on doc upload button");
	pd.clickSaveButton();
	logger.info("personal details edited successfully");
	
	
	String actualMsg=driver.findElement(By.xpath("//div[@class='message success fadable']")).getText();
	String expMsg=actualMsg;
	if(actualMsg.equalsIgnoreCase(expMsg)) {
		logger.info("personal Details testcase passed");
		captureScreenshot(driver,"editPersonalDetails");
		Assert.assertTrue(true);
	}
	else {
		logger.info("personal Details testcase passed");
		captureScreenshot(driver,"editPersonalDetails");
		Assert.assertTrue(false);
	}
	logger.info("verifying success message using ToolTip");
	
	
	}
}
