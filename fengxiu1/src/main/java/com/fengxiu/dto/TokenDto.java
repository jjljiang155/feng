package com.fengxiu.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

import javax.validation.constraints.NotBlank;



@Data
public class TokenDto {

    @NotBlank(message = "{accountBlank}")
    private String account;


    private String password;


    private LoginType loginType;



}
