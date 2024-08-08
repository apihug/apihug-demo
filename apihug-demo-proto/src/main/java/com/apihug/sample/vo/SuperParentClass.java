package com.apihug.sample.vo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * this for the Wire proto extension
 * {@code  resources/wire-poet.properties} will contain this configurations
 */

@JsonSubTypes({
        //@JsonSubTypes.Type(name = "one", value = ExampleRequest.class)
})
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "__type",
        defaultImpl = SuperParentClass.class)
public class SuperParentClass {

}
