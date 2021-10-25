package com.training.bagextra;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bagextra",
        plugin = {"pretty", "html:target/cucumber/bagextra"},
        extraGlue = "com.training.bagcommons")
public class BagExtraCucumberIntegrationTest {
}
