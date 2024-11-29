package com.apihug.sample.wire.domain.bootstrap.config;

import hope.common.async.GlobalExecutorService;
import hope.common.spring.data.liquibase.AbstractLiquibaseConfiguration;
import javax.sql.DataSource;
import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.Environment;
import java.util.List;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@ConditionalOnProperty(prefix = "spring.liquibase", name = "enabled", matchIfMissing = false)
@Configuration
@AutoConfigureBefore(
    name = "org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration")
@EnableConfigurationProperties(LiquibaseProperties.class)
public class SampleLiquibaseConfiguration extends AbstractLiquibaseConfiguration {

  @Autowired protected LiquibaseProperties liquibaseProperties;

  
  @Autowired
  protected DataSource dataSource;

  
  @Autowired
  protected DataSourceProperties dataSourceProperties;

  @Autowired(required = false)
  @Lazy
  protected List<Customizer> customizers;

  public SampleLiquibaseConfiguration(Environment env) {
    super(env);
  }

  @Override
  protected String domain() {
    return "sample";
  }

  @Bean
  public SpringLiquibase springLiquibase() {

    final Customizer customizer =
            (liquibase, domain) -> {
              if (customizers != null) {
                customizers.forEach(it -> it.customize(liquibase, domain));
              }
              liquibase.setChangeLog("classpath:liquibase/sample/master.xml");
            };

    return liquibase(
        GlobalExecutorService.INSTANCE.EXECUTOR,
        dataSource,
        dataSourceProperties,
        liquibaseProperties,
        customizer);
  }
}