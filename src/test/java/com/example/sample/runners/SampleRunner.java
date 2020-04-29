package com.example.sample.runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue={"com.example.sample.steps"},
		plugin= {"pretty","html:target/cucumber-html-report"},
		monochrome = true,
		strict=true
)
public class SampleRunner {
	@BeforeClass
    public static void setUp(){
        Configuration.browser = WebDriverRunner.FIREFOX;
        System.setProperty("webdriver.chrome.driver", "driver/geckodriver.exe");
    }
}
