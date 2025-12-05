import io.restassured.RestAssured;

public class basicProgram {
    public static void main(String[] args) {
        RestAssured.given().baseUri("https://www.google1.com/").log().all().when().get().then().log().all();
    }
}
