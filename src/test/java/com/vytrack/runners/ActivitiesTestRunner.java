package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( monochrome = true,
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = true,
        strict=false,

        plugin = {
                "html:target/default-report",
                "json:target/cucumber.json"
        }
)
public class ActivitiesTestRunner {
}
