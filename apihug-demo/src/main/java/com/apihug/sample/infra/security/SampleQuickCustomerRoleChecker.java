package com.apihug.sample.infra.security;

import hope.common.spring.security.Customer;
import hope.common.spring.security.checker.QuickCustomerRoleChecker;
import org.springframework.stereotype.Component;

@Component
public class SampleQuickCustomerRoleChecker implements QuickCustomerRoleChecker<Customer> {
}
