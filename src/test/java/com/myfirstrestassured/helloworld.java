package com.myfirstrestassured;

import io.restassured.RestAssured;

public class helloworld {
    public static void main(String[] args) {
        RestAssured.given().baseUri("https://www.facebook.com/").log().all().when().get().then().log().all();
    }
}
