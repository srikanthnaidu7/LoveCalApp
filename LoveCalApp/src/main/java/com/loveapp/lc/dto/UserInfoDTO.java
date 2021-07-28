package com.loveapp.lc.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = "{name.empty}")
	@Size(min = 3 , max = 15 ,message = "{userName.size}")
	private String name;
	private String crushName;
	
	@AssertTrue(message ="* You have to check the Terms and Conditions")
	private boolean termsCond;
	
	public boolean isTermsCond() {
		return termsCond;
	}
	public void setTermsCond(boolean termsCond) {
		this.termsCond = termsCond;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + name + ", crushName=" + crushName + "]";
	}
	
	
	
	
}
