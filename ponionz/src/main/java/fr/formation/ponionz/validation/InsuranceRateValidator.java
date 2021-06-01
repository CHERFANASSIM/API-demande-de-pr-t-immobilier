package fr.formation.ponionz.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InsuranceRateValidator implements ConstraintValidator<InsuranceRate, Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {

		List<Integer> programes = new ArrayList<Integer>();
		programes.add(30);
		programes.add(40);
		programes.add(50);
		programes.add(60);
		programes.add(70);

		return programes.contains(value);
	}

}
