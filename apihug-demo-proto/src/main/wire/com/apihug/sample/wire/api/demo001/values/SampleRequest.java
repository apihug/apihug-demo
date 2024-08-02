package com.apihug.sample.wire.api.demo001.values;

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
public class SampleRequest {
  private static final long serialVersionUID = 0L;

  @NotNull
  @Schema(
      description = "age of human",
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "Example of this field"
  )
  protected Long aga;

  public Long getAga() {
    return aga;
  }

  public SampleRequest setAga(Long aga) {
    this.aga = aga;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("SampleRequest{");
    builder.append("aga=").append(aga);
    return builder.append('}').toString();
  }
}
