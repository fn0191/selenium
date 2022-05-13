$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/apixplatform.feature");
formatter.feature({
  "name": "As User creating a end-to-end (e2e) tests for testing APIX platform",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AllAPIXPlatform"
    }
  ]
});
formatter.scenario({
  "name": "As a user, I want to Onboard Organization",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AllAPIXPlatform"
    },
    {
      "name": "@OnboardOrgFI"
    }
  ]
});
formatter.step({
  "name": "user is on apix to login",
  "keyword": "Given "
});
formatter.match({
  "location": "APIX_Scenario_Step.user_is_on_apix_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "When "
});
formatter.match({
  "location": "APIX_Scenario_Step.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login via email",
  "keyword": "And "
});
formatter.match({
  "location": "APIX_Scenario_Step.login_via_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user completing steps onboard org",
  "keyword": "And "
});
formatter.match({
  "location": "APIX_Scenario_Step.user_completing_steps_onboard_org()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it navigated user to complete page",
  "keyword": "Then "
});
formatter.match({
  "location": "APIX_Scenario_Step.it_navigated_user_to_complete_page()"
});
formatter.result({
  "status": "passed"
});
});