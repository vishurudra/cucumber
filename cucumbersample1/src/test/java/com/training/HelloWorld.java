package com.training;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HelloWorld {
    String sample ="";
    @Given("hello world in lower case")
    public void helloWorldInLowerCase() {
       sample="hello world";
    }
    @When("hello world converted to upper case")
    public void helloWorldConvertedToUpperCase() {
        // Write code here that turns the phrase above into concrete actions
      sample=sample.toUpperCase();
    }
    @Then("output should be HELLO WORLD")
    public void outputShouldBeHELLOWORLD() {
        Assert.assertEquals("HELLO WORLD",sample);
    }

}
