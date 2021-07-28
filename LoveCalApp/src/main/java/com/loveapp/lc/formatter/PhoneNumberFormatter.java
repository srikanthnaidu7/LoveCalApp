package com.loveapp.lc.formatter;

import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.loveapp.lc.dto.Phone;

@Component
public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {

		System.out.println("PhoneNumberFormatter class print method:::");

		return phone.getCountrycode() + "-" + phone.getPhoneNumber();
	}

	@Override
	public Phone parse(String phoneNum, Locale locale) throws ParseException {

		System.out.println("PhoneNumberFormatter class Parse method:::");

		Phone phone = new Phone();
		String[] numArr = phoneNum.split("-");
		if ((phoneNum.indexOf('-')) == -1 || phoneNum.startsWith("-")) {
			phone.setCountrycode("91");
			if(phoneNum.startsWith("-"))
			phone.setPhoneNumber(numArr[1]);
			else
				phone.setPhoneNumber(numArr[0]);
		}else {
			phone.setCountrycode(numArr[0]);
			phone.setPhoneNumber(numArr[1]);
		}

		return phone;
	}
}
