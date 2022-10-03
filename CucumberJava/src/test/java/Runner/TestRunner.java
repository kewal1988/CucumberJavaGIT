package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature",glue= {"StepDefinitions"},
monochrome = true,
//plugin={"pretty","html:target/HTMLReports"},
plugin = {"json:target/cucumber.json"},
tags= {"@smoke"}
		)
public class TestRunner {

}
