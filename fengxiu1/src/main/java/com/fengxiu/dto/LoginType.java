package com.fengxiu.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum LoginType{

    WX(100),
    ACCOUNT(200);

    private Integer value;

    LoginType(Integer value)
    {
        this.value = value;
    }
    @JsonCreator
    public static LoginType decode(final Integer code) {

        return Stream.of(LoginType.values()).filter(targetEnum -> targetEnum.value.equals(code)).findFirst().orElse(null);
    }

    @JsonValue
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
