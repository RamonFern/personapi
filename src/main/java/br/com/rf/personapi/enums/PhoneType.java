package br.com.rf.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
	
	HOME("Home"),
	MOBILE("Mobile"),
	COMMERCIAL("Commercial");
	
	

	private final String message;

	private PhoneType(String message) {
		this.message = message;
	}
	
	
	

}
