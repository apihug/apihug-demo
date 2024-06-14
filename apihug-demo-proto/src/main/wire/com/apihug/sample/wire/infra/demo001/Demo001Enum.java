package com.apihug.sample.wire.infra.demo001;

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
        "EXAMPLE_ENUM_GOOD",
        "EXAMPLE_ENUM_BAD"
    },
    example = "EXAMPLE_ENUM_GOOD",
    description = "Example Enum"
)
@Generated("H.O.P.E. Infra Team")
@ProtoFrom(
    value = "com/apihug/sample/proto/infra/demo001/constant.proto",
    entity = "Demo001Enum",
    kind = Kind.ENUM
)
public enum Demo001Enum implements Enumeration<Demo001Enum> {
  NA(-1, "Default Placeholder Should NEVER be used", "默认占位枚举请勿使用"),

  EXAMPLE_ENUM_GOOD(1, "GOOD", "you are good man"),

  EXAMPLE_ENUM_BAD(2, "BAD", "you are bad man");

  public static final List<String> VALUES;

  public static final List<Demo001Enum> ENUMS;

  public static final List<Integer> CODES;

  public static final Map<String, Demo001Enum> NAME_2_ENUM_MAP;

  public static final Map<Integer, Demo001Enum> CODE_2_ENUM_MAP;

  public static final Enumeration.EnumerationsHelper<Demo001Enum> HELPER;

  static {
    List<String> _VALUES = new ArrayList<>();
    List<Demo001Enum> _ENUMS = new ArrayList<>();
    List<Integer> _CODES = new ArrayList<>();
    Map<String, Demo001Enum> _NAME_2_ENUM_MAP = new LinkedHashMap<>();
    Map<Integer, Demo001Enum> _CODE_2_ENUM_MAP = new LinkedHashMap<>();
    for (Demo001Enum each : Demo001Enum.values()) {
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
    new EnumerationsHelper<Demo001Enum>() {

    @Override
    public Demo001Enum mapFromCode(int code) {
    	return CODE_2_ENUM_MAP.getOrDefault(code, NA);
    }

    @Override
    public Demo001Enum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
    	return NA;
    }
    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
    }

    @Override
    public Class<Demo001Enum> supportClz() {
    	return Demo001Enum.class;
    }

    @Override
    public List<String> supportValues() {
    return VALUES;
    }

    @Override
    public List<Demo001Enum> supportEnumerations() {
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

  Demo001Enum(int code, String description, String description2, boolean deprecated) {
    this.code = code;
    this.description = description;
    this.description2 = description2;
    this.deprecated = deprecated;
  }

  Demo001Enum(int code, String description, String description2) {
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
  public List<Demo001Enum> supportEnumerations() {
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
  public Demo001Enum mapFromCode(int code) {
    if (this.code == code) {
      return this;
    }

    return  CODE_2_ENUM_MAP.getOrDefault(code, NA);
  }

  @Override
  public Demo001Enum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
      return NA;
    }

    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
  }
}
