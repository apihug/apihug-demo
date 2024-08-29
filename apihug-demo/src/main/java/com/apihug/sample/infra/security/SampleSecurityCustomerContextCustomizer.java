package com.apihug.sample.infra.security;

import hope.common.spring.security.Customer;
import hope.common.spring.security.context.SecurityCustomerContextCustomizer;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import org.springframework.stereotype.Component;

@Component
public class SampleSecurityCustomerContextCustomizer implements SecurityCustomerContextCustomizer<SampleCustomer> {
  @Override
  public SampleCustomer create() {
    return new SampleCustomer();
  }

  @Override
  public Customer anonymous() {
    return AnonymousSampleCustomer.INSTANCE;
  }

  @Override
  public Class tenantClz() {
    return Long.class;
  }

  @Override
  public Class identifierClz() {
    return Long.class;
  }
}
