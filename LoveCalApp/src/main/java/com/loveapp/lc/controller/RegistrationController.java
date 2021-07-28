package com.loveapp.lc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loveapp.lc.customValidation.EmailValidator;
import com.loveapp.lc.customValidation.UsernameValidator;
import com.loveapp.lc.dto.CommunicationDTO;
import com.loveapp.lc.dto.Phone;
import com.loveapp.lc.dto.RegistrationDTO;
import com.loveapp.lc.propertyeditor.NamePropertyEditor;


@Controller
public class RegistrationController {

	@Autowired
	private UsernameValidator usernameValidator;
	@Autowired
	private EmailValidator emailValidator;
	
	@RequestMapping("/reg")
	public String showRegpage(@ModelAttribute("registrationInfo") RegistrationDTO registrationInfo) {
		
		Phone phone = new Phone();
		phone.setCountrycode("91");
		phone.setPhoneNumber("123456789");
		
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		
		registrationInfo.setCommunicationDTO(communicationDTO);
		
		return "registration-page";
	}
	
	
	@RequestMapping("/process-registration-page")
	public String showResultPage(@Valid @ModelAttribute("registrationInfo") RegistrationDTO registrationInfo, BindingResult result) {
		System.out.println("Name:"+registrationInfo.getName());
		System.out.println("User Name:"+registrationInfo.getUserName());
		System.out.println("Password:"+registrationInfo.getPassword());
		System.out.println("Country:"+registrationInfo.getCountry());
		System.out.println("Hobbies:"+registrationInfo.getHobbies());
		System.out.println("Gender:"+registrationInfo.getGender());
		System.out.println("Age:"+registrationInfo.getAge());
		
		if(result.hasErrors()) {
			System.out.println("Has error::");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError objectError : errors) {
				System.out.println("error:"+objectError);
			}
			return "registration-page";
		}
		
		return "registration-result-page";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		NamePropertyEditor namePropertyEditor = new NamePropertyEditor();
		//binder.registerCustomEditor(String.class, "name", namePropertyEditor);
		
		binder.registerCustomEditor(String.class, namePropertyEditor);
		
		binder.addValidators(usernameValidator);
		binder.addValidators(emailValidator);
	}
}
