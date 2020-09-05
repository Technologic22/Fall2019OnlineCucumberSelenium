package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( monochrome = true,
        glue = "com/vytrack/step_definitions",
       features = "src/test/resources/features",
       dryRun = false,
       strict=false,
       tags = "@sales_manager",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"

        }
)
public class CucumberRunner {

}
