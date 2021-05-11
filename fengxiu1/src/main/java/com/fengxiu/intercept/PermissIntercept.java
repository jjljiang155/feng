package com.fengxiu.intercept;

import com.fengxiu.common.JwtUtil;
import com.fengxiu.exception.ForbidException;
import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class PermissIntercept extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (handler instanceof HandlerMethod)
        {
            HandlerMethod handlerMethod = (HandlerMethod)handler;
            ScopLevel annotation = handlerMethod.getMethod().getAnnotation(ScopLevel.class);
            if (annotation != null)
            {
                int value = annotation.value();


                String authorization = request.getHeader("Authorization");

                if (authorization == null)
                {
                    throw  new ForbidException(10006);
                }

                boolean bearer = authorization.startsWith("Bearer");

                if (!bearer)
                {
                    throw  new ForbidException(10006);
                }


                String[] s = authorization.split(" ");
                if (s.length != 2)
                {
                    throw  new ForbidException(10006);
                }
                String token = s[1];

                Claims claims = JwtUtil.parseJWT(token);

                Integer scop = (Integer) claims.get("scop");

                if (scop > value)
                {
                    return true;
                }else
                {
                    throw  new ForbidException(10006);
                }

            }

        }





        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }


}
