package com.test;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\rajen\\Projects\\Testing\\src\\test\\resources\\features\\login.feature",
glue= {"stepdefinition"},
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
,monochrome = true
,publish = true,
dryRun=true)
public class Runner extends AbstractTestNGCucumberTests
{

}
