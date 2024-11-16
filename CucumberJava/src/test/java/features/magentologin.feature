Feature: Sign up and Sign in Flow
  

  @magentotag
  Scenario: User can create an account
  Given User is on the magento Landing Page
  When the user is on the create an Account page
    When the user fills in the personal information and signin informaiton details
    Then User clicks on create an account button
  