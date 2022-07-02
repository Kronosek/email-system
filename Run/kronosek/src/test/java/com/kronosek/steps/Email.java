package com.kronosek.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.kronosek.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Email {

    WebDriver driver;

    @Given("i have a free email account to send an email")
    public void i_have_a_free_email_account_to_send_an_email() {
        TestRunner.driver.get("C:/Users/18623/Desktop/Kronosek/email-system/Run/kronosek/src/test/resources/webpages/Email.html");
    }

    @When("i enter the email address i am sending to")
    public void i_enter_the_email_address_i_am_sending_to () {
        By emailTo = By.id("to");
        WebElement to = TestRunner.driver.findElement(emailTo);
        to.sendKeys("d@te.me");
    }

    @When("i enter the email address i am sending from")
    public void i_enter_the_email_address_i_am_sending_from() {
        By emailFrom = By.id("from");
        WebElement from = TestRunner.driver.findElement(emailFrom);
        from.sendKeys("awesomeperk17@gmail.com");
    }

    @When("i enter the subject")
    public void i_enter_the_subject () {
        By subjectTitle = By.id("subject");
        WebElement subject = TestRunner.driver.findElement(subjectTitle);
        subject.sendKeys("Mi amor!");
    } 

    @When("i compose a message")
    public void i_compose_a_message () {
        By messageBody = By.id("message");
        WebElement message = TestRunner.driver.findElement(messageBody);

        int i = 0;
        while (i<=150){
            int binary = (int)(Math.random() * 2) + 0;
            message.sendKeys(Integer.toString(binary));
            i++;
        }

    }   
    
    @When("i select the month")
    public void i_select_the_month(){
        By selectElementBy = By.id("month");
        WebElement month = TestRunner.driver.findElement(selectElementBy);
        Select m = new Select(month);
        m.selectByIndex(3);
    }


    @When("i select the day")
    public void i_select_the_day(){
        By selectElementBy = By.id("day");
        WebElement day = TestRunner.driver.findElement(selectElementBy);
        Select d = new Select(day);
        d.selectByIndex(0);
    } 
    
    @When("i select the year")
    public void i_select_the_year(){
        By selectElementBy = By.id("year");
        WebElement year = TestRunner.driver.findElement(selectElementBy);
        Select y = new Select(year);
        y.selectByIndex(20);
        
    }

    @When("i click on send")
    public void i_click_on_send () {    
        By selectElementBy = By.id("send");
        WebElement send = TestRunner.driver.findElement(selectElementBy);
        send.click();
    }

    @Then("i click ok to confirm")
    public void i_click_ok_to_confirm() {
        System.out.println("Works!");
    }
    
}
