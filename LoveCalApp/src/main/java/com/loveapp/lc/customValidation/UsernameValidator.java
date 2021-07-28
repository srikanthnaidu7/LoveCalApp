package com.loveapp.lc.customValidation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.loveapp.lc.dto.RegistrationDTO;

@Component
public class UsernameValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		
		return RegistrationDTO.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {

		//checking the Registration page username null or not
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName","userName.notEmpty");
		
		//check username field have contain _ value or not
		String username = ((RegistrationDTO)target).getUserName();
		if(!username.contains("_")) {
			errors.rejectValue("userName", "userName.invalidString");
		}
		
	}

}
