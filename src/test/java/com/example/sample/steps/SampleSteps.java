package com.example.sample.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleSteps {
	@Given("^FireFoxを開きアプリを起動する$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable
    {
        System.out.println("Open the Firefox and launch the application.");
    }

	@When("^ユーザ名とパスワードを入力$")
    public void enter_the_Username_and_Password() throws Throwable
    {
    	System.out.println("Enter the Username and Password.");
    }

    @Then("^資格情報をリセット$")
    public void Reset_the_credential() throws Throwable
    {
        System.out.println("Click on the Reset button.");
    }
}
