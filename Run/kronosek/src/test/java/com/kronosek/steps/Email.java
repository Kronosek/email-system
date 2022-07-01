package com.kronosek.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Email {

    WebDriver driver;

    public Email() {
        
    }

    @Given("I have a free email account to send an email")
    public void i_have_a_free_email_account_to_send_an_email() {
        System.out.println("given");
    }

    @When("I compose a message to my girlfriend")
    public void start_to_type_your_When_step_here_I_compose_a_message_to_my_girlfriend() {
        System.out.println("when one");
    }

    @When("I select the date to be received")
    public void i_select_the_date_to_be_received() {
        System.out.println("when three");
    }

    @When("I send the message to my girlfriend")
    public void start_to_type_your_When_step_here_I_send_the_message_to_my_girlfriend() {
        System.out.println("when two");
    
    }

    @Then("My girlfriend will receive my email")
    public void start_to_type_your_Then_step_here_My_girlfriend_will_receive_my_email() {
        System.out.println("then");
    }
}
