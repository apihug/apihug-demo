package com.apihug.sample.wire.api.demo001;

import com.apihug.sample.SampleAuthorization;
import com.apihug.sample.wire.api.demo001.values.ExampleRequest;
import com.apihug.sample.wire.infra.settings.DemoAuthorityEnum;
import hope.common.api.Result;
import hope.common.service.annotation.Group;
import hope.common.service.api.Authorization;
import hope.common.spring.SimpleResultBuilder;
import hope.common.spring.aspect.AspectManager;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import java.lang.String;
import java.lang.Throwable;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Generated("H.O.P.E. Infra Team")
public class VIPController {
  protected final VIPService _service;

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public VIPController(VIPService service) {
    this._service = service;
  }

  @GetMapping("/vip/get-sth")
  @SampleAuthorization(
      combinator = Authorization.Combinator.AND,
      roles = "ADMIN",
      authorities = DemoAuthorityEnum.USER_DELETE
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "Get me something",
      tags = "user"
  )
  public ResponseEntity<Result<String>> getMeSth() {
    final SimpleResultBuilder<String> builder = new SimpleResultBuilder<String>();

    try {
    	aspect().before("/vip/get-sth" );
    	_service.getMeSth(builder);
    	ResponseEntity<Result<String>> res = builder.done();
    	aspect().after("/vip/get-sth", res  );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[getMeSth] PATH:[/vip/get-sth]",exception);
    	aspect().exception("/vip/get-sth", exception  );
    	throw exception;
    }
  }

  @PostMapping("/vip/post-test")
  @SampleAuthorization
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "test post example"
  )
  public ResponseEntity<Result<String>> giveMePost(
      @RequestBody @Valid ExampleRequest exampleRequest) {
    final SimpleResultBuilder<String> builder = new SimpleResultBuilder<String>();
    exampleRequest = exampleRequest == null ? new ExampleRequest(): exampleRequest;

    try {
    	aspect().before("/vip/post-test","exampleRequest",exampleRequest );
    	_service.giveMePost(builder,exampleRequest);
    	ResponseEntity<Result<String>> res = builder.done();
    	aspect().after("/vip/post-test", res ,"exampleRequest",exampleRequest );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[giveMePost] PATH:[/vip/post-test]",exception);
    	aspect().exception("/vip/post-test", exception ,"exampleRequest",exampleRequest );
    	throw exception;
    }
  }

  public AspectManager aspect() {
    return AspectManager.get();
  }
}
