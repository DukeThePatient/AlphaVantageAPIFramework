package com.APITests.StepDefinitions;


import com.APITests.Utilities.UtilMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class Currency_Exchange_Rate_StepDefs extends TestBase {


    @Given("the an authorized API Key is provided")
    public void the_an_authorized_API_Key_is_provided() {
        Assert.assertEquals(apiKey, "RQK7U4BBNG49PE55");
    }

    @When("the user sends a GET request with the following data:")
    public void the_user_sends_a_GET_request_with_the_following_data(Map<String, String> data) {
        response = given().accept(ContentType.JSON).queryParams(data).queryParam("apikey", apiKey)
                            .when().get(baseURL);
//        response.prettyPrint();

        String responseStr = given().accept(ContentType.JSON).queryParams(data).queryParam("apikey", apiKey)
                            .when().get(baseURL).asString();
        responseStr = responseStr.replace(".", " ");

        js = UtilMethods.rawToJSON(responseStr);

//        System.out.println("ResponseStr = " + responseStr);


    }
    @Then("the status code should be {int}")
    public void the_status_code_should_be(Integer int1) {
        response.then().statusCode(int1);

    }

    @Then("the From Currency name should be {string}")
    public void the_From_Currency_name_should_be(String str) {
        String from_Currency_Name = js.getString("\"Realtime Currency Exchange Rate\".\"2  From_Currency Name\"");
        Assert.assertThat(from_Currency_Name, is(str));
    }

    @Then("the To Currency name should be {string}")
    public void the_To_Currency_name_should_be(String str) {
        String to_Currency_Name = js.getString("\"Realtime Currency Exchange Rate\".\"4  To_Currency Name\"");
        Assert.assertThat(to_Currency_Name, is(str));
    }

    @Then("the Time Zone should be {string}")
    public void the_Time_Zone_should_be(String str) {
        String timeZone = js.getString("\"Realtime Currency Exchange Rate\".\"7  Time Zone\"");
        Assert.assertThat(timeZone, is(str));
    }

}
