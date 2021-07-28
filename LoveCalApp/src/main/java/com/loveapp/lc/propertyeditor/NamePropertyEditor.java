package com.loveapp.lc.propertyeditor;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String upperCaseName = text.toUpperCase();
		setValue(upperCaseName);
	}

}
