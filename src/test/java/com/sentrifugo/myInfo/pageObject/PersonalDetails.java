package com.sentrifugo.myInfo.pageObject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PersonalDetails {

	WebDriver driver;
	
	public PersonalDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="menu_pim_viewMyDetails")
	@CacheLookup
	WebElement clickMyInfo;
	
	@FindBy(linkText="Personal Details")
	@CacheLookup
	WebElement clickPersonalDetails;
	
	@FindBy(xpath="//input[@id='btnSave']")
	@CacheLookup
	WebElement clickEdit;
	
	@FindBy(id="personal_txtEmpFirstName")
	@CacheLookup
	WebElement setFirstName;
	
	@FindBy(id="personal_txtEmpMiddleName")
	@CacheLookup
	WebElement setMiddleName;
	
	@FindBy(id="personal_txtEmpLastName")
	@CacheLookup
	WebElement setLastName;
	
	@FindBy(id="personal_txtOtherID")
	@CacheLookup
	WebElement setOtherID;
	
	@FindBy(id="personal_txtLicExpDate")
	@CacheLookup
	WebElement clickLicenseExpDate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	@CacheLookup
	WebElement selectYear;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	@CacheLookup
	WebElement selectMonth;
	
	@FindBy(linkText="12")
	@CacheLookup
	WebElement clickDay;
	
	@FindBy(id="personal_optGender_1")
	@CacheLookup
	WebElement selectMale;
	
	@FindBy(id="personal_optGender_2")
	@CacheLookup
	WebElement selectFemale;
	
	@FindBy(id="personal_cmbMarital")
	@CacheLookup
	WebElement selectMaritalStatus;
	
	@FindBy(id="personal_cmbNation")
	@CacheLookup
	WebElement selectNational;
	
	@FindBy(id="btnSave")
	@CacheLookup
	WebElement clickSaveButton;
	
	@FindBy(id="btnAddAttachment")
	@CacheLookup
	WebElement clickAddAttachment;
	
	@FindBy(name="ufile")
	@CacheLookup
	WebElement clickChooseFile;
	
	@FindBy(id="txtAttDesc")
	@CacheLookup
	WebElement setComment;
	
	@FindBy(id="btnSaveAttachment")
	@CacheLookup
	WebElement clickUpload;
	
	@FindBy(xpath="//div[@class='message success fadable']")
	@CacheLookup
	WebElement verifySuccessfullySavedMsg;
	
	
	public void clickMyInfo() {
		clickMyInfo.click();
	}
	
	public void clickPersonalDetails() throws InterruptedException {
		clickPersonalDetails.click();
		
	}
	
	public void clickEdit() {
         clickEdit.click();
	}
	
	public void setFirstName(String fname) {
		setFirstName.clear();
		setFirstName.sendKeys(fname);
	}
	
	public void setMiddleName(String mname) {
		setMiddleName.clear();
		setMiddleName.sendKeys(mname);
	}
	
	public void setLastName(String lname) {
		setLastName.clear();
		setLastName.sendKeys(lname);
	}
	

	public void setOtherID(String otherID) {
		setOtherID.clear();
		setOtherID.sendKeys(otherID);
	}
	

	public void clickLicenseExpDate() {
		clickLicenseExpDate.click();
	}
	

	public void selectYear() {
		selectYear.click();
		Select sel=new Select(selectYear);
		sel.selectByValue("2020");
	}
	

	public void selectMonth() {
		selectMonth.click();
		Select sel=new Select(selectMonth);
		sel.selectByValue("3");
	}
	

	public void clickDay() {
		clickDay.click();
	}
	
	public void selectMale() {
		selectMale.click();

	}
	
	public void selectFemale() {
		selectFemale.click();

	}
	
	public void selectMaritalStatus() {
		selectMaritalStatus.click();
		Select sel=new Select(selectMaritalStatus);
		sel.selectByValue("Single");
	}
	
	public void selectNational() {
		selectNational.click();
		Select sel=new Select(selectNational);
		sel.selectByValue("82");
	}
	
	public void clickAddAttachment() throws InterruptedException {
		clickAddAttachment.click();
		
	}
	
	public void clickChooseFile() throws InterruptedException {
		Thread.sleep(2000);
		//driver.findElement(By.id("ufile")).click();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementsByName('ufile')[0].click();");
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("arguments[0].click();", clickChooseFile);
		//jse.executeScript("arguments[0].click();", clickChooseFile);

		//jse.executeScript("document.getElementById('ufile')[0].click();");
		//clickChooseFile.click();
	}
	
	public void setComment(String comment) {
		setComment.sendKeys(comment);
	}
	
	public void clickUpload() {
		clickUpload.click();
	}
	
	
	public void clickSaveButton() {
		
		clickSaveButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
