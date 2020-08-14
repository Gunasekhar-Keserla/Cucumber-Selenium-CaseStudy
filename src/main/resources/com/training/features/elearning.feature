@tag
Feature: elearning portal registration  and to send an email to other user in the system

  @tag1
  Scenario: elearning portal user signup and send an email message to other user in the system
    Given the elearing application is loaded
    And user go for sign-up registration
    When enters his firstname in firstname text box
    And enters his lastname in lastname text box
    And enters his user_email in email text box
    And enters his username in username text box
    And enters his password in  password textbox
    And enters  confirm_password in confirm-password textbox
    Then user gets successfully registered message with his personal details
    And take a screenshot1
    Then Click right corner dropdown to verify his details
    And take a screenshot2
    Then user go for email compose from home page
    And enters other user to_email in send-to text box
    And enters email message_subject in email-subject text box
    And enters message_content in message-body text box
    And clicks on send-message button
    Then acknowledgement message page is shown
    And take a screenshot3
    And close all sessions