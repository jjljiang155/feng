package com.fengxiu.exception;

import com.fengxiu.exception.http.HttpException;

public class NotFundException extends HttpException {

    public NotFundException(Integer code) {
        super(code);
    }
}
