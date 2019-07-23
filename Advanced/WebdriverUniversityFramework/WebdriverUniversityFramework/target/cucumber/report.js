$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUsChrome.feature");
formatter.feature({
  "line": 2,
  "name": "Submit data to webdriveruniversity.com using contact us form",
  "description": "A user should be able to submit information via the contact us form\r\nIf a user clicks on the reset button then all information should be removed from the contact us form",
  "id": "submit-data-to-webdriveruniversity.com-using-contact-us-form",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ContactUs"
    },
    {
      "line": 1,
      "name": "@chrome"
    }
  ]
});
formatter.before({
  "duration": 3395468305,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I access webdriveruniversity",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the contact us button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_access_webdriveruniversity()"
});
formatter.result({
  "duration": 2609835921,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_contact_us_button()"
});
formatter.result({
  "duration": 154820288,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Submit information using the contact us form",
  "description": "",
  "id": "submit-data-to-webdriveruniversity.com-using-contact-us-form;submit-information-using-the-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I enter first name",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter last name",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter an email address",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter comments",
  "rows": [
    {
      "cells": [
        "example comment one",
        "example comment two"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on the submit button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the information should successfully be submitted via the contact us form",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_enter_first_name()"
});
formatter.result({
  "duration": 4144060208,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_last_name()"
});
formatter.result({
  "duration": 92344429,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_an_email_address()"
});
formatter.result({
  "duration": 145298138,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_comments(DataTable)"
});
formatter.result({
  "duration": 261322044,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_submit_button()"
});
formatter.result({
  "duration": 1743418279,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_information_should_successfully_be_submitted_via_the_contact_us_form()"
});
formatter.result({
  "duration": 70644974,
  "status": "passed"
});
formatter.after({
  "duration": 654422954,
  "status": "passed"
});
formatter.before({
  "duration": 3310260369,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I access webdriveruniversity",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the contact us button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_access_webdriveruniversity()"
});
formatter.result({
  "duration": 1716025013,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_contact_us_button()"
});
formatter.result({
  "duration": 132194461,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Submit non-valid data using the contact us form",
  "description": "",
  "id": "submit-data-to-webdriveruniversity.com-using-contact-us-form;submit-non-valid-data-using-the-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I enter a non-valid first name",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter a non-valid last name",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter a non-valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter no comments",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on the submit button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "the information should not be successfully submitted via the contact us form",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "the user should also be notified of the problem",
  "keyword": "But "
});
formatter.match({
  "location": "Steps.i_enter_a_non_valid_first_name()"
});
formatter.result({
  "duration": 4160013835,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_a_non_valid_last_name()"
});
formatter.result({
  "duration": 113202734,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_a_non_valid_email_address()"
});
formatter.result({
  "duration": 128387704,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_no_comments()"
});
formatter.result({
  "duration": 69741291,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_submit_button()"
});
formatter.result({
  "duration": 441726018,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_information_should_not_be_successfully_submitted_via_the_contact_us_form()"
});
formatter.result({
  "duration": 10657149,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_user_sjould_also_be_notified_of_the_problem()"
});
formatter.result({
  "duration": 7562602,
  "status": "passed"
});
formatter.after({
  "duration": 702197505,
  "status": "passed"
});
formatter.before({
  "duration": 3275704602,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I access webdriveruniversity",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the contact us button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_access_webdriveruniversity()"
});
formatter.result({
  "duration": 1633857392,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_contact_us_button()"
});
formatter.result({
  "duration": 144215710,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Enter information into the contact us form, when click on reset button then information should be removed",
  "description": "",
  "id": "submit-data-to-webdriveruniversity.com-using-contact-us-form;enter-information-into-the-contact-us-form,-when-click-on-reset-button-then-information-should-be-removed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "I enter first name",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I enter last name",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter an email address",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I enter comments",
  "rows": [
    {
      "cells": [
        "example comment one",
        "example comment two"
      ],
      "line": 33
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on the reset button",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "the information should be removed from the contact us form",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.i_enter_first_name()"
});
formatter.result({
  "duration": 4119620929,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_last_name()"
});
formatter.result({
  "duration": 78262914,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_an_email_address()"
});
formatter.result({
  "duration": 140881547,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_comments(DataTable)"
});
formatter.result({
  "duration": 257731109,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_reset_button()"
});
formatter.result({
  "duration": 77607703,
  "status": "passed"
});
formatter.match({
  "location": "Steps.the_information_should_be_removed_from_the_contact_us_form()"
});
formatter.result({
  "duration": 157612684,
  "status": "passed"
});
formatter.after({
  "duration": 670892892,
  "status": "passed"
});
formatter.uri("LoginChrome.feature");
formatter.feature({
  "line": 2,
  "name": "Login to account at webdriveruniversity.com using Login portal",
  "description": "",
  "id": "login-to-account-at-webdriveruniversity.com-using-login-portal",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    },
    {
      "line": 1,
      "name": "@chrome"
    }
  ]
});
formatter.before({
  "duration": 3347926178,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I access webdriveruniversity",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the login portal button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter a username",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_access_webdriveruniversity()"
});
formatter.result({
  "duration": 1684280457,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_login_portal_button()"
});
formatter.result({
  "duration": 140049805,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_a_username()"
});
formatter.result({
  "duration": 4147963255,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Login to account with a valid password",
  "description": "",
  "id": "login-to-account-at-webdriveruniversity.com-using-login-portal;login-to-account-with-a-valid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Important"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I enter a \"valid\" password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be presented with a successful validation alert",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 11
    }
  ],
  "location": "Steps.i_enter_a_password(String)"
});
formatter.result({
  "duration": 118307739,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 130413104,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_should_be_presented_with_a_successful_validation_alert()"
});
formatter.result({
  "duration": 4489638,
  "status": "passed"
});
formatter.after({
  "duration": 662400045,
  "status": "passed"
});
formatter.before({
  "duration": 3308529924,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I access webdriveruniversity",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the login portal button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter a username",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.i_access_webdriveruniversity()"
});
formatter.result({
  "duration": 1584940649,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_login_portal_button()"
});
formatter.result({
  "duration": 137488171,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_a_username()"
});
formatter.result({
  "duration": 4144557704,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login to account with an invalid password",
  "description": "",
  "id": "login-to-account-at-webdriveruniversity.com-using-login-portal;login-to-account-with-an-invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I enter a \"invalid\" password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I should be presented with an unsuccessful validation alert",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 11
    }
  ],
  "location": "Steps.i_enter_a_password(String)"
});
formatter.result({
  "duration": 127003680,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 132750062,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_should_be_presented_with_an_unsuccessful_validation_alert()"
});
formatter.result({
  "duration": 5076229,
  "status": "passed"
});
formatter.after({
  "duration": 692819236,
  "status": "passed"
});
});