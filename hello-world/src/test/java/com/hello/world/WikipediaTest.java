package com.hello.world;

/**
 * Created by malgorzata.fadziel on 21.11.2016.
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/features/",
        plugin = {"pretty", "html:target/cucumber-html-report/example",
                "json:target/example.json"},
        tags = {"@hello-world"},
        glue = "com.hello.world"
)
public class WikipediaTest {
    // This class is empty on  purpose - it's only a runner for cucumber tests.
}
