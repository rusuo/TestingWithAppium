$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('cucumber/test/Contacts.feature');
formatter.feature({
  "id": "add-a-new-contact",
  "description": "",
  "name": "add a new contact",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "add-a-new-contact;add-a-new-contact",
  "tags": [
    {
      "name": "@android",
      "line": 3
    },
    {
      "name": "@web",
      "line": 3
    }
  ],
  "description": "",
  "name": "Add a new contact",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I am on add user page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I click to add a contact",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I complete the details",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "I can save a new contact",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "location": "AddContactStepDefs.I_am_on_add_user_page()"
});
formatter.result({
  "duration": 2886997000,
  "status": "passed"
});
formatter.match({
  "location": "AddContactStepDefs.I_click_to_add_a_contact()"
});
formatter.result({
  "duration": 4449847000,
  "status": "passed"
});
formatter.match({
  "location": "AddContactStepDefs.I_complete_the_details()"
});
formatter.result({
  "duration": 14115398000,
  "status": "passed"
});
formatter.match({
  "location": "AddContactStepDefs.I_can_save_a_new_contact()"
});
formatter.result({
  "duration": 3996017000,
  "status": "passed"
});
});