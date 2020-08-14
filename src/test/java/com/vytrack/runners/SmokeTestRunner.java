package com.vytrack.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions( monochrome = true,
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@scenario_outline_2",
        plugin = {
                "html:target/smoke_test_default-report",
                "json:target/cucumber2.json",
                "rerun:target/rerun.txt"
        }
)
public class SmokeTestRunner extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider (parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }
}
