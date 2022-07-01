package com.kronosek.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.kronosek.steps.*;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue="com/kronosek/steps")
public class TestRunner {
    
    public static WebDriver driver;
    public static Email email;


    /**
     * 
     */
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        email = new Email();

    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }
}
