package com.sentrifugo.myInfo.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sentrifugo.myInfo.pageObject.LoginPage;
import com.sentrifugo.myInfo.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {

	public TC_LoginDDT_002() throws IOException {
		super();
		
	}
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String uname,String pwd) throws InterruptedException, IOException {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(uname);
		logger.info("Entered username");
		lp.setPassword(pwd);
		logger.info("Entered password");
		lp.clickLoginButton();
		logger.info("Click Login Button");

		String msg=driver.findElement(By.id("welcome")).getText();
		if(msg.equals("Welcome Admin")) {
			logger.info("Successfully Logged in");
			lp.selectLogout();
			logger.info("Select WellCome Admin Button");
			lp.clickLogout();
			logger.info("Click on Logout");
			logger.info("LoginTest Passed");
		}else {
		   
			String getmsg=driver.findElement(By.id("spanMessage")).getText();
			System.out.println(getmsg);
			try {
				if(getmsg.equalsIgnoreCase("Invalid credentials")) {
					logger.warn("Failed to Login in");
					logger.warn("LoginTest Failed");
				}
			}
				catch (Exception e) {
					e.getStackTrace();
				}

			}
	}
	
	   @DataProvider(name="LoginData")
	   String[][] getData() throws IOException{
		   String path="C:\\Users\\kishan das\\Desktop\\TestNG\\SentrifugoV1\\src\\test\\java\\com\\sentrifugo\\myInfo\\testData\\TestDataLogin.xlsx";
		  int rowcount= XLUtils.getRowCount(path, "Sheet1");
		  int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		  String[][] logindata=new String[rowcount][colcount];
		  for(int i=1;i<=rowcount;i++) {
			 for(int j=0;j<colcount;j++) { 
		  
		  logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);//1 0
		
		  }
		  }
		  return logindata;
	    }

}
