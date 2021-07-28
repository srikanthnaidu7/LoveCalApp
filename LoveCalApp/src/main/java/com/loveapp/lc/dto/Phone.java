package com.loveapp.lc.dto;

import org.springframework.stereotype.Component;

@Component
public class Phone  {
	
	
	private String countrycode;
	private String phoneNumber;
	
	
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return countrycode +"-"+ phoneNumber;
	}
	
	

}
