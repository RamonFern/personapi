package br.com.rf.personapi.enums;

import lombok.Getter;

@Getter
public enum PhoneType {
	
	HOME("Home"),
	MOBILE("Mobile"),
	COMMERCIAL("Commercial");

	private final String message;

	private PhoneType(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	
	
	
	

}
