Feature: Book Browsing Pagination

  Scenario: No results
    Given I have 0 books
    When I view all books
    Then I should see "No results" on the page

  Scenario: Some results
    Given I have 3 books
    When I view all books
    Then I should see "Book 1"
    And I should see "Book 2"
    And I should see "Book 3"

  Scenario: Page links
    Given I have <count> books
    When I view all books from page <page>
    Then I should see a link to page <target page>

   Examples:
      | count | page | target page |
      |   8   |   1  |       2     |
      |   8   |   2  |       1     |
      |  13   |   1  |       2     |
      |  13   |   1  |       3     |
      |  13   |   2  |       1     |
      |  13   |   2  |       3     |
      |  13   |   3  |       1     |
      |  13   |   3  |       2     |

  Scenario: Page links for current page
    Given I have <count> books
    When I view all books from page <page>
    Then I should see a disabled pagination link to page <page>

    Examples:
      | count | page |
      |   8   |  1   |
      |   8   |  2   |
      |  13   |  1   |
      |  13   |  2   |
      |  13   |  3   |

  Scenario: Next Page links
    Given I have <count> books
    When I view all books from page <page>
    Then I should see a link "Next Page"

    When I click "Next Page"
    Then I should be on page <next page> # assert against query params maybe?
    # alternately, to keep page requests down, one could use something like:
    # Then I should see a link "Next Page" going to "?p=<next page>"

    Examples:
      | count | page | next page |
      |   8   |   1  |      2    |
      |  13   |   1  |      2    |
      |  13   |   2  |      3    |

  Scenario: Next Page links on last page
    Given I have <count> books
    When I view all books from page <page>
    Then I should see a disabled pagination link "Next Page"

    Examples:
      | count | page |
      |   8   |   2  |
      |  13   |   3  |