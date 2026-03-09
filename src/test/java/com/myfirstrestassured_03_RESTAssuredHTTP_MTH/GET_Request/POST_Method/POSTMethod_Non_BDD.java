package com.myfirstrestassured_03_RESTAssuredHTTP_MTH.GET_Request.POST_Method;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class POSTMethod_Non_BDD {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pin ="110048";
    @Test
public void Test_Post_Auth(){
        String payload = "{\"username\":\"admin\",\"password\":\"password123\"}";
        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);
        response=r.when().log().all().post();
        System.out.println(response.asString());
        vr=response.then().log().all();
        vr.statusCode(200);

    }
}
