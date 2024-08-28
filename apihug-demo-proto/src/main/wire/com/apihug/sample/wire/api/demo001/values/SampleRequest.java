package com.apihug.sample.wire.api.demo001.values;

import com.apihug.sample.vo.SuperParentClass;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "A sample plain object definition"
)
@ProtoFrom(
    value = "com/apihug/sample/proto/api/demo001/values/request.proto",
    entity = "SampleRequest",
    kind = Kind.MESSAGE
)
public class SampleRequest extends SuperParentClass {
  private static final long serialVersionUID = 0L;

  @NotNull
  @Schema(
      description = "age of human",
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "Example of this field"
  )
  protected Long age;

  @Schema(
      description = "name of a chinese people"
  )
  protected String name;

  public Long getAge() {
    return age;
  }

  public SampleRequest setAge(Long age) {
    this.age = age;
    return this;
  }

  public String getName() {
    return name;
  }

  public SampleRequest setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("SampleRequest{");
    builder.append("age=").append(age);
    builder.append(", name=").append(name);
    return builder.append('}').toString();
  }
}
