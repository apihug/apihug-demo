package com.apihug.sample.wire.api.demo001;

import com.apihug.sample.wire.api.demo001.values.ExampleRequest;
import hope.common.spring.SimpleResultBuilder;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public interface VIPService {
  /**
   *
   * Authorization:
   *
   * <ul>
   * 	<li>Combinator: AND</li>
   * 	<li>Roles: [ADMIN]</li>
   * 	<li>Authorities: [USER_DELETE]</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /vip/get-sth}
   * 	<p>{@code Get me something}
   */
  default void getMeSth(SimpleResultBuilder<String> builder) {
    builder.notImplemented();
  }

  /**
   *
   * Authorization:
   *
   * <ul>
   * </ul>
   * @apiNote
   * 	<p>{@code /vip/post-test}
   * 	<p>{@code test post example}
   */
  default void giveMePost(SimpleResultBuilder<String> builder, ExampleRequest exampleRequest) {
    builder.notImplemented();
  }
}
