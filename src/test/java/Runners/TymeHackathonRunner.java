package Runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/tyme_hackathon.feature", glue= {"StepDefinitions"}, tags= {"@UserRegister"},
monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
"html:target/HtmlReports"}

		)

public class TymeHackathonRunner {
	
	
}

//SetNewPass
//AdminInviteEvaluator
//AdminInviteJudge