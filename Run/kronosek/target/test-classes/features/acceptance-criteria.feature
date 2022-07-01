Feature: This is an email system that delays when emails get sent
    Scenario: I want to send email to my girlfriend, but I don't want her to receive it now
        Given I have a free email account to send an email		
        When I compose a message to my girlfriend
        When I select the date to be received
        When I send the message to my girlfriend
        Then My girlfriend will receive my email