package com.stepdefinition;

import com.commonactions.CommonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions {
 @Before
 public static void beforeScenario() {
	 launch();
 }
 @After
 public void afterScenario() {
	 driver.quit();
	 
 }
}
