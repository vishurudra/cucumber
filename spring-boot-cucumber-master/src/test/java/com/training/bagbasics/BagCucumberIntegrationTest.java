package com.training.bagbasics;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagbasics",
        plugin = {"pretty", "html:target/cucumber/bagbasics"},
        extraGlue = "com.training.bagcommons")
public class BagCucumberIntegrationTest {
}
