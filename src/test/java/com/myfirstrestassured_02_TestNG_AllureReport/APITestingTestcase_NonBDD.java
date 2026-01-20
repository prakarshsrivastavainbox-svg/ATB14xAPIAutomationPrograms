package com.myfirstrestassured_02_TestNG_AllureReport;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.SortedMap;

public class APITestingTestcase_NonBDD {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void TC_01_NonBDD(){
       String pin="560049";
       //When part-1
       r = RestAssured.given();
       r.baseUri("https://api.zippopotam.us");
       r.basePath("/IN/"+pin);
       // When part -2
        response=r.when().log().all().get();
        System.out.println(response.asString());
        //Then part 3
        vr=response.then().log().all();
        vr.statusCode(200);
    }
}
