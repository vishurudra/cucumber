package com.training;


import io.cucumber.java8.En;
import org.junit.Assert;

import java.util.concurrent.atomic.AtomicInteger;


public class AdditionSteps implements En {

    /* Constructor */
    public AdditionSteps() {
        AtomicInteger num1 = new AtomicInteger();
        AtomicInteger num2 = new AtomicInteger();
        AtomicInteger num3 = new AtomicInteger();
        Given("first number is {int} and second number is {int}", (Integer firstNumber, Integer secondNumber) -> {
            num1.set(firstNumber);
            num2.set(secondNumber);
        });

        When("user executes sum function", () -> {
            num3.set(num1.intValue() + num2.intValue());
        });

        Then("the sum is {int}", (Integer expectedSum) -> {
            Assert.assertEquals(30, num3.intValue());
        });
    }
}