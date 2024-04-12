Feature: Hotel Search and Validation

  Scenario Outline: Search for available hotels and validate results

    Given User is on Adactin home page
    When user enters "<username>" and "<password>" to login
    And User clicks Login Button
    Then User is redirected to the hotel Search Page

    Given User is on the Adactin Hotel Search page
    When User selects Location and Hotels
    And User selects Room Type and Number Of Rooms
    And User enters "<InDate>" and "<OutDate>"
    And User selects Adults per room and Children per room
    Then User clicks Submit button

    Given user is on select hotel page
    When user selects available hotel
    Then user clicks continue button

    Given user is on book hotel page
    When user enters "<First name>" and "<Last name>"
    And users enters "<Billing Address>"
    And user enters "<Credit card number>"
    And user selects Credit card type
    And user select Month and Select Year
    And user enters "<CVV>" number
    Then User clicks Book Now

    Given User is on Booking confirmation page
    And user clicks Logout
    Then user successfully logs out

    Examples:
      | username       | password        | InDate     | OutDate    | First name| Last name | Billing Address    | Credit card number | CVV  |
      | tokelosamson106| teek@ySamson106 | 2024-05-01 | 2024-05-10 | Tokelo    | Motsoeneng| 123 Main Street, NY| 1234123412341234   | 324  |
      | tokelosamson99 | tok@ySamson105  | 2024-05-01 | 2024-05-10 | Jojo      | Bean      | 127 Main Street, NY| 1234123412341235   | 321  |
      | tokelosamson06 | teek@ySamson103 | 2024-05-01 | 2024-05-10 | Mary      | Jane      | 129 Main Street, NY| 1234123412341236   | 329  |
