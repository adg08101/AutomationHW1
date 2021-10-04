Feature: Search according a criteria in Google page and open the first result

  Scenario: Open a first page in the Google Search results
    Given User launch Chrome browser
    When User opens URL: "https://www.google.com"
    And User types search criteria as "uciencia 2021"
    And User clic on the search button
    Then Browser is shown a list of the search results
    When The user clic on the first element on the list
    Then The page should be "IV Conferencia Científica Internacional UCIENCIA 2021"
    And The user close browser
