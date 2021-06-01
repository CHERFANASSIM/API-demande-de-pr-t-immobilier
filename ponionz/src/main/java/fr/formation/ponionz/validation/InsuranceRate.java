package fr.formation.ponionz.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ TYPE, FIELD })
@Constraint(validatedBy = { InsuranceRateValidator.class })

public @interface InsuranceRate {
	String message() default " Votre  choix n'existe pas dans la liste";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
