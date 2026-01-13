package org.junit;


public class PasswordValidator {

    public void validator(String password){
        String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}$";

        if(!password.matches(regex))
            throw new IllegalArgumentException("Invalid Password!");
    }
}
