package com.apihug.sample.wire.api.demo001;

import com.apihug.sample.SampleAuthorization;
import hope.common.api.Result;
import hope.common.service.annotation.Group;
import hope.common.spring.SimpleResultBuilder;
import hope.common.spring.aspect.AspectManager;
import io.swagger.v3.oas.annotations.Operation;
import java.lang.String;
import java.lang.Throwable;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Generated("H.O.P.E. Infra Team")
public class Demo001Controller {
  protected final Demo001Service _service;

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public Demo001Controller(Demo001Service service) {
    this._service = service;
  }

  @GetMapping("/demo-001/hello-world")
  @SampleAuthorization
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "Say hello to the world",
      tags = "project"
  )
  public ResponseEntity<Result<String>> exampleSayHello() {
    final SimpleResultBuilder<String> builder = new SimpleResultBuilder<String>();

    try {
    	aspect().before("/demo-001/hello-world" );
    	_service.exampleSayHello(builder);
    	ResponseEntity<Result<String>> res = builder.done();
    	aspect().after("/demo-001/hello-world", res  );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[exampleSayHello] PATH:[/demo-001/hello-world]",exception);
    	aspect().exception("/demo-001/hello-world", exception  );
    	throw exception;
    }
  }

  public AspectManager aspect() {
    return AspectManager.get();
  }
}
