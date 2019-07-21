$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "Existing user should be able to log into account using correct credentials",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7629615672,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Log into account with correct credentials",
  "description": "",
  "id": "login-into-account;log-into-account-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigates to stackoverflow wbesite",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the login button on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters a valid username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters a valid password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be taken to successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_navigates_to_stackoverflow_wbesite()"
});
formatter.result({
  "duration": 1658816302,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button_on_homepage()"
});
formatter.result({
  "duration": 537730002,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_a_valid_username()"
});
formatter.result({
  "duration": 3069550372,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_a_valid_password()"
});
formatter.result({
  "duration": 49926676,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 1622672311,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_should_be_taken_to_successful_login_page()"
});
formatter.result({
  "duration": 3094005700,
  "status": "passed"
});
});