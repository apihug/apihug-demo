package com.apihug.sample.wire.domain.bootstrap.config;

import hope.common.spring.audit.AuditContext;
import hope.common.spring.audit.AuditContextSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Repository
public class SampleJdbcSupportImpl implements SampleJdbcSupport {

  @Autowired @Lazy
  @Qualifier("_HPP_sample_namedParameterJdbcTemplate")
  protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  @Autowired @Lazy
  protected SamplePersistenceContext persistenceContext;

  @Autowired(required = false) protected AuditContextSupplier supplier = AuditContextSupplier.EMPTY;

  @Override
  public JdbcOperations jdbcTemplate() {
    return namedParameterJdbcTemplate.getJdbcOperations();
  }

  @Override
  public NamedParameterJdbcOperations namedJdbcTemplate() {
    return namedParameterJdbcTemplate;
  }

  @Override
  public <Identify, Tenant> AuditContext<Identify, Tenant> auditContext() {
    return supplier.get();
  }

  @Override
  public SamplePersistenceContext persistenceContext() {
    return persistenceContext;
  }
}