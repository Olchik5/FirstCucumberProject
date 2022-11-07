Feature:  Login

  @validData
  Scenario: Login with valid data
    Given Navigate to Home Page
    When Click on Login tab
    Then Appear LoginRegistration form
    And Enter valid data
    And Click on Login button
    Then SignOut button displayed


    @invalidPassword
  Scenario Outline: Login with invalid password
    Given Navigate to Home Page
    When Click on Login tab
    Then Appear LoginRegistration form
    And Enter valid email and an invalid password
    |email|password|
    |<email>|<password>|
    And Click on Login button
    Then Alert appeared

    Examples:
    |email|password|
    |   kuku+1@mail.com    |   kukT123     |
    |   kuku+1@mail.com    |   kukt123455$ |
