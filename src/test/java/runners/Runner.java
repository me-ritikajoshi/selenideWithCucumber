package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {
				"pretty",
				"html:target/html-cucumber-reports.html",
				"json:target/json-reports.json",
				"junit:target/xml-reports.xml",
		},
		monochrome=true,
		features="./src/test/resources/features",
		glue= {"stepdefinitions"},
		dryRun=true,
		tags="@navigations"
		)

public class Runner {

}
