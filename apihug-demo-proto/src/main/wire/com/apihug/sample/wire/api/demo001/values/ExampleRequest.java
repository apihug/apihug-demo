package com.apihug.sample.wire.api.demo001.values;

import com.apihug.sample.vo.SuperParentClass;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "This is an example request"
)
@ProtoFrom(
    value = "com/apihug/sample/proto/api/demo001/values/request.proto",
    entity = "ExampleRequest",
    kind = Kind.MESSAGE
)
public class ExampleRequest extends SuperParentClass {
  private static final long serialVersionUID = 0L;

  @NotEmpty
  @Size(
      max = 32
  )
  @Schema(
      description = "name of the user",
      maxLength = 32,
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "My Lord"
  )
  protected String name;

  public String getName() {
    return name;
  }

  public ExampleRequest setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("ExampleRequest{");
    builder.append("name=").append(name);
    return builder.append('}').toString();
  }
}
