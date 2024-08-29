package com.apihug.sample;

import com.apihug.sample.wire.api.SampleApiModule;
import hope.common.spring.security.SecurityContext;
import java.lang.Override;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Component
@Generated("H.O.P.E. Infra Team")
public class SampleSecurityContext extends SecurityContext {
  @Override
  protected SampleApiModule module() {
    return new SampleApiModule();
  }
}
