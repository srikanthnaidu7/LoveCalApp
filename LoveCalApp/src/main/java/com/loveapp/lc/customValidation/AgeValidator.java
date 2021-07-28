package com.loveapp.lc.customValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer>{

	private int lower;
	private int upper;
	
	@Override
	public void initialize(Age age) {
		this.lower = age.lower();
		this.upper = age.upper();
		
	}
	
	
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		System.out.println("Validator isvalid():::");
		if(age == null) {
			return false;
		}else if(age < lower || age > upper) {
			return false;
		}
		return true;
	}

}
