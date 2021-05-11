package com.fengxiu.config;

import com.fengxiu.handler.PreAutoUrlRequestMapping;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Component
public class AutoUrlConfigation implements WebMvcRegistrations {


    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
        return new PreAutoUrlRequestMapping();
    }
}
