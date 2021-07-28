/**
 * 
 */
package com.loveapp.lc.customValidation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
/**
 * @author C5286363
 *
 */
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {
	
	String message() default "{age.validator}";
	
	int lower() default 18;
	int upper() default 70; 

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
