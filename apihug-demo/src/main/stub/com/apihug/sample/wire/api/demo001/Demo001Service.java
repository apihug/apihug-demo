package com.apihug.sample.wire.api.demo001;

import hope.common.spring.SimpleResultBuilder;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public interface Demo001Service {
  /**
   *
   * Authorization:
   *
   * <ul>
   * </ul>
   * @apiNote
   * 	<p>{@code /demo-001/hello-world}
   * 	<p>{@code Say hello to the world}
   */
  default void exampleSayHello(SimpleResultBuilder<String> builder) {
    builder.notImplemented();
  }
}
