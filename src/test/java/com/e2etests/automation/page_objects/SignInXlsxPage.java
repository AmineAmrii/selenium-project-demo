package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ExcelUtils;
import com.e2etests.automation.utils.Setup;

public class SignInXlsxPage {
	
	/* @FindBy WebElement */
	@FindBy(how = How.ID, using = "txtUsername")
	public static WebElement username;

	@FindBy(how = How.ID, using = "txtPassword")
	public static WebElement password;

	@FindBy(how = How.ID, using = "btnLogin")
	public static WebElement btnLogin;
	
	public SignInXlsxPage() {
		PageFactory.initElements(Setup.driver, this);	
	}
	
	/* Create method */
	
	public void sighInXlsx() throws Exception {
		// This is to get values from Excel Sheet, passing parameters (Row num, Col num) to getCellData
		String sUsername = ExcelUtils.getCellData(1, 1);
		String sPassword = ExcelUtils.getCellData(1, 2);
		
		username.sendKeys(sUsername);
		password.sendKeys(sPassword);
	}

}
