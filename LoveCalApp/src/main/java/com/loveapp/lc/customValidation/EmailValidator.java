package com.loveapp.lc.customValidation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.loveapp.lc.dto.RegistrationDTO;

@Component
public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return RegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		//checking the Registration page mail null or not
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email","email.empty");

		//check mail field have contain cts.com value or not
		String mail = ((RegistrationDTO)target).getCommunicationDTO().getEmail();
		if(!mail.toLowerCase().contains("cts.com")) {
			errors.rejectValue("communicationDTO.email", "email.invaliddomain");
		}

	}

}
