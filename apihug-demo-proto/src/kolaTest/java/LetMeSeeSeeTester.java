import hope.kola.contract.verifier.context.T;
import hope.kola.contract.verifier.jupiter.ActiveOnTags;
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
 * Never judge the boss, as you may the real fool
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
@ExtendWith(KolaExtension.class)
@Generated("/letMeSeeSee.groovy")
@Order(100)
@ActiveOnTags(
    disables = "prod"
)
public class LetMeSeeSeeTester implements T {
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
  public void LetMeTestYou() {
    // Given an API definition
    final RequestSpecification request =  RestAssured.given();
    String path = "/demo-001/hello-world";
    // This ApiHug definition has not request body, any manually input body will be ignore
    _requests.add(T.NOTHING);
    final Response response = RestAssured.given().spec(request).get(path);
    // Response verification
    // Expect response success
    Assertions.assertThat(response.statusCode()).isGreaterThanOrEqualTo(200).isLessThan(300);
  }

  @Test
  @Order(1)
  public void BaiduHelpMe() {
    // Given an API definition
    final RequestSpecification request =  RestAssured.given();
    String path = "https://baidu.com";
    if (path.startsWith("http"))  {
      request.baseUri(path);
      request.port(-1);
    }
    final Response response = RestAssured.given().spec(request).get(path);
    // Response verification
    // Expect response success
    Assertions.assertThat(response.statusCode()).isGreaterThanOrEqualTo(200).isLessThan(300);
  }
}
