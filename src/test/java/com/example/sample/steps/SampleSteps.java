package com.example.sample.steps;

import org.openqa.selenium.By;

import com.codeborne.selenide.Selenide;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleSteps {
	@Given("^FireFoxを開きアプリを起動する$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable
    {
        System.out.println("Open the Firefox and launch the application.");
        Selenide.open("http://demo.guru99.com/v4");
    }

	@When("^ユーザ名 (.+) とパスワード (.+) を入力$")
    public void enter_the_Username_and_Password(String username,String password) throws Throwable
    {
    	System.out.println("Enter the Username and Password on the login page.");
        Selenide.$(By.name("uid")).val(username);
        Selenide.$(By.name("password")).val(password);
    }

    @Then("^資格情報をリセット$")
    public void Reset_the_credential() throws Throwable
    {
        System.out.println("Click on the Reset button.");
        Selenide.$(By.name("btnReset")).click();
    }
}
