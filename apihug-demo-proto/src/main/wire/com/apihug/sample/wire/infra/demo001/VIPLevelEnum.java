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
    allowableValues = "GOLD",
    example = "GOLD",
    description = "VIP Level enum for customer"
)
@Generated("H.O.P.E. Infra Team")
@ProtoFrom(
    value = "com/apihug/sample/proto/infra/demo001/constant.proto",
    entity = "VIPLevelEnum",
    kind = Kind.ENUM
)
public enum VIPLevelEnum implements Enumeration<VIPLevelEnum> {
  NA(-1, "Default Placeholder Should NEVER be used", "默认占位枚举请勿使用"),

  GOLD(1, "Top Level VIP", "尊贵客户");

  public static final List<String> VALUES;

  public static final List<VIPLevelEnum> ENUMS;

  public static final List<Integer> CODES;

  public static final Map<String, VIPLevelEnum> NAME_2_ENUM_MAP;

  public static final Map<Integer, VIPLevelEnum> CODE_2_ENUM_MAP;

  public static final Enumeration.EnumerationsHelper<VIPLevelEnum> HELPER;

  static {
    List<String> _VALUES = new ArrayList<>();
    List<VIPLevelEnum> _ENUMS = new ArrayList<>();
    List<Integer> _CODES = new ArrayList<>();
    Map<String, VIPLevelEnum> _NAME_2_ENUM_MAP = new LinkedHashMap<>();
    Map<Integer, VIPLevelEnum> _CODE_2_ENUM_MAP = new LinkedHashMap<>();
    for (VIPLevelEnum each : VIPLevelEnum.values()) {
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
    new EnumerationsHelper<VIPLevelEnum>() {

    @Override
    public VIPLevelEnum mapFromCode(int code) {
    	return CODE_2_ENUM_MAP.getOrDefault(code, NA);
    }

    @Override
    public VIPLevelEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
    	return NA;
    }
    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
    }

    @Override
    public Class<VIPLevelEnum> supportClz() {
    	return VIPLevelEnum.class;
    }

    @Override
    public List<String> supportValues() {
    return VALUES;
    }

    @Override
    public List<VIPLevelEnum> supportEnumerations() {
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

  VIPLevelEnum(int code, String description, String description2, boolean deprecated) {
    this.code = code;
    this.description = description;
    this.description2 = description2;
    this.deprecated = deprecated;
  }

  VIPLevelEnum(int code, String description, String description2) {
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
  public List<VIPLevelEnum> supportEnumerations() {
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
  public VIPLevelEnum mapFromCode(int code) {
    if (this.code == code) {
      return this;
    }

    return  CODE_2_ENUM_MAP.getOrDefault(code, NA);
  }

  @Override
  public VIPLevelEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
      return NA;
    }

    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
  }
}
