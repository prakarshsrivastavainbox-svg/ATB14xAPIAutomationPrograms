package com.myfirstrestassured_02_TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITestingTestcase {
    String pin = "226004";
@Test
    public void test_ng_positive_TC1(){
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pin)
                .when().get()
                .then().log()
                .all().statusCode(200);
    };
@Test
    public void test_ng_negative_TC2(){
        pin ="@";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pin)
                .when().get()
                .then().log()
                .all().statusCode(200);
    };
@Test
    public void test_ng_negaitive_TC3(){
        pin=" ";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pin)
                .when().get()
                .then().log()
                .all().statusCode(200);
    }
}
