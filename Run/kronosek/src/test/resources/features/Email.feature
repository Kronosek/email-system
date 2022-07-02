Feature: This is an email system that delays when emails are sent
    Scenario: I want to send an email to my girlfriend into the future
        Given   i have a free email account to send an email		
        When    i enter the email address i am sending to
        When    i enter the email address i am sending from
        When    i enter the subject
        When    i compose a message
        When    i select the month
        When    i select the day 
        When    i select the year
        Then    i click on send and ok on the alert box