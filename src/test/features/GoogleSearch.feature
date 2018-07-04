Feature: Google Search
  @sanity
  Scenario: User search for the QA website and has link to QA page
    Given user is on google page
    When user search for "QA"
    And user select the second link
    Then user verifies the page has link to quality assurance

  @sanity
  Scenario: User searches for an invalid long text and there are no results displayed
    Given user is on google page
    When user search for "nhgsfdfhsdfhjdlhlfkgdflhjdfhjkgklkajgdkhagfkjasKYGASKFGLO4TYPW8DIBVJZ"
    Then no search results are displayed