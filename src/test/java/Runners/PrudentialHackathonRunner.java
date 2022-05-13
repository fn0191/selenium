package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/PrudentialHackathon.feature", glue= {"StepDefinitions"}, tags= {"@UserSubmitPropPrud"},
monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
"html:target/HtmlReports"}

		)

public class PrudentialHackathonRunner {
	
	
}


//tags= {"@UserSubmitPropPrud"},
