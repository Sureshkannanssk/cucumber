$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/File.feature");
formatter.feature({
  "name": "To validate the login functionality of fb applicaion",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the login with invalid password and invalid username",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Invalidname"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": ": To launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefine.to_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": ": To pass the invalid name in Name Textbox",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefine.to_pass_the_invalid_name_in_Name_Textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": ": To pass the invalid value in password Textbox",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefine.to_pass_the_invalid_value_in_password_Textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": ": To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefine.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": ": To check whether its navigate to homepage or not",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefine.to_check_whether_its_navigate_to_homepage_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login with datatable password and invalid username",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Datatable"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": ": To launch the url db",
  "keyword": "When "
});
formatter.match({
  "location": "Datatable1.to_launch_the_url_db()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": ": To pass the valid name in Name Textbox db",
  "rows": [
    {
      "cells": [
        "email1",
        "sure@gmail.com"
      ]
    },
    {
      "cells": [
        "email2",
        "sursse@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Datatable1.to_pass_the_valid_name_in_Name_Textbox_db(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": ": To pass the valid value in password Textbox db",
  "rows": [
    {
      "cells": [
        "pass1",
        "pass2",
        "pass3"
      ]
    },
    {
      "cells": [
        "1234",
        "134",
        "145"
      ]
    },
    {
      "cells": [
        "2567",
        "343",
        "111"
      ]
    },
    {
      "cells": [
        "1327",
        "213",
        "241"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Datatable1.to_pass_the_valid_value_in_password_Textbox_db(DataTable)"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat org.stepdefinition.Datatable1.to_pass_the_valid_value_in_password_Textbox_db(Datatable1.java:39)\r\n\tat ✽.: To pass the valid value in password Textbox db(src/test/resources/File.feature:40)\r\n",
  "status": "failed"
});
formatter.step({
  "name": ": To click the login button db",
  "keyword": "And "
});
formatter.match({
  "location": "Datatable1.to_click_the_login_button_db()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});