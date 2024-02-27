$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FeatureFiles/AIvaluation.feature");
formatter.feature({
  "line": 1,
  "name": "AI valuation of properties",
  "description": "",
  "id": "ai-valuation-of-properties",
  "keyword": "Feature"
});
formatter.before({
  "duration": 850234500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify if user is able to valuate the property using Zoopla link",
  "description": "",
  "id": "ai-valuation-of-properties;verify-if-user-is-able-to-valuate-the-property-using-zoopla-link",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Register"
    },
    {
      "line": 3,
      "name": "@One"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to AI valuation page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I provide Zoopla link for valuation",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get AI valuation for the property",
  "keyword": "Then "
});
formatter.match({
  "location": "AIvaluation.i_launch_the_application()"
});
formatter.result({
  "duration": 5488300500,
  "status": "passed"
});
formatter.match({
  "location": "AIvaluation.i_go_to_AI_valuation_page()"
});
formatter.result({
  "duration": 966465800,
  "status": "passed"
});
formatter.match({
  "location": "AIvaluation.i_provide_Zoopla_link_for_valuation()"
});
formatter.result({
  "duration": 321862200,
  "status": "passed"
});
formatter.match({
  "location": "AIvaluation.i_should_get_AI_valuation_for_the_property()"
});
formatter.result({
  "duration": 13896000,
  "status": "passed"
});
formatter.after({
  "duration": 61333300,
  "status": "passed"
});
});