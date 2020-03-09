package com.APITests.StepDefinitions;

import com.APITests.Utilities.ConfigurationReader;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestBase {

    public String baseURL = ConfigurationReader.get("baseURL");
    public String apiKey = ConfigurationReader.get("apiKey");
    public Response response;
    public JsonPath js;



}
