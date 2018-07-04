$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1824687469,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User search for the QA website and has link to QA page",
  "description": "",
  "id": "google-search;user-search-for-the-qa-website-and-has-link-to-qa-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on google page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user search for \"QA\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user select the second link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user verifies the page has link to quality assurance",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.userIsOnGooglePage()"
});
formatter.result({
  "duration": 6063488607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA",
      "offset": 17
    }
  ],
  "location": "GoogleSearchSteps.userSearchFor(String)"
});
formatter.result({
  "duration": 1519994330,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.userSelectTheSecondLink()"
});
formatter.result({
  "duration": 5123820770,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.userVerifiesThePageHasLinkToQualityAssurance()"
});
formatter.result({
  "duration": 57669104,
  "status": "passed"
});
formatter.after({
  "duration": 90486251,
  "status": "passed"
});
formatter.before({
  "duration": 803336106,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User searches for an invalid long text and there are no results displayed",
  "description": "",
  "id": "google-search;user-searches-for-an-invalid-long-text-and-there-are-no-results-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on google page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user search for \"nhgsfdfhsdfhjdlhlfkgdflhjdfhjkgklkajgdkhagfkjasKYGASKFGLO4TYPW8DIBVJZ\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "no search results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchSteps.userIsOnGooglePage()"
});
formatter.result({
  "duration": 5648153861,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nhgsfdfhsdfhjdlhlfkgdflhjdfhjkgklkajgdkhagfkjasKYGASKFGLO4TYPW8DIBVJZ",
      "offset": 17
    }
  ],
  "location": "GoogleSearchSteps.userSearchFor(String)"
});
formatter.result({
  "duration": 1313902609,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.verifyNoSearchResultsAreDisplayed()"
});
formatter.result({
  "duration": 20431725,
  "status": "passed"
});
formatter.after({
  "duration": 101253303,
  "status": "passed"
});
});