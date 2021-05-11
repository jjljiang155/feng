package com.fengxiu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FengxiuApplication {


    public static void main(String[] args) {
        SpringApplication.run(FengxiuApplication.class,args);

    }



    @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

}
