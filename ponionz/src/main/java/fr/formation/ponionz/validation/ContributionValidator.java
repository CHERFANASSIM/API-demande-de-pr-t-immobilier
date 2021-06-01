package fr.formation.ponionz.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.ponionz.domain.dtos.RequestCreate;

public class ContributionValidator implements ConstraintValidator<Contribution, RequestCreate> {

	@Override
	public boolean isValid(RequestCreate value, ConstraintValidatorContext context) {

		return value.getAmount() >= (value.getContribution() * 2);

	}

}
