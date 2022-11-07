Feature: Add contacts

  @addContacts
  Scenario: Add contact
    Given Navigate to Home Page for ADD Contact
    When Click on Login tab for ADD Contact
    Then Appear LoginRegistration form for ADD Contact
    And Enter valid data for ADD Contact
    And Click on Login button for ADD Contact
    And Click on Add link
    Then Fill Contact form
    And click on Save button
    Then Added Contact displayed























#First level: В проекте FirstCucumberProject создайте, пожалуйста,
#еще один файл с расширением .feature и напишите в нем сценарий по
#добавлению контакта. Автоматизируйте все созданные вами шаги, прогоните тест.