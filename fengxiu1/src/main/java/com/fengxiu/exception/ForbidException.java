package com.fengxiu.exception;

import com.fengxiu.exception.http.HttpException;

public class ForbidException extends HttpException {

    public ForbidException(Integer code) {
        super(code);
    }
}
