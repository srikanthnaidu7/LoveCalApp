package com.loveapp.lc.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loveapp.lc.dto.UserInfoDTO;

@Controller
public class LoveAppController {

	@RequestMapping("/")
	public String showHomepage(@ModelAttribute("userInfo") UserInfoDTO userInfo,HttpServletRequest request) {
		
		Cookie[] cookies =  request.getCookies();
		for(Cookie temp: cookies) {
			
			String myUserName = temp.getValue();
			System.out.println("username:cooke:"+myUserName);
			userInfo.setName(myUserName);
		}
		
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfo,BindingResult result,
			HttpServletResponse response) {
		
		System.out.println("check box :"+userInfo.isTermsCond());
		if(result.hasErrors()) {
			System.out.println("Has error::");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError objectError : errors) {
				System.out.println("error:"+objectError);
			
			}
			
			
			return "home-page";
		}
		
		
		
		//create a cookie for the user name
		Cookie theCookie = new Cookie("LcApp.userName", userInfo.getName());
		theCookie.setMaxAge(60*60*24);
		
		//add cookie to the response
		response.addCookie(theCookie);
		
		return "result-page";
	}
	
}
