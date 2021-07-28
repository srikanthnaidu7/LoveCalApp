package com.loveapp.lc.dto;

import javax.validation.constraints.NotBlank;

import com.loveapp.lc.customValidation.Age;

public class RegistrationDTO {

	@NotBlank(message = "{name.empty}")
	private String name;
	private String userName;
	private char[] password;
	private String country;
	private String[] hobbies;
	private String gender;
	@Age(lower = 20,upper = 60,message = "{age.validator}")
	private Integer age;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	private CommunicationDTO communicationDTO;
	
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "RegistrationDTO [name=" + name + ", userName=" + userName + ", password=" + password + ", country="
				+ country + ", hobbies=" + hobbies + ", gender=" + gender + "]";
	}
	
	
	
	
}
