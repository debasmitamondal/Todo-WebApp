package com.in28minutes.login;

public class UserValidationService {
	
	public boolean isValidUser(String name, String password) {
		if(name.equals("Debasmita") && password.equals("12345"))
			return true;
		
		return false;
	}

}
