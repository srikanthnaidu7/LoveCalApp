package com.loveapp.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loveapp.lc.dto.EmailDTO;

@Controller
public class EmailController {

	@RequestMapping("/sendEmail/{name}")
	public String sendEmail(@PathVariable("name")String userName,Model model) {
		System.out.println("namesssss:"+userName);
		model.addAttribute("emailDTO",new EmailDTO());
		model.addAttribute("userName",userName.toUpperCase());
		
		
		return "send-email-page";
	}
	
	
	@RequestMapping("/sendEmail/process-email")
	public String processEmail(@ModelAttribute("emailDTO")EmailDTO emailDTO) {
		
		return "process-email-page";
	}
}
