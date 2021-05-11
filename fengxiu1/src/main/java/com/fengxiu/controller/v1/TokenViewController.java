package com.fengxiu.controller.v1;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fengxiu.common.JwtUtil;
import com.fengxiu.dto.LoginType;
import com.fengxiu.dto.TokenDto;
import com.fengxiu.models.User;
import com.fengxiu.service.TokenService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/token")
public class TokenViewController {



        @Autowired
        private TokenService tokenService;

        @RequestMapping("login")

        public Map<String,Object> login(@RequestBody @Validated TokenDto model) throws Exception
        {



            LoginType loginType = model.getLoginType();

            Map<String,Object> map = new HashMap<>();

            switch (loginType)
            {
                case WX:
                    String token = tokenService.wxLogin(model.getAccount());
                    map.put("token",token);
                    System.out.println("token："+token);
                    return map;

                case ACCOUNT:

                  User user = tokenService.login(model.getAccount(),model.getPassword());

                  System.out.println(user);

            }



            return null;
        }


    @RequestMapping("vertoken/{token}")
    public Boolean vertoken(@PathVariable String token)
    {
        try {
            Claims claims = JwtUtil.parseJWT(token);
        }catch (Exception e)
        {
            return false;
        }

        return true;

    }
}
