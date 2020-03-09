package com.APITests.Utilities;

import io.restassured.path.json.JsonPath;

public class UtilMethods {


    public static JsonPath rawToJSON(String response){
        JsonPath jsonPath = new JsonPath(response);
        return jsonPath;
    }


}
