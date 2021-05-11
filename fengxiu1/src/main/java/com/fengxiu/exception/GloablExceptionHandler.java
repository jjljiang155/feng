package com.fengxiu.exception;


import com.fengxiu.config.ExceptionConfig;
import com.fengxiu.exception.http.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.List;

@ControllerAdvice
public class GloablExceptionHandler {

    @Autowired
    private ExceptionConfig exceptionConfig;

    @ExceptionHandler(Exception.class)
    public void commonExceptionHandle()
    {

    }


    @ExceptionHandler(HttpException.class)
    public ResponseEntity httpException(HttpException e)
    {
        Integer code = e.getCode();
        String message = exceptionConfig.getMessage(code);

        ResponseEntity<String> body = ResponseEntity.badRequest().body(message);
        return  body;
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e)
    {
        List<ObjectError> allErrors = e.getBindingResult().getAllErrors();


        ObjectError objectError = allErrors.get(0);
        String defaultMessage = objectError.getDefaultMessage();

        ResponseEntity<String> body = ResponseEntity.badRequest().body(defaultMessage);
        return  body;
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity constraintViolationException(ConstraintViolationException e)
    {

        String defaultMessage =  e.getMessage();

        ResponseEntity<String> body = ResponseEntity.badRequest().body(defaultMessage);
        return  body;
    }


}
