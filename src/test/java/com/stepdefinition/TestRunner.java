package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",
                 glue="com.stepdefinition",
                 monochrome=true,
                 plugin="html:target/cucumber-reports",
                 dryRun=false)

public class TestRunner {



}
