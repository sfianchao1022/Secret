package org.eden.lovestation.util.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CustomDateValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomDateConstraint {
    String message() default "invalid date format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
