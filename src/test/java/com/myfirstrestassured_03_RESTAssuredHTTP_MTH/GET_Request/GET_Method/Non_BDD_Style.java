package com.myfirstrestassured_03_RESTAssuredHTTP_MTH.GET_Request.GET_Method;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Non_BDD_Style {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pin ="110048";

    @Test
    public void Test_GET_Positive(){
    //Given Section 1 of Non BDD  --- Request Specification
        r= RestAssured.given();
    r.baseUri("https://api.zippopotam.us");
    r.basePath("/IN/"+pin);

    //Section 2 of non BDD of When --- Response
        response=r.when().log().all().get();
        System.out.println(response.asString());
    // Section 3 of Non BDD of Then-----(Validation)
    vr=response.then().log().all();
        vr.statusCode(200);

    }
}
