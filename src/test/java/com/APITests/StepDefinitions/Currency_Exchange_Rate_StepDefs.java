package com.APITests.StepDefinitions;

import POJOs.CurrencyExchangeRate;
import com.APITests.Utilities.ConfigurationReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.*;



public class Currency_Exchange_Rate_StepDefs {

    String baseURL = ConfigurationReader.get("baseURL");
    String apiKey;
    Response response;

    @Given("the an authorized API Key is provided")
    public void the_an_authorized_API_Key_is_provided() {
        apiKey = ConfigurationReader.get("apiKey");
    }

    @When("the user sends a GET request with the following data:")
    public void the_user_sends_a_GET_request_with_the_following_data(Map<String, String> data) {
        response = given().accept(ContentType.JSON).queryParams(data).queryParam("apikey", apiKey)
                            .when().get(baseURL);
        response.prettyPrint();
        System.out.println("Body print passed");
    }
    @Then("the status code should be {int}")
    public void the_status_code_should_be(Integer int1) {
        response.then().statusCode(200);
        System.out.println("Status code passed");
    }

    @Then("the From Currency name should be {string}")
    public void the_From_Currency_name_should_be(String str) {
        CurrencyExchangeRate usdToXRP = response.body().as(CurrencyExchangeRate.class);

        System.out.println(usdToXRP.toString());
    }

    @Then("the To Currency name should be {string}")
    public void the_To_Currency_name_should_be(String str) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the Time Zone should be {string}")
    public void the_Time_Zone_should_be(String str) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
