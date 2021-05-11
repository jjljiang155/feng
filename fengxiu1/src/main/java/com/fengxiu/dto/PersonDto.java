package com.fengxiu.dto;


import com.fengxiu.valid.PasswordValidate;
import lombok.Data;

@Data
@PasswordValidate(message = "密码不一样")
public class PersonDto {


    private String password1;

    private String password2;
}
