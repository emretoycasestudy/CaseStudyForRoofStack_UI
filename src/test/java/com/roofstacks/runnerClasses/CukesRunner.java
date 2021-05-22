package com.roofstacks.runnerClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",      // ==> Generates json format report
                "html:target/default-html-reports",  // ==> Generates cucumber default reports
                "rerun:target/rerun.txt",
                "pretty"                            // ==> Generates pretty report on the console
        },
        monochrome = true,                          // ==> Makes the pretty report more readable
        features = "src/test/resources/features",
        glue = "com/roofstacks/stepDefinitions",
        dryRun =false
       // tags="Task1"
)
public class CukesRunner {
}
