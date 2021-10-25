package com.training;


import io.cucumber.java8.En;
import org.junit.Assert;

import java.util.concurrent.atomic.AtomicInteger;


public class AdditionModifiedSteps implements En {

    /* Constructor */
    public AdditionModifiedSteps() {
        AtomicInteger num1 = new AtomicInteger();
        AtomicInteger num2 = new AtomicInteger();
        AtomicInteger num3 = new AtomicInteger();
        Given("first number is {int}", (Integer firstNumber) -> {
            num1.set(firstNumber);
        });

        Given("second number is {int}", (Integer secondNumber) -> {
            num2.set(secondNumber);
        });


        When("user executes sum", () -> {
            num3.set(num1.intValue() + num2.intValue());
        });

        Then("the res is {int}", (Integer expectedSum) -> {
            Assert.assertEquals(30, num3.intValue());
        });
    }
}