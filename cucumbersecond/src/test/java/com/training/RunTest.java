package com.training;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,	plugin = { "usage",  "html:target/cucumber-reports.html"
,"json:target/cucumber-reports/Cucumber.json"})

public class RunTest {

}
