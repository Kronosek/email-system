package com.kronosek.steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Email {

    WebDriver driver;

    @Given("I have a free email account to send an email")
    public void i_have_a_free_email_account_to_send_an_email() {
        System.out.println("given");
    }

    @When("I enter the email address I am sending to")
    public void I_enter_the_email_address_I_am_sending_to () {
        System.out.println("when one");
    }

    @When("I enter the email address I am sending from")
    public void I_enter_the_email_address_I_am_sending_from() {
        System.out.println("when three");
    }

    @When("I compose a message")
    public void I_compose_a_message () {
        System.out.println("when two");
    
    }   
    
    @When("I select the month")
    public void I_select_the_month() {
        System.out.println("when two");
    
    }
    
    @When("I select the day")
    public void I_select_the_day() {
        System.out.println("when two");
    
    } 
    
    @When("I select the year")
    public void I_select_the_year() {
        System.out.println("when two");
    
    }

    @When("I click on send")
    public void I_click_on_send () {
        System.out.println("when two");
    
    }

    @Then("She will receive the email")
    public void She_will_receive_the_email() {
        System.out.println("then");
    }
    
}
