package com.fengxiu.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@PropertySource("classpath:config/exception-config.properties")
@ConfigurationProperties(prefix = "feng")
@Component
public class ExceptionConfig {


    private Map<Integer,String> codes = new HashMap<Integer, String>();


    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setCodes(Map<Integer, String> codes) {
        this.codes = codes;
    }


    public String getMessage(Integer code)
    {
        return codes.get(code);
    }
}
