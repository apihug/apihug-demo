package com.apihug.sample.wire.api;

import com.apihug.sample.wire.infra.demo001.Demo001Enum;
import com.apihug.sample.wire.infra.demo001.VIPLevelEnum;
import com.apihug.sample.wire.infra.settings.DemoAuthorityEnum;
import hope.common.Builder;
import hope.common.service.Collector;
import hope.common.service.api.Authorization;
import hope.common.service.api.Component;
import hope.common.service.api.ComponentItem;
import hope.common.service.api.Validation;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.SpecVersion;
import io.swagger.v3.oas.models.callbacks.Callback;
import io.swagger.v3.oas.models.examples.Example;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.links.Link;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.tags.Tag;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public final class SampleApiCollector implements Collector<OpenAPI, Schema, ApiResponse, Parameter, Example, RequestBody, Header, SecurityScheme, Link, Callback, Tag> {
  public static final String COMPONENTS_SCHEMAS_REF = Components.COMPONENTS_SCHEMAS_REF;

  protected final OpenAPI api;

  protected final Map<String, Map> servicesContext = new LinkedHashMap();

  protected final Map<String, Map> pathsContext = new LinkedHashMap();

  protected final Map<String, Schema> schemas = new LinkedHashMap();

  protected final Map<String, ApiResponse> responses = new LinkedHashMap();

  protected final Map<String, Parameter> parameters = new LinkedHashMap();

  protected final Map<String, Example> examples = new LinkedHashMap();

  protected final Map<String, RequestBody> requestBodies = new LinkedHashMap();

  protected final Map<String, Header> headers = new LinkedHashMap();

  protected final Map<String, SecurityScheme> securitySchemes = new LinkedHashMap();

  protected final Map<String, Link> links = new LinkedHashMap();

  protected final Map<String, Callback> callbacks = new LinkedHashMap();

  protected final Map<String, Tag> tags = new LinkedHashMap();

  protected final Map<String, Object> extensions = new LinkedHashMap();

  protected final Map<String, String> pathClzMap = new HashMap();

  protected final Map<String, Set<String>> clzPathMap = new HashMap();

  protected final Map<String, Map> clzContextMap = new LinkedHashMap();

  protected final Map<String, Component> componentMap = new LinkedHashMap();

  public SampleApiCollector() {
    this.api =  new OpenAPI();
    Components components = new Components();
    components.setSchemas(schemas);
    components.responses(responses);
    components.setParameters(parameters);
    components.setRequestBodies(requestBodies);
    components.setHeaders(headers);
    components.setExamples(examples);
    components.setSecuritySchemes(securitySchemes);
    components.setLinks(links);
    components.setCallbacks(callbacks);
    components.setExtensions(extensions);
    api.components(components);
    api.setPaths(new Paths());
    _init();
  }

  @Override
  public OpenAPI getApi() {
    return api;
  }

  @Override
  public Map<String, Map> getServicesContext() {
    return servicesContext;
  }

  @Override
  public Map<String, Map> getPathsContext() {
    return pathsContext;
  }

  @Override
  public Map<String, Schema> getSchemas() {
    return schemas;
  }

  @Override
  public Map<String, ApiResponse> getResponses() {
    return responses;
  }

  @Override
  public Map<String, Parameter> getParameters() {
    return parameters;
  }

  @Override
  public Map<String, Example> getExamples() {
    return examples;
  }

  @Override
  public Map<String, RequestBody> getRequestBodies() {
    return requestBodies;
  }

  @Override
  public Map<String, Header> getHeaders() {
    return headers;
  }

  @Override
  public Map<String, SecurityScheme> getSecuritySchemes() {
    return securitySchemes;
  }

  @Override
  public Map<String, Link> getLinks() {
    return links;
  }

  @Override
  public Map<String, Callback> getCallbacks() {
    return callbacks;
  }

  @Override
  public Map<String, Tag> getTags() {
    return tags;
  }

  @Override
  public Map<String, Object> getExtensions() {
    return extensions;
  }

  @Override
  public Map<String, String> getPathClzMap() {
    return pathClzMap;
  }

  @Override
  public Map<String, Set<String>> getClzPathMap() {
    return clzPathMap;
  }

  @Override
  public Map<String, Map> getClzContextMap() {
    return clzContextMap;
  }

  @Override
  public Map<String, Component> getComponentMap() {
    return componentMap;
  }

  public void registerPathClz(String path, String clz) {
    pathClzMap.put(path, clz);
    clzPathMap.computeIfAbsent(clz, s -> new LinkedHashSet<>()).add(path);
  }

  private final void _build_service_com_apihug_sample_wire_api_demo001_Demo001Service() {
    // ----------------------------------------------------
    // START-[Service Context] com.apihug.sample.wire.api.demo001.Demo001Service
    Map sc = servicesContext.computeIfAbsent("com.apihug.sample.wire.api.demo001.Demo001Service", s-> new LinkedHashMap());
    sc.put("description", "Demo-001");
    sc.put("protoFrom", "com/apihug/sample/proto/api/demo001/api.proto");
    sc.put("protoEntity", "Demo001Service");
    sc.put("basePath", "/demo-001");
    List<String> sc_paths = new ArrayList();
    sc.put("paths", sc_paths);
    // --------------------------
    // Register Path of this Service: [1] "/demo-001/hello-world"
    sc_paths.add("/demo-001/hello-world");
    Map _sc_paths_item_1 = pathsContext.computeIfAbsent("/demo-001/hello-world", s-> new LinkedHashMap());
    _sc_paths_item_1.put("action", "GET");
    _sc_paths_item_1.put("method", "ExampleSayHello");
    _sc_paths_item_1.put("wrapper", true);
    _sc_paths_item_1.put("pageable", false);
    _sc_paths_item_1.put("request", false);
    _sc_paths_item_1.put("response", false);
    _sc_paths_item_1.put("session", false);
    _sc_paths_item_1.put("inputPlural", false);
    _sc_paths_item_1.put("outputPlural", false);
    _sc_paths_item_1.put("priority", "HIGH");
    _sc_paths_item_1.put("requestRef", "hope.common.adaptor.Empty");
    _sc_paths_item_1.put("responseRef", "hope.common.adaptor.Empty");
    _sc_paths_item_1.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        List<String> _tags = new ArrayList();
        _tags.add("project");
        operation.setTags(_tags);
        operation.setDescription("Say hello to the world");
        return operation;
      }
    }.build());
    _sc_paths_item_1.put("group", "CUSTOMER");
    _sc_paths_item_1.put("empty", false);
    // END-[Service Context] com.apihug.sample.wire.api.demo001.Demo001Service
    // ----------------------------------------------------
  }

  private final void _build_service_com_apihug_sample_wire_api_demo001_VIPService() {
    // ----------------------------------------------------
    // START-[Service Context] com.apihug.sample.wire.api.demo001.VIPService
    Map sc = servicesContext.computeIfAbsent("com.apihug.sample.wire.api.demo001.VIPService", s-> new LinkedHashMap());
    sc.put("description", "Service for VIP");
    sc.put("protoFrom", "com/apihug/sample/proto/api/demo001/api.proto");
    sc.put("protoEntity", "VIPService");
    sc.put("basePath", "/vip");
    List<String> sc_paths = new ArrayList();
    sc.put("paths", sc_paths);
    // --------------------------
    // Register Path of this Service: [1] "/vip/get-sth"
    sc_paths.add("/vip/get-sth");
    Map _sc_paths_item_1 = pathsContext.computeIfAbsent("/vip/get-sth", s-> new LinkedHashMap());
    _sc_paths_item_1.put("action", "GET");
    _sc_paths_item_1.put("method", "GetMeSth");
    _sc_paths_item_1.put("wrapper", true);
    _sc_paths_item_1.put("pageable", false);
    _sc_paths_item_1.put("request", false);
    _sc_paths_item_1.put("response", false);
    _sc_paths_item_1.put("session", false);
    _sc_paths_item_1.put("inputPlural", false);
    _sc_paths_item_1.put("outputPlural", false);
    _sc_paths_item_1.put("priority", "HIGH");
    _sc_paths_item_1.put("requestRef", "hope.common.adaptor.Empty");
    _sc_paths_item_1.put("responseRef", "hope.common.adaptor.Empty");
    _sc_paths_item_1.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        List<String> _tags = new ArrayList();
        _tags.add("user");
        operation.setTags(_tags);
        operation.setDescription("Get me something");
        return operation;
      }
    }.build());
    _sc_paths_item_1.put("authorization", new Builder<Authorization>() {
      @Override
      public Authorization build() {
        Authorization res = new Authorization();
        res.setRoles(Set.of("ADMIN"));
        res.addAuthority(DemoAuthorityEnum.USER_DELETE);
        res.setCombinator(Authorization.Combinator.AND);
        return res;
      }
    }.build());
    _sc_paths_item_1.put("group", "CUSTOMER");
    _sc_paths_item_1.put("empty", false);
    _sc_paths_item_1.put("questions", Arrays.asList("how to do something","I want to buy a apple","Jake want to eat something spicy"));
    // --------------------------
    // Register Path of this Service: [2] "/vip/post-test"
    sc_paths.add("/vip/post-test");
    Map _sc_paths_item_2 = pathsContext.computeIfAbsent("/vip/post-test", s-> new LinkedHashMap());
    _sc_paths_item_2.put("action", "POST");
    _sc_paths_item_2.put("method", "GiveMePost");
    _sc_paths_item_2.put("wrapper", true);
    _sc_paths_item_2.put("pageable", false);
    _sc_paths_item_2.put("request", false);
    _sc_paths_item_2.put("response", false);
    _sc_paths_item_2.put("session", false);
    _sc_paths_item_2.put("inputPlural", false);
    _sc_paths_item_2.put("outputPlural", false);
    _sc_paths_item_2.put("priority", "LOW");
    _sc_paths_item_2.put("requestRef", "com.apihug.sample.wire.api.demo001.values.ExampleRequest");
    _sc_paths_item_2.put("responseRef", "hope.common.adaptor.Empty");
    _sc_paths_item_2.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("test post example");
        return operation;
      }
    }.build());
    _sc_paths_item_2.put("group", "CUSTOMER");
    _sc_paths_item_2.put("empty", false);
    // END-[Service Context] com.apihug.sample.wire.api.demo001.VIPService
    // ----------------------------------------------------
  }

  private final void _build_component_com_apihug_sample_wire_api_demo001_values_ExampleRequest() {
    //  Build of the component: ExampleRequest proto: com/apihug/sample/proto/api/demo001/values/request.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.sample.wire.api.demo001.values.ExampleRequest", res);
    res.setClzName("com.apihug.sample.wire.api.demo001.values.ExampleRequest");
    res.setName("ExampleRequest");
    res.setProtoFrom("com/apihug/sample/proto/api/demo001/values/request.proto");
    res.setProtoEntity("ExampleRequest");
    res.setDescription("This is an example request");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("This is an example request");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 name
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("name");
    _0.setFieldName("name");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("name of the user");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("My Lord");
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _0.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("nature", "NAME");
        res.put("name", "nature");
        return res;
      }
    }.build());
    res.addItem(_0);
  }

  private final void _build_component_com_apihug_sample_wire_api_demo001_values_SampleRequest() {
    //  Build of the component: SampleRequest proto: com/apihug/sample/proto/api/demo001/values/request.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.sample.wire.api.demo001.values.SampleRequest", res);
    res.setClzName("com.apihug.sample.wire.api.demo001.values.SampleRequest");
    res.setName("SampleRequest");
    res.setProtoFrom("com/apihug/sample/proto/api/demo001/values/request.proto");
    res.setProtoEntity("SampleRequest");
    res.setDescription("A sample plain object definition");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("A sample plain object definition");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 age
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.Long");
    _0.setName("age");
    _0.setFieldName("age");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("age of human");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("Example of this field");
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 name
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("name");
    _1.setFieldName("name");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("name of a chinese people");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    _1.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _1.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("type", "NAME");
        res.put("name", "cname");
        return res;
      }
    }.build());
    res.addItem(_1);
  }

  private final void _build_component_com_apihug_sample_wire_infra_demo001_Demo001Enum() {
    //  Build of the component: Demo001Enum proto: com/apihug/sample/proto/infra/demo001/constant.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.sample.wire.infra.demo001.Demo001Enum", res);
    res.setClzName("com.apihug.sample.wire.infra.demo001.Demo001Enum");
    res.setEnumClz(true);
    res.setName("Demo001Enum");
    res.setPayload(new Builder<Schema<Demo001Enum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Example Enum");
        List<Demo001Enum> values  = new ArrayList();
        values.add(Demo001Enum.EXAMPLE_ENUM_GOOD);
        values.add(Demo001Enum.EXAMPLE_ENUM_BAD);
        res.setDefault(Demo001Enum.EXAMPLE_ENUM_GOOD);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_sample_wire_infra_demo001_VIPLevelEnum() {
    //  Build of the component: VIPLevelEnum proto: com/apihug/sample/proto/infra/demo001/constant.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.sample.wire.infra.demo001.VIPLevelEnum", res);
    res.setClzName("com.apihug.sample.wire.infra.demo001.VIPLevelEnum");
    res.setEnumClz(true);
    res.setName("VIPLevelEnum");
    res.setPayload(new Builder<Schema<VIPLevelEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("VIP Level enum for customer");
        List<VIPLevelEnum> values  = new ArrayList();
        values.add(VIPLevelEnum.GOLD);
        res.setDefault(VIPLevelEnum.GOLD);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_sample_wire_infra_settings_DemoAuthorityEnum() {
    //  Build of the component: DemoAuthorityEnum proto: com/apihug/sample/proto/infra/settings/authority.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.sample.wire.infra.settings.DemoAuthorityEnum", res);
    res.setClzName("com.apihug.sample.wire.infra.settings.DemoAuthorityEnum");
    res.setEnumClz(true);
    res.setName("DemoAuthorityEnum");
    res.setPayload(new Builder<Schema<DemoAuthorityEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Example Authority Enum for the project, MODIFY IT");
        List<DemoAuthorityEnum> values  = new ArrayList();
        values.add(DemoAuthorityEnum.USER_ADD);
        values.add(DemoAuthorityEnum.USER_DELETE);
        values.add(DemoAuthorityEnum.USER_BLOCK);
        res.setDefault(DemoAuthorityEnum.USER_ADD);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _merger_api() {
    Info _info =  new Info();
    Contact _contact =  new Contact();
    License _license =  new License();
    ExternalDocumentation _external_documentation =  new ExternalDocumentation();
    Map<String,Object> _infoExtensions =  new LinkedHashMap();
    Map<String,Object> _extensions =  new LinkedHashMap();
    Map<String,Object> _lsExtensions =  new LinkedHashMap();
    Map<String,Object> _ctExtensions =  new LinkedHashMap();
    Map<String,Object> _ex_doc_extensions =  new LinkedHashMap();
    api.setInfo(_info);
    api.setExtensions(_extensions);
    _external_documentation.setExtensions(_ex_doc_extensions);
    api.setExternalDocs(_external_documentation);
    _contact.setExtensions(_ctExtensions);
    _info.setContact(_contact);
    _license.setExtensions(_lsExtensions);
    _info.setLicense(_license);
    _info.setExtensions(_infoExtensions);
    new Builder<String>() {
      @Override
      public String build() {
        _info.setTitle("apihug-demo-proto");
        _info.setDescription("API definition of Demo project for apihug");
        _info.setVersion("0.1.1-SNAPSHOT");
        _contact.setName("developer@apihug.com");
        _contact.setUrl("https://github.com/apihug/");
        _contact.setEmail("developer@apihug.com");
        _external_documentation.setUrl("https://github.com/apihug/");
        _external_documentation.setDescription("Hope is the best thing");
        return "DONE";
      }
    }.build();
    tags.put("sample", new Builder<Tag>() {
      @Override
      public Tag build() {
        Tag res  = new Tag();
        res.setName("sample");
        res.setDescription("Sample Tag");
        return res;
      }
    }.build());
  }

  private void _init() {
    // Build For Service com.apihug.sample.wire.api.demo001.Demo001Service
    _build_service_com_apihug_sample_wire_api_demo001_Demo001Service();
    // Build For Service com.apihug.sample.wire.api.demo001.VIPService
    _build_service_com_apihug_sample_wire_api_demo001_VIPService();
    // Build for Component : com.apihug.sample.wire.api.demo001.values.ExampleRequest
    _build_component_com_apihug_sample_wire_api_demo001_values_ExampleRequest();
    // Build for Component : com.apihug.sample.wire.api.demo001.values.SampleRequest
    _build_component_com_apihug_sample_wire_api_demo001_values_SampleRequest();
    // Build for Enum :com.apihug.sample.wire.infra.demo001.Demo001Enum
    _build_component_com_apihug_sample_wire_infra_demo001_Demo001Enum();
    // Build for Enum :com.apihug.sample.wire.infra.demo001.VIPLevelEnum
    _build_component_com_apihug_sample_wire_infra_demo001_VIPLevelEnum();
    // Build for Enum :com.apihug.sample.wire.infra.settings.DemoAuthorityEnum
    _build_component_com_apihug_sample_wire_infra_settings_DemoAuthorityEnum();
    // Build OpenAPI information
    _merger_api();
    api.tags(new ArrayList<>(tags.values()));
  }
}
