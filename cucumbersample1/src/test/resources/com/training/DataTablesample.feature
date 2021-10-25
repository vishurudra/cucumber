Feature: SumMultiple

  # Using Cucumber DataTable to get all inputs - addition of 3 numbers
  Scenario: Sum of multiple numbers

    Given user executes sum function on arrays:
      | 10 |
      | 20 |
      | 30 |
    When user executes sum function on arrays
    Then the sum of arrays is 60