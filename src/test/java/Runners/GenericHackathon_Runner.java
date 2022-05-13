package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GenericHackathon.feature", glue= {"StepDefinitions"}, tags= {"@UserRegisterGenericHackathon"},
monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
"html:target/HtmlReports"}

		)
public class GenericHackathon_Runner {

}

//tags= {"@CreateHackathon"},