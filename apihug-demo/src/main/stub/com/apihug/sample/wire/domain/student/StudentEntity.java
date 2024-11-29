package com.apihug.sample.wire.domain.student;

import hope.common.persistence.annotations.Description;
import hope.common.spring.data.persistence.Domain;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.annotation.Generated;
import org.springframework.data.relational.core.mapping.Column;

@Table(
    name = "STUDENT",
    indexes = {
        @Index(name = "IDX_STUDENT_NAME", columnList = "NAME"),
        @Index(name = "IDX_STUDENT_EMAIL", columnList = "EMAIL")
    }
)
@org.springframework.data.relational.core.mapping.Table("STUDENT")
@Generated("H.O.P.E. Infra Team")
public final class StudentEntity extends Domain<StudentEntity, Long, Long> {
  @Column("NAME")
  @Description("name of the account")
  @jakarta.persistence.Column(
      name = "NAME",
      insertable = true,
      length = 32
  )
  protected String name;

  @Column("EMAIL")
  @Description("email of the account")
  @jakarta.persistence.Column(
      name = "EMAIL",
      nullable = true,
      unique = true,
      insertable = true,
      length = 64
  )
  protected String email;

  @Column("WEALTH")
  @Description("money own")
  @jakarta.persistence.Column(
      name = "WEALTH",
      nullable = true,
      insertable = true,
      updatable = true,
      length = 22,
      precision = 4,
      scale = 4
  )
  protected BigDecimal wealth;

  public String getName() {
    return name;
  }

  public StudentEntity setName(String name) {
    this.name = name;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public StudentEntity setEmail(String email) {
    this.email = email;
    return this;
  }

  public BigDecimal getWealth() {
    return wealth;
  }

  public StudentEntity setWealth(BigDecimal wealth) {
    this.wealth = wealth;
    return this;
  }
}
