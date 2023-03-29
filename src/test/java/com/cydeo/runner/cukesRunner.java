package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class cukesRunner {


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "json:target/cucumber.json",
                    "html:target/cucumber-reports.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber",
            },
            features="src/test/resources/features",
            glue="com/cydeo/step_definitions",
            dryRun = true,
            tags="@smoke",
            publish = true
    )
    public class CukesRunner {
    }

}