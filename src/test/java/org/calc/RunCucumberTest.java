package org.calc;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //dove si trova il gherkin
        features = "src/test/resources",
        //dove si torovano gli step java
        glue = "org.calc",
        plugin = {"json:target/cucumber.json"}
)
public class RunCucumberTest {
}
