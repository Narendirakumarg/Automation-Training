package com.StepDef;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.*;

public class S07RegistrationForm {
	@Given("Open registration page")
	public void open_registration_page() {
		System.out.println("Lanuching Registration Form");
	}

	@When("I enter the data as follows")
	public void i_enter_the_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
		System.out.println(dataTable);

		List<List<String>> data = dataTable.asLists();
		// System.out.println(data.get(0));
		System.out.println(data.get(3));

		for (List<String> d : data)
			System.out.println(d);
	}

	@Then("Registration should sucess")
	public void registration_should_sucess() {
		System.out.println("Registration Sucessfull");
	}

	@When("Enter following data")
	public void enter_following_data(io.cucumber.datatable.DataTable dataTable) {
		System.out.println(dataTable);

		List<Map<String, String>> data = dataTable.asMaps();
		System.out.println(data);

		for (Map<String, String> d : data)
		{
			// System.out.println(d);
		System.out.println("Fristname : " + d.get("Fristname"));
		System.out.println("LastName : " + d.get("LastName"));
		System.out.println("MailID  : " + d.get("MailID "));
		System.out.println("City : " + d.get("City"));
		System.out.println("Mobile : " + d.get("Mobile"));
		
	}

	}

	@Then("Registration message should display")
	public void registration_message_should_display() {

	}
}
