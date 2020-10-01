package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonactions.CommonActions;

public class ProjectOnePage extends CommonActions{
 public ProjectOnePage() {
	 PageFactory.initElements(driver,this);
 }
 @FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
 private WebElement loginPopup;
 
 @FindBy(xpath="//span[contains(text(),'Electronics')]")
 private WebElement electronics;
 
 @FindBy(xpath="//a[contains(text(),'Bp Monitors')]")
 private WebElement HealthcareProducts;
 
 public WebElement getLoginPopup() {
	return loginPopup;
}

public WebElement getElectronics() {
	return electronics;
}

public WebElement getHealthcareProducts() {
	return HealthcareProducts;
}

public WebElement getBpMonitors() {
	return BpMonitors;
}
@FindBy(xpath="//a[@class='_2cLu-l']")
 private WebElement BpMonitors;
 
}
