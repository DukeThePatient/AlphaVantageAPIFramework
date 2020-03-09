@exchangeRate @smoke
Feature: Currency Exchange Rate
  Background:
    Given the an authorized API Key is provided

  @wip
  Scenario: As a user, I should be able to check the current Exchange Rates for both physical and digital currencies
    When the user sends a GET request with the following data:
    | function | CURRENCY_EXCHANGE_RATE |
    | from_currency | XRP               |
    | to_currency   | USD               |
    Then the status code should be 200
    And the From Currency name should be "Ripple"
    And the To Currency name should be "United States Dollar"
    And the Time Zone should be "UTC"