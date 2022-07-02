Feature: This is an email system that delays when emails are sent
    Scenario: I want to send an email to my girlfriend into the future
        Given   I have a free email account to send an email		
        When    I enter the email address I am sending to
        When    I enter the email address I am sending from
        When    I compose a message
        When    I select the month
        When    I select the day 
        When    I select the year
        When    I click on send
        Then    She will receive the email