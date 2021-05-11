package com.fengxiu.valid;

import com.fengxiu.dto.PersonDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidtedClassImpl implements ConstraintValidator<PasswordValidate, PersonDto> {


    public boolean isValid(PersonDto personDto, ConstraintValidatorContext constraintValidatorContext) {



        return personDto.getPassword1().equals(personDto.getPassword2());
    }
}
