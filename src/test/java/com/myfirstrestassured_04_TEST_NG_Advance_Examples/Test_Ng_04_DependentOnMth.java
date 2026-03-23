package com.myfirstrestassured_04_TEST_NG_Advance_Examples;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test_Ng_04_DependentOnMth {
    String pin = "226004";
    @Test
    public void test_ng_positive_TC1(){
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pin)
                .when().get()
                .then().log()
                .all().statusCode(200);
    };
    @Test(dependsOnMethods = "test_ng_positive_TC1")
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
