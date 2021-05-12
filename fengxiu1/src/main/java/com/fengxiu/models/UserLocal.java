package com.fengxiu.models;


import java.util.HashMap;
import java.util.Map;

public class UserLocal {


    private static ThreadLocal<Map<String,Object>> threadLocal = new ThreadLocal<>();

    public static void set(User user,int scop)
    {
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        map.put("scop",scop);
        threadLocal.set(map);
    }


    public static Map<String,Object> get()
    {
        Map<String, Object> map = threadLocal.get();
        return map;
    }


    public static void clear(){
        threadLocal.remove();
    }


}
