package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewAcountPage extends BasePage {

	public NewAcountPage(WebDriver pDriver) {
		super(pDriver);
	}

	@FindBy(name = "firstName")
	private WebElement textFirtName;

	@FindBy(name = "lastName")
	private WebElement textLastName;

	@FindBy(name = "email")
	private WebElement textEmail;

	@FindBy(name = "newPassword")
	private WebElement textNewPassword;

	@FindBy(css = "button[class='btn btn-primary ng-scope ng-isolate-scope']")
	private WebElement buttonSingUp;

	@FindBy(css = "[ng-repeat='item in parsedItems']")
	private WebElement itemTestFail;
	
	
	public void informationNewAcount(String name, String lastName, String email, String password) {

		getWait().until(ExpectedConditions.visibilityOf(textFirtName));
		textFirtName.sendKeys(name);
		textLastName.sendKeys(lastName);
		textEmail.sendKeys(email);
		textNewPassword.sendKeys(password);
	
	}
	


	public HomePageEspn sendInformation() {
		buttonSingUp.click();
		getDriver().switchTo().defaultContent();
		return new HomePageEspn(getDriver());

	}
	
	
	public String getPageTextFail() {
		getWait().until(ExpectedConditions.visibilityOf(itemTestFail));
		return itemTestFail.getText();
	}
}
