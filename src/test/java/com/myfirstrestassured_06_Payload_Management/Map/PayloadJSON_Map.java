package com.myfirstrestassured_06_Payload_Management.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PayloadJSON_Map {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pin ="110048";
    @Test
    public void Test_Post_Auth(){
       //String payload = "{\"username\":\"admin\",\"password\":\"password123\"}";
        //We will create Map of the String Payload
Map<String, Object> jsonBodyusingMap = new LinkedHashMap<>();
jsonBodyusingMap.put("pin",pin);
jsonBodyusingMap.put("usernam","Prakarsh");
jsonBodyusingMap.put("password","password123");
Map<String, Object> bookingdates = new LinkedHashMap<>();
bookingdates.put("checkin","25-03-2026");
jsonBodyusingMap.put("bookingdates",bookingdates);
        System.out.println(jsonBodyusingMap);
      /*  r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);
        response=r.when().log().all().post();
        System.out.println(response.asString());
        vr=response.then().log().all();
        vr.statusCode(200);*/

    }
}
