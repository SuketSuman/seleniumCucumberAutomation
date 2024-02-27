
Feature: To send email weekly to Deals subscriber

  @Email
	Scenario: Flight Booking
    Given I Book a non-stop flight with lowest price
    And I Fill traveler details (from a data file)
    When I Choose any payment Method
    Then Verify success till payment
    

    
    