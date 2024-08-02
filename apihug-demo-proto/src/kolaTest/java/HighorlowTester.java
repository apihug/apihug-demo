import hope.kola.contract.verifier.context.T;
import hope.kola.contract.verifier.jupiter.KolaExtension;
import io.restassured.RestAssured;
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
 * Let it go
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
@ExtendWith(KolaExtension.class)
@Generated("/highorlow.groovy")
@Order(1000)
public class HighorlowTester implements T {
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
  public void GkHelpMe() {
    // Given an API definition
    final RequestSpecification request =  RestAssured.given();
    String path = "https://www.gongkongmall.com/";
    if (path.startsWith("http"))  {
      request.baseUri(path);
      request.port(-1);
    }
    final Response response = RestAssured.given().spec(request).get(path);
    // Response verification
    // Expect response success
    Assertions.assertThat(response.statusCode()).isGreaterThanOrEqualTo(200).isLessThan(300);
    // Post script
    System.out.println("Who are you?");
  }
}
