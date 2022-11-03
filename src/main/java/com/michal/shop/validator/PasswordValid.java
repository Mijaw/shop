package com.michal.shop.validator;

import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordValid {
    String message() default "default message";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
