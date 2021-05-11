package com.fengxiu.handler;

import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

public class PreAutoUrlRequestMapping extends RequestMappingHandlerMapping {


    @Override
    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {

        RequestMappingInfo mappingInfo =super.getMappingForMethod(method, handlerType);

        if (mappingInfo !=null)
        {
            String name = handlerType.getPackage().getName();

            String[] split = name.split("\\.");
            System.out.println(split.toString());
            String s = split[split.length - 1];
            RequestMappingInfo combine = RequestMappingInfo.paths(s).build().combine(mappingInfo);

            return combine;
        }

        return  mappingInfo;
    }
}
