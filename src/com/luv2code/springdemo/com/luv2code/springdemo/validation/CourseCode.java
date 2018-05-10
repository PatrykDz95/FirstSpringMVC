package com.luv2code.springdemo.com.luv2code.springdemo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD})// where can we apply it (methods and fields)
@Retention(RetentionPolicy.RUNTIME) // retaining this annotation in the Java class file
public @interface CourseCode {

    //define default curse code
    public String value() default  "LUV";
    //define default error message
    public String message() default "must start with LUV";

    //define default groups
    public Class<?>[] groups() default {};

    //define default payloads
    public Class<? extends Payload>[] payload() default {};


}
