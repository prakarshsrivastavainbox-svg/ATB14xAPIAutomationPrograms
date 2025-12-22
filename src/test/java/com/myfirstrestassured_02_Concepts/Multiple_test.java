package com.myfirstrestassured_02_Concepts;

import io.restassured.RestAssured;

public class Multiple_test {
    public static void main(String[] args) {
        String pin = "226004";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pin)
                .when().get()
                .then().log()
                .all().statusCode(200);
        pin ="@";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pin)
                .when().get()
                .then().log()
                .all().statusCode(200);
        pin=" ";
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pin)
                .when().get()
                .then().log()
                .all().statusCode(200);
    }
}
