package com.fengxiu.valid;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Constraint(validatedBy = PasswordValidtedClassImpl.class)
public @interface PasswordValidate {

     String message() default "";

     Class<?>[] groups() default {};

     Class<? extends Payload>[] payload() default {};





}
