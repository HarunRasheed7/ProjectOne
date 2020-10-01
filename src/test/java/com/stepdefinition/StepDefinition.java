package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.commonactions.CommonActions;
import com.pageobject.ProjectOnePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends CommonActions{
	
     ProjectOnePage p=new ProjectOnePage();
	@Given("User closing the login popup.")
	public void user_closing_the_login_popup() {
	   select(p.getLoginPopup());
	}

	@When("User mouse over to Electronics.")
	public void user_mouse_over_to_Electronics() {
	    mouseOver(p.getElectronics());
	}

	@When("User clicks on Bp monitors.")
	public void user_clicks_on_Bp_monitors() {
	    select(p.getHealthcareProducts());
	}

	@Then("User validates the result.")
	public void user_validates_the_result() {
		List<WebElement> li = driver.findElements(By.xpath("//a[@class='_2cLu-l']"));
		for (WebElement x : li) {
			String text = x.getText();
			if (text.contains("AccuSure")) {
			String products = x.getText();
			System.out.println(products);
			}
			
			
		}
		
	}


}
