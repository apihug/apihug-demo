package com.apihug.sample.wire.infra.settings;

import hope.common.enumeration.Enumeration;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Schema(
    enumAsRef = true,
    nullable = false,
    allowableValues = {
        "USER_ADD",
        "USER_DELETE",
        "USER_BLOCK"
    },
    example = "USER_ADD",
    description = "Example Authority Enum for the project, MODIFY IT"
)
@Generated("H.O.P.E. Infra Team")
@ProtoFrom(
    value = "com/apihug/sample/proto/infra/settings/authority.proto",
    entity = "DemoAuthorityEnum",
    kind = Kind.ENUM
)
public enum DemoAuthorityEnum implements Enumeration<DemoAuthorityEnum> {
  NA(-1, "Default Placeholder Should NEVER be used", "默认占位枚举请勿使用"),

  USER_ADD(1, "user:add", "Authority to remove user(Remove or modify this template sample)"),

  USER_DELETE(2, "user:remove", "Authority to delete user(Remove or modify this template sample)"),

  USER_BLOCK(3, "user:block", "Authority to block user");

  public static final List<String> VALUES;

  public static final List<DemoAuthorityEnum> ENUMS;

  public static final List<Integer> CODES;

  public static final Map<String, DemoAuthorityEnum> NAME_2_ENUM_MAP;

  public static final Map<Integer, DemoAuthorityEnum> CODE_2_ENUM_MAP;

  public static final Enumeration.EnumerationsHelper<DemoAuthorityEnum> HELPER;

  static {
    List<String> _VALUES = new ArrayList<>();
    List<DemoAuthorityEnum> _ENUMS = new ArrayList<>();
    List<Integer> _CODES = new ArrayList<>();
    Map<String, DemoAuthorityEnum> _NAME_2_ENUM_MAP = new LinkedHashMap<>();
    Map<Integer, DemoAuthorityEnum> _CODE_2_ENUM_MAP = new LinkedHashMap<>();
    for (DemoAuthorityEnum each : DemoAuthorityEnum.values()) {
    	_VALUES.add(each.title());
    	_ENUMS.add(each);
    	_CODES.add(each.code());
    	_NAME_2_ENUM_MAP.put(each.title(), each);
    	_CODE_2_ENUM_MAP.put(each.code(), each);
    }
    VALUES = Collections.unmodifiableList(_VALUES);
    ENUMS = Collections.unmodifiableList(_ENUMS);
    CODES = Collections.unmodifiableList(_CODES);
    NAME_2_ENUM_MAP = Collections.unmodifiableMap(_NAME_2_ENUM_MAP);
    CODE_2_ENUM_MAP = Collections.unmodifiableMap(_CODE_2_ENUM_MAP);
    HELPER =
    new EnumerationsHelper<DemoAuthorityEnum>() {

    @Override
    public DemoAuthorityEnum mapFromCode(int code) {
    	return CODE_2_ENUM_MAP.getOrDefault(code, NA);
    }

    @Override
    public DemoAuthorityEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
    	return NA;
    }
    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
    }

    @Override
    public Class<DemoAuthorityEnum> supportClz() {
    	return DemoAuthorityEnum.class;
    }

    @Override
    public List<String> supportValues() {
    return VALUES;
    }

    @Override
    public List<DemoAuthorityEnum> supportEnumerations() {
    return ENUMS;
    }

    @Override
    public List<Integer> supportCodes() {
    return CODES;
    }

    };
  }

  public final int code;

  public final String description;

  public final String description2;

  public final boolean deprecated;

  DemoAuthorityEnum(int code, String description, String description2, boolean deprecated) {
    this.code = code;
    this.description = description;
    this.description2 = description2;
    this.deprecated = deprecated;
  }

  DemoAuthorityEnum(int code, String description, String description2) {
    this(code, description, description2, false);
  }

  @Override
  public String title() {
    return name();
  }

  @Override
  public int code() {
    return code;
  }

  @Override
  public String description() {
    return description;
  }

  @Override
  public String description2() {
    return description2 != null ? description2 : description();
  }

  @Override
  public boolean deprecated() {
    return deprecated;
  }

  @Override
  public List<DemoAuthorityEnum> supportEnumerations() {
    return ENUMS;
  }

  @Override
  public List<Integer> supportCodes() {
    return CODES;
  }

  @Override
  public List<String> supportValues() {
    return VALUES;
  }

  @Override
  public DemoAuthorityEnum mapFromCode(int code) {
    if (this.code == code) {
      return this;
    }

    return  CODE_2_ENUM_MAP.getOrDefault(code, NA);
  }

  @Override
  public DemoAuthorityEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
      return NA;
    }

    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
  }
}
