package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = "stepDefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber-html-reports",
                "json:target/cucumber-json-reports/cucumber.json",
                "junit:target/cucumber-junit-reports/cucumber.xml"
        },
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        stepNotifications = true
)
public class TestRunner {
    
}


