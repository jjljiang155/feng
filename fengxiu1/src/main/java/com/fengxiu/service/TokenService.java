package com.fengxiu.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fengxiu.common.JwtUtil;
import com.fengxiu.dao.UserDao;
import com.fengxiu.exception.NotFundException;
import com.fengxiu.models.User;
import com.fengxiu.models.WXresp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

@Service
public class TokenService {


    @Autowired
    private UserDao userDao;

    public User login(String account, String password) throws Exception {

        User user = userDao.findOneByMobile(account);


        if ( password != null && user.getPassword().equals(password))
        {
            return user;
        }

        throw new NotFundException(10005);
    }


    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${wx.appsecret}")
    private String appsecret;
    @Value("${wx.appid}")
    private String appid;
    @Value("${wx.code2session}")
    private String code2session;



    public String wxLogin(String account) throws Exception {

        String url = MessageFormat.format(code2session,appid,appsecret,account);
        String forObject = restTemplate.getForObject(url, String.class);
        WXresp wXresp = null;
        try {
            wXresp = objectMapper.readValue(forObject, WXresp.class);
            User user = userDao.findByOpenid(wXresp.getOpenid());

            if (user == null)
            {
                User newuser = new User();
                newuser.setOpenid(wXresp.getOpenid());
                userDao.save(newuser);
                Map<String,Object> map = new HashMap<>();
                map.put("scop",10);

                map.put("uid",newuser.getId());
              return   JwtUtil.createJWT(map);

            }else
            {
                Map<String,Object> map = new HashMap<>();
                map.put("scop",10);

                map.put("uid",user.getId());
               return JwtUtil.createJWT(map);
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println(forObject);

        throw new NotFundException(10005);
    }



}
