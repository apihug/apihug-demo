package com.apihug.sample;

import com.apihug.sample.wire.api.demo001.values.ExampleRequest;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import hope.kola.contract.verifier.context.T;
import hope.kola.contract.verifier.jupiter.ActiveOnTags;
import hope.kola.contract.verifier.jupiter.KolaExtension;
import hope.kola.contract.verifier.mock.MockEngine;
import io.restassured.RestAssured;
import io.restassured.builder.MultiPartSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.lang.Override;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Always try to make it better
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
@ExtendWith(KolaExtension.class)
@Generated("com/apihug/sample/test.groovy")
@Order(100)
@ActiveOnTags(
    enables = {
        "qa",
        "dev",
        "dev"
    },
    disables = "prod"
)
public class TestTester implements T {
  protected final List _requests = new ArrayList();

  protected final List _response = new ArrayList();

  @Override
  public List _requests() {
    return _requests;
  }

  @Override
  public List _response() {
    return _response;
  }

  @Test
  @Order(0)
  public void MakeItBetter() {
    // Given an API definition
    final RequestSpecification request =  RestAssured.given();
    String path = "/vip/post-test";
    // Add Multiple
    request.multiPart(new MultiPartSpecBuilder(resource("classpath:hello.txt")).build());
    // Add Multiple
    request.multiPart(new MultiPartSpecBuilder(resource("https://example.com/file.test")).mimeType("application/pdf").build());
    String requestJson =  """

    {	
      "name" : "Marquis Wolff"	
    }
                """;
    final DocumentContext parsedRequest =  JsonPath.parse(requestJson);
    _requests.add(parsedRequest);
    // Enrich the parsed json
    template(parsedRequest, ExampleRequest.class, false);
    // Request Body Class Mapping {@link com.apihug.sample.wire.api.demo001.values.ExampleRequest}
    final ExampleRequest requestObj = MockEngine.converter(ExampleRequest.class, parsedRequest.json());
    request.body(requestObj);
    final Response response = RestAssured.given().spec(request).post(path);
    // Response verification
    // Expect response success
    Assertions.assertThat(response.statusCode()).isGreaterThanOrEqualTo(200).isLessThan(300);
  }
}
