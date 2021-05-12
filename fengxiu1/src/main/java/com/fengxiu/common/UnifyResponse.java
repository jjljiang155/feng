package com.fengxiu.common;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UnifyResponse {

    private int code;
    private String message;
    private String request;

    private Object data;

    public UnifyResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.request = request;
    }

    public static UnifyResponse createSuccess(int code){

        return new UnifyResponse(1,"成功",null);

    }
}
