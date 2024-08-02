package com.example.raw;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TesterSample {
  @Test
  @Order(1)
  public void BaiduHelpMe() {
    // Given an API definition
    final RequestSpecification request = RestAssured.given();
    String path = "https://www.gongkongmall.com/";
    request.baseUri(path);
    final Response response = request.get(path);
    // Response verification
    // Expect response success
    Assertions.assertThat(response.statusCode()).isGreaterThanOrEqualTo(200).isLessThan(300);
  }
}
